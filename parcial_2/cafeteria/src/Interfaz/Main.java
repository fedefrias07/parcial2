package Interfaz;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Datos.Cafe;
import Datos.Encargado;
import Datos.Venta;

public class Main {

	public static void main(String[] args) {

		Encargado encargado1 = new Encargado(001, "Jose");

		final double latte = 1.50;
		final double flat_white = 2.50;
		final double lagrima = 1.30;
		final double expresso = 1.00;

		ArrayList<Venta> ventas = new ArrayList<Venta>();

		ventas.add(new Venta(1, new Cafe("LATTE"), 2, latte, true));
		ventas.add(new Venta(1, new Cafe("FLAT WHITE"), 2, flat_white, true));
		ventas.add(new Venta(1, new Cafe("LAGRIMA"), 2, lagrima, true));
		ventas.add(new Venta(1, new Cafe("EXPRESSO"), 2, expresso, true));

		Scanner entrada = new Scanner(System.in);

		boolean salir = false;

		int opcion;

		System.out.println("Cafe\n");

		while (!salir) {

			System.out.println("\n1. Mostrar ventas.\n");
			System.out.println("2. Cargar ventas y ver total recaudado.\n");
			System.out.println("3. Terminar el dia.\n");

			try {

				opcion = entrada.nextInt();

				switch (opcion) {
				case 1:

					for (int i = 0; i < ventas.size(); i++) {
						encargado1.mostrarVentas(ventas.get(i).getCafe(), ventas.get(i));
					}

					break;
				case 2:

					double total_latte, total_flat, total_lagrima, total_expreso, total_recaudado;

					Scanner entrada1 = new Scanner(System.in);

					System.out.println("Ingrese cantidad de LATTE vendidos hoy: ");

					int cantidad_latte = entrada1.nextInt();

					//
					Scanner entrada2 = new Scanner(System.in);

					System.out.println("Ingrese cantidad de FLAT WHITE vendidos hoy: ");

					int cantidad_flat = entrada2.nextInt();

					//

					Scanner entrada3 = new Scanner(System.in);

					System.out.println("Ingrese cantidad de LAGRIMA vendidos hoy: ");

					int cantidad_lagrima = entrada3.nextInt();

					//

					Scanner entrada4 = new Scanner(System.in);

					System.out.println("Ingrese cantidad de EXPRESSO vendidos hoy: ");

					int cantidad_expresso = entrada4.nextInt();

					total_latte = cantidad_latte * latte;

					total_flat = cantidad_flat * latte;

					total_lagrima = cantidad_lagrima * latte;

					total_expreso = cantidad_expresso * latte;

					total_recaudado = total_latte + total_flat + total_lagrima + total_expreso;

					System.out.println("--> Total recaudado " + total_recaudado);

					break;
				case 3:
					salir = true;
					break;

				default:
					System.err.println("Porfavor, ingrese una opcion entre 1 y 3.");
					break;
				}

			} catch (InputMismatchException e) {
				System.err.println("No ingrese letras, debe que ser un numero entre 1 y 3.");
				entrada.next();

			}

		}
		System.err.println("Termino su dia, que tenga buen regreso :).");

	}

}