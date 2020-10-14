package repositorio;

import java.time.LocalDate;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

import dominio.Taller;
import dominio.Vehiculo;

public interface IRepositorio {

	PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("PostgreSQL");

	void guardarTalleres(List<Taller> talleres);

	void guardarTaller(Taller taller);

	List<Taller> listarTalleres();

	List<Taller> findByNombreTaller(String nombre);

	List<Taller> findByNombreTallerPrimerosCaracteres(String ingreso);

	List<Taller> findByPrecioAcarreoMenorA(double precio);

	List<Taller> findByHabilitados();

	List<Taller> findByFechaIngreso(LocalDate fecha);

	List<Taller> findByTipoVehiculosMoto();

	List<Vehiculo> findByVehiculoOrdenado();

	List<Taller> findByPrecioAcarreoMenorA();

	List<Taller> findByFechaIngreso();

}
