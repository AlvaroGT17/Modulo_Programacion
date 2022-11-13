/*
 * Escribir un programa que calcule el dinero recaudado en un concierto. La aplicación solicitará el 
 * aforo máximo del local, el precio por entrada (suponemos que todas las entradas tienen el mismo precio) 
 * y el número de entradas vendidas. Hay que tener en cuenta que si el número de entradas vendidas no 
 * supera el 20 % del aforo del lo cal, se cancela el concierto. Si el número de entradas vendidas no 
 * supera el 50 % del aforo del local, se realiza una rebaja del 25 % del precio de la entrada.
 */

package Tema2;

import java.util.Scanner;

public class Ejercicio_2_pag_66 {

	public static void main(String[] args) {

		System.out.print("Ingrese el numero de aforo: ");
		int aforo = introducirnumero();
		System.out.print("Ingrese el precio de la entrada: ");
		final int precio = introducirnumero();
		System.out.print("Ingrese el numero de entradas vendidas: ");
		int entradasven = introducirnumero();
		int recaudacion = 0;

		double porcentaje = comprobaciondeporcentaje(aforo, entradasven);

		if (porcentaje < 20) {
			System.out.println("El concierto ha sido cancelado");
			recaudacion = 0;

		} else {
			if (porcentaje > 20 && porcentaje < 50) {
				double entradarebajada = rebaja(precio);
				System.out.println("Las entradas han quedado con un precio de: " + entradarebajada);
				recaudacion = entradasven * (int)entradarebajada;

			} else {
				recaudacion = entradasven * precio;
			}
		}
		
		System.out.print("Importe recaudado con el concierto: " + recaudacion);

	}

	private static double rebaja(int precio) {

		double cantidad = (25 * precio) / 100;

		return cantidad;
	}

	private static double comprobaciondeporcentaje(int aforo, int entradasven) {

		double porcen = (entradasven * 100) / aforo;

		return porcen;
	}

	private static int introducirnumero() {

		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();

		return num;
	}

}
