package aplicacion;

import java.util.Scanner;

import servicio.*;

public class Menu {
	static private int opcion;

	public static void mostrar() {

		System.out.println("Bienvenido!");
		Scanner sc = new Scanner(System.in);
		IServicio servicio = new Servicio();

		do {
			System.out.println("************************************* \n"
					+ "Ingrese 1  Para pre carga de datos de TALLERES \n"
					+ "************************************* \n"
					+ "Ingrese 2  Para listar todos los TALLERES \n"
					+ "************************************* \n"
					+ "Ingrese 3  Para buscar un TALLER por su nombre completo \n"
					+ "************************************* \n"
					+ "Ingrese 4  Para buscar TALLERES por sus primeros caracteres \n"
					+ "************************************* \n"
					+ "Ingrese 5  Para listar TALLERES por su precio maximo de acarreo \n"
					+ "************************************* \n" + "Ingrese 6  Para listar TALLERES habilitados \n"
					+ "************************************* \n"
					+ "Ingrese 7  Para listar TALLERES por fecha de ingreso de un vehiculo \n"
					+ "************************************* \n"
					+ "Ingrese 8  Para listar TALLERES que contegan Motocicletas \n"
					+ "************************************* \n"
					+ "Ingrese 9  Para listar Vehiculos ordenados por Matricula \n"
					+ "************************************* \n" 
					+ "Para salir ingrese 0");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				servicio.cargarDatos();
				System.out.println("\n");
				System.out.println("La carga del método de MIERDAAAAAAAAA!!!!!!");
				break;
			case 2:
				System.out.println("\n");
				servicio.listarTalleres();
				break;
			case 3:
				servicio.findByNombreTaller();
				break;
			case 4:
				servicio.findByNombreTallerPrimerosCaracteres();
				break;
			case 5:
				servicio.findByPrecioAcarreoMenorA();
				break;
			case 6:
				servicio.findByHabilitados();
				break;
			case 7:
				servicio.findByFechaIngreso();
				break;
			case 8:
				servicio.findByTipoVehiculosMoto();
				break;
			case 9:
				servicio.findByVehiculoOrdenado();
				break;
			case 0:
				System.out.println("saliendo del sistema");
				break;
			default:
				System.out.println("error");
			}
		} while (opcion != 0);

	}

}
