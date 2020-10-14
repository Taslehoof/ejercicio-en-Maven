package servicio;

import java.time.LocalDate;
import java.util.Scanner;

import repositorio.*;

public interface IServicio {

	IRepositorio repositorio = new Repositorio();

	Scanner scanner = new Scanner(System.in);

	void cargarDatos();

	void listarTalleres();

	void findByNombreTaller();

	void findByNombreTallerPrimerosCaracteres();

	void findByPrecioAcarreoMenorA();

	void findByHabilitados();

	void findByFechaIngreso();

	void findByTipoVehiculosMoto();

	void findByVehiculoOrdenado();

}
