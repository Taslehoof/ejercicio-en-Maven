package repositorio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.JDOQLTypedQuery;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;

import dominio.*;

public class Repositorio implements IRepositorio {

	private List<Taller> desatarTalleres(List<Taller> talleresAttached, PersistenceManager pm) {

		List<Taller> talleres = new ArrayList<Taller>();

		for (Taller t : talleresAttached) {

			Taller taller = new Taller();
			taller.setNombre(t.getNombre());
			taller.setHabilitado(t.isHabilitado());
			taller.setServicioGrua(pm.detachCopy(t.getServicioGrua()));
			taller.setUbicacion(pm.detachCopy(t.getUbicacion()));
			taller.setVehiculos((List<Vehiculo>) pm.detachCopyAll(t.getVehiculos()));

			talleres.add(taller);
		}
		return talleres;
	}

	public void guardarTalleres(List<Taller> talleres) {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();

		try {
			tx.begin();
			pm.makePersistentAll(talleres);
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
	}

	public void guardarTaller(Taller taller) {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			pm.makePersistent(taller);
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
	}

	public List<Taller> listarTalleres() {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		List<Taller> taller;
		try {
			tx.begin();
			Extent<Taller> ex = pm.getExtent(Taller.class);
			Query q = pm.newQuery(ex);
			List<Taller> tallerAttached = (List<Taller>) q.execute();
			taller = desatarTalleres(tallerAttached, pm);
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return taller;
	}

	public List<Taller> findByNombreTaller(String nombre) {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		List<Taller> talleres;
		try {
			tx.begin();

			JDOQLTypedQuery tq = pm.newJDOQLTypedQuery(Taller.class);
			QTaller candidato = QTaller.candidate();
			List<Taller> talleresAttached = tq.filter(candidato.nombre.eq(tq.stringParameter("nombreIngresado")))
					.setParameter("nombreIngresado", nombre).executeList();
			talleres = desatarTalleres(talleresAttached, pm);
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return talleres;
	}

	public List<Taller> findByNombreTallerPrimerosCaracteres(String ingreso) {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		List<Taller> talleres;
		try {
			tx.begin();

			JDOQLTypedQuery tq = pm.newJDOQLTypedQuery(Taller.class);
			QTaller candidato = QTaller.candidate();
			List<Taller> talleresAttached = tq
					.filter(candidato.nombre.startsWith(tq.stringParameter("nombreIngresado")))
					.setParameter("nombreIngresado", ingreso).executeList();
			talleres = desatarTalleres(talleresAttached, pm);
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return talleres;
	}

	public List<Taller> findByPrecioAcarreoMenorA(double precio) {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		List<Taller> talleres;
		try {
			tx.begin();

			JDOQLTypedQuery tq = pm.newJDOQLTypedQuery(Taller.class);
			QTaller candidato = QTaller.candidate();
			QVehiculo variable = QVehiculo.variable("var");

			List<Taller> talleresAttached = tq
					.filter(candidato.vehiculos.contains(variable)
							.and(variable.taller.servicioGrua.precioAcarreo.lt(tq.numericParameter("precioIngresado"))))
					.setParameter("precioIngresado", precio).executeList();

			talleres = desatarTalleres(talleresAttached, pm);
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return talleres;
	}

	public List<Taller> findByHabilitados() {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		List<Taller> talleres;
		try {
			tx.begin();

			JDOQLTypedQuery tq = pm.newJDOQLTypedQuery(Taller.class);
			QTaller candidato = QTaller.candidate();

			List<Taller> talleresAttached = tq.filter(candidato.habilitado.eq(true)).executeList();
			talleres = desatarTalleres(talleresAttached, pm);
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return talleres;
	}

	public List<Taller> findByFechaIngreso(LocalDate fecha) {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		List<Taller> talleres;
		try {
			tx.begin();

			JDOQLTypedQuery tq = pm.newJDOQLTypedQuery(Taller.class);
			QVehiculo candidato = QVehiculo.candidate();
			List<Taller> talleresAttached = tq.filter(candidato.fechaIngreso.lteq(fecha)).executeList();
			talleres = desatarTalleres(talleresAttached, pm);
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return talleres;
	}

	public List<Taller> findByTipoVehiculosMoto() {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		List<Taller> talleres = null;
		try {
			tx.begin();

			JDOQLTypedQuery tq = pm.newJDOQLTypedQuery(Taller.class);
			QTaller candidato = QTaller.candidate();
			QVehiculo variable = QVehiculo.variable("var");
			List<Taller> talleresAttached = tq
					.filter(candidato.vehiculos.contains(variable).and(variable.instanceOf(Motocicleta.class))).executeList();
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return talleres;
	}

	public List<Vehiculo> findByVehiculoOrdenado() {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		List<Vehiculo> vehiculos;
		
		try {
			tx.begin();

			JDOQLTypedQuery tq = pm.newJDOQLTypedQuery(Vehiculo.class);
			QVehiculo candidato = QVehiculo.candidate();

			List<Vehiculo> vehiculosAttached = tq.orderBy(candidato.matricula.asc()).executeList();
			pm.detachCopyAll(vehiculosAttached);
			vehiculos=vehiculosAttached;
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		pm.detachCopyAll(vehiculos);
		return vehiculos;
	}

	@Override
	public List<Taller> findByPrecioAcarreoMenorA() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Taller> findByFechaIngreso() {
		// TODO Auto-generated method stub
		return null;
	}

}
