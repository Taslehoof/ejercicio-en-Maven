package servicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dominio.*;

public class Servicio implements IServicio {

	public void cargarDatos() {

		ServicioGrua grua1 = new ServicioGrua("Mirage", "4452874", 150.0);

		Taller taller1 = new Taller();
		taller1.setNombre("Tuerca");		
		taller1.setHabilitado(true);

		Ubicacion ubicacion = new Ubicacion();
		ubicacion.setCiudad(Ciudad.NEUQUEN);
		ubicacion.setDomicilio("Santa Fe");
		ubicacion.setNumero(355);
		ubicacion.setTelefono("0299-4424434");

		Propietario propietario1 = new Propietario();
		propietario1.setNombre("Andres");
		propietario1.setApellido("Aguirre");
		propietario1.setDocumento(11111111);
		propietario1.setTelefono("299-4243378");

		Propietario propietario2 = new Propietario();
		propietario1.setNombre("Benito");
		propietario1.setApellido("Bermudez");
		propietario1.setDocumento(22222222);
		propietario1.setTelefono("299-4583378");

		Propietario propietario3 = new Propietario();
		propietario1.setNombre("Carlos");
		propietario1.setApellido("Carlin");
		propietario1.setDocumento(3333333);
		propietario1.setTelefono("299-4235578");

		Automovil automovil1 = new Automovil();
		automovil1.setMatricula("OZN010");
		automovil1.setFechaIngreso(LocalDate.of(2013, 11, 5));
		automovil1.setMarca("Renault");
		automovil1.setModelo("Clio Mio");

		Camioneta camioneta1 = new Camioneta();
		camioneta1.setMatricula("AR279UV");
		camioneta1.setFechaIngreso(LocalDate.of(2010, 5, 10));
		camioneta1.setTipoMotor(TipoMotor.GASOLERO);

		Motocicleta motocicleta1 = new Motocicleta();
		motocicleta1.setMatricula("BR178NU");
		motocicleta1.setFechaIngreso(LocalDate.of(2012, 3, 25));
		motocicleta1.setCilindrada(800);
		motocicleta1.setNumeroCilindros(1500);
		motocicleta1.setTipo("Enduro");

		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		vehiculos.add(automovil1);
		vehiculos.add(camioneta1);
		vehiculos.add(motocicleta1);

		taller1.setVehiculos(vehiculos);

		repositorio.guardarTaller(taller1);

	}

	public void listarTalleres() {
		List<Taller> talleres = repositorio.listarTalleres();
		
		for (Taller t : talleres) {
			System.out.println(t);
		}
	}

	public void findByNombreTaller() {
		List<Taller> talleres = repositorio.findByNombreTaller("nombre");

		for (Taller t : talleres) {
			System.out.println(t);
		}
	}

	public void findByNombreTallerPrimerosCaracteres() {
		List<Taller> talleres = repositorio.findByNombreTallerPrimerosCaracteres("ingreso");

		for (Taller t : talleres) {
			System.out.println(t);
		}
	}

	public void findByPrecioAcarreoMenorA() {
		List<Taller> talleres = repositorio.findByPrecioAcarreoMenorA();

		for (Taller t : talleres) {
			System.out.println(t);
		}
	}

	public void findByHabilitados() {
		List<Taller> talleres = repositorio.findByHabilitados();

		for (Taller t : talleres) {
			System.out.println(t);
		}
	}
	
	
	public void findByFechaIngreso() {
		List<Taller> talleres = repositorio.findByFechaIngreso();

		for (Taller t : talleres) {
			System.out.println(t);
		}
	}

	public void findByTipoVehiculosMoto() {
		List<Taller> talleres = repositorio.findByTipoVehiculosMoto();

		for (Taller t : talleres) {
			System.out.println(t);
		}
	}

	public void findByVehiculoOrdenado() {
		List<Vehiculo> vehiculos = repositorio.findByVehiculoOrdenado();

		for (Vehiculo v : vehiculos) {
			System.out.println(v);
		}
	}
}
