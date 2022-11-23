/*Proceso repetitivo donde se leerán los datos de 5 alumnos. Los datos a leer son:
Nombre de alumno.
Número de asignaturas que tiene (entre 1 y 6, si no se cumple se lee de nuevo).
Después de leer el número de asignaturas que tiene, tenemos que leer el nombre y la nota de
cada asignatura (entre 1 y 10, si no se cumple se lee de nuevo). (hacer proceso repetitivo para
la lectura de estos datos)
Una vez leídas las notas y asignaturas mostraremos la nota media del alumno.
Visualizar al final del proceso de lectura de datos el nombre de alumno con mayor nota media
y el nombre de alumno con menor nota media. Visualizar también su nota media.*/

package Tema3;

import java.util.Scanner;

public class Ejercicio1_pag18 {

	public static void main(String[] args) {

		double nmax=0;
		double nmin=9999;
		
		for (int i = 1; i <= 5; i++) {

			String nombre = leernombre();
			int nAsignaturas = asignaturas();
			double suma=0;
			
			for(int j=1; j<=nAsignaturas; j++) {
				
				String nomasigna = leernombreasig();
				double nota = leernota();
				if ( nota < 1 || nota > 10) {
					
					nota= leernota();
				}
				
				System.out.println("====================================================");
				System.out.println("El nombre del alumno es:" + nombre);
				System.out.println("\tLa " + j + "º asignatura es:" + nomasigna);
				suma= suma+nota;
				
				
			}
			
			double notaMedia = suma/nAsignaturas;
			System.out.println("\tLa nota media del alumno es: " + notaMedia);
			
			if (nmax < notaMedia) {
				nmax=notaMedia;
			}
			
			if (nmin> notaMedia) {
				nmin=notaMedia;
			}

		}

	}

	private static double leernota() {
		
			Scanner teclado = new Scanner(System.in);
			System.out.print("Ingrese la nota del alumno: ");
			double num = teclado.nextInt();
			teclado.nextLine();
			return num;
		}
	
	private static int asignaturas() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el numero de asignaturas: ");
		int num = teclado.nextInt();
		teclado.nextLine();
		return num;
	}

	private static String leernombreasig() {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el nombre de la asignatura: ");
		String nombre = teclado.nextLine();
		return nombre;
	}
	
	private static String leernombre() {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el nombre del alumno: ");
		String nombre = teclado.nextLine();
		return nombre;
	}

}
