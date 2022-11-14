/* Implementar una aplicaci�n para calcular datos estad�sticos de las edades de los alumnos de un 
 * centro educativo. Se introducir�n datos hasta que uno de ellos sea negativo, y se mostrar�: 
 * la suma de todas las edades introducidas, la media, el n�mero de alumnos y cu�ntos son mayores 
 * de edad.*/

package Tema3;

import java.util.Scanner;

public class datosEstadisticos {

	public static void main(String[] args) {

		int suma = 0;
		int contador = 0;
		int mayorEdad = 0;

		System.out.print("Introduzca la edad del " + (contador + 1) + "� alumno :");
		int edad = introEdad();

		while (edad > 0) {

			suma = suma + edad;
			contador++;
			if (edad >= 18) {
				mayorEdad++;
			}

			System.out.print("Introduzca la edad del " + (contador + 1) + "� alumno :");
			edad = introEdad();

		}

		System.out.println("El n�mero de alumnos introducidos es: " + contador + " alumnos");
		System.out.println("La suma de todas las edades es: " + suma + " a�os");
		System.out.println("La media de las edades introducidos es: " + (suma / contador) + " a�os");
		System.out.println("El n�mero de alumnnos mayores de edad es: " + mayorEdad + " alumnos");

	}

	private static int introEdad() {
		Scanner teclado = new Scanner(System.in);

		int edad = teclado.nextInt();
		return edad;
	}

}
