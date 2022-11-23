/* Al ejercicio anterior se añade que hay que visualizar la asignatura con más nota para cada alumno.
En lugar de ser 5 alumnos, que sean N alumnos, donde N se leerá de teclado.*/

package Tema3;

import java.util.Scanner;

public class Ejercicio2_pag18 {

	public static void main(String[] args) {

		// declaramos las variables---------------------------------------------------------------
		
		double nmax=0;
		double nmin=9999;
		double notaasig=0;
		double suma=0;
		String nommax="";
		String nommin="";
		String nombreasig="";
		
		// Ingresamos el numero de alumnos----------------------------------------------------------
		
		System.out.println("Ingrese el número de alumnos a ebaluar");
		int nalum = leernum();
		
		// iniciamos el bucle principal--------------------------------------------------------------
		
		for (int i = 1; i <= nalum; i++) {
			
			System.out.println("==============================================================");
			System.out.print("Ingrese el nombre del alumno: ");
			String nombre = leernombre();
			int nAsignaturas = leernum();
			
			// este do while se encarga que la carga por teclado del numero de asignaturas sea correcto.
			
			do {
			if ( nAsignaturas < 1 || nAsignaturas > 6) {
				
				nAsignaturas= leernum();
			}
			}while (nAsignaturas >1 || nAsignaturas < 6);
			
			// con el siguiente for introducimos el nombre y las notas de cada una de las asignaturas.
			
			for(int j=1; j<=nAsignaturas; j++) {
				
				System.out.printf("\t Ingrese el nombre de la asignatura: ");
				String nomasigna = leernombre();
				
				System.out.printf("\t Ingrese la nota del alumno: ");
				double nota = leernota();
				
				// con este do while nos aseguramos que la nota introducida este dentro del rango permitido
				
				do {
					if (nota < 1 || nota>10) {
						nota = leernota();
					}
				}while (nota >=1 || nota <=10);

				// con este if conseguimos saber cual es la asignatura con mejor nota y su nombre
				
				if (nota > notaasig) {
					notaasig=nota;
					nombreasig=nomasigna;
				}
				
				// con esta variable hacemos la suma de todas las notas conseguidas por el alumno para mas tarde hacer la media.	

				suma= suma+nota;
				
				
			}
			
			double notaMedia = suma/nAsignaturas;
			System.out.println("\t La nota media del alumno es: " + notaMedia);
			
			// con los siguientes dos if consegimos saber cual a sido el alumno con mayor nota y su nombre y el que menos nota a sacado.
			
			if (nmax < notaMedia) {
				nmax=notaMedia;
				nommax=nombre;
			}
			
			if (nmin> notaMedia) {
				nmin=notaMedia;
				nommin=nombre;
			}

			// las siguientes impresiones muestran toda la informacion requerida por el ejercicio.
			
			System.out.println(" ********************************************************************************");
			System.out.println(" El alumno con mayor nota media es: " + nommax + "con una nota de: " + notaMedia);
			System.out.println(" y su mejor asignatura es: " + nombreasig + "con una nota de: " + notaasig +"\n");
			System.out.println(" El alumno con menor nota media es: " + nommin + "con una nota de: " + notaMedia);
			System.out.println(" ********************************************************************************");
			}

	}

	// Los siguientes metodos proporcionan valores a las variables del programa
	
	private static double leernota() {

		Scanner teclado = new Scanner(System.in);
		double num = 0;
		num = teclado.nextInt();
		teclado.nextLine();
		
		return num;
	}

	private static int leernum() {

		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		teclado.nextLine();

		return num;

	}

	private static String leernombre() {

		Scanner teclado = new Scanner(System.in);
		String nombre = teclado.nextLine();
		return nombre;
	}

}
