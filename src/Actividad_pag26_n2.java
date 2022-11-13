// Escribir una aplicación que pida el año actual y el de nacimiento del usuario. Debe calcular su edad, suponiendo que en el año actual
// ya ha cumplido años.

// Lo primero que haremos sera importar la bibliotecas necearias.

import java.util.Scanner;

public class Actividad_pag26_n2 {

	public static void main(String[] args) {

		// Ahora lo que haremos sera crear el objeto que capture lo ingresado por
		// teclado.
		Scanner user = new Scanner(System.in);

		// Ahora interactuaremos con el usuario para que nos diga el año en el que
		// estamos y su año de nacimiento.
		System.out.println("Ingrese el año en curso: ");
		int year = user.nextInt();
		System.out.println("Ingrese el año de nacimiento:");
		int yearBirth = user.nextInt();

		// Ahora lo que haremos es la operación aritmetica para resolber el problema.
		int currentYears = year - yearBirth;

		// Por ultimo mostraremos el resultado del programa.

		System.out.print("Los años que tiene actualmente son: " + currentYears + " años.");

	}

}
