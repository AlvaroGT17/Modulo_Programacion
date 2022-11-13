package Tema1y4;
/*Escribir un programa que solicite las notas del primer, segundo y tercer trimestre (notas enteras que se solicitarán al 
 * usuario). El programa debe mostrar la nota media del curso como se utiliza en el boletín de calificaciones (solo la parte
 * entera) y como se usa en el expediente académico (con decimales). 
 */

import java.util.Scanner;

public class Actividad_pag37_n1 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int note1;
		int note2;
		int note3;
		double halfProceedings;
		int halfBulleting;

		
		try {
			System.out.print("Introduzca la nota del primer trimestre: ");
			note1 = teclado.nextInt();
			System.out.print("Introduzca la nota del segundo trimestre: ");
			note2 = teclado.nextInt();
			System.out.print("Introduzca la nota del tercer trimestre: ");
			note3 = teclado.nextInt();

			// calculamos la media con decimales y el 3.0 fuerza una división real

			halfProceedings = (note1 + note2 + note3) / 3.0;

			// convertimos un valor double en un valor int, truncando la parte decimal.

			halfBulleting = (int) halfProceedings;

			System.out.println("Boletín de calificaciones: " + halfBulleting);
			System.out.printf("Expediente académico: %,5.2f", halfProceedings);

		} catch (Exception e) {

			System.out.println("ERROR: el valor introducido tiene un formato erroneo.");

		}

	}
}
