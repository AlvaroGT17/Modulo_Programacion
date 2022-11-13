import java.util.Scanner;

public class Ejercicio2_pizarra_20221026 {

	public static void main(String[] args) {

		// declaramos la variable "n" que nos recogera el numero introducido por el
		// teclado
		int n;

		// llamamos a la funcion leer para recibir el numero a analizar
		n = leer();

		// llamamos a la funcion selleccionador pasandole la variable "n"
		boolean resultado = sleccionador(n);
		
		System.out.print("El numero " + n + " Es capicua? " + resultado);

	}

	// Esta funcion lo que no ara sera recoger un numero que el usuario a
	// introducido por teclado.
	static int leer() {

		Scanner teclado = new Scanner(System.in);
		int numero1 = 0;

		try {

			System.out.print("Ingrese un numero comprendido entre 0 y 9999: ");
			numero1 = teclado.nextInt();
			teclado.nextLine();

		} catch (java.util.InputMismatchException control) {
			System.out.println("Numero mal introducido");

		}

		return numero1;

	}

	// Esta funcion lo que nos va a hacer es segun el numero de digitos que tiene el
	// numero llamara a otra
	// funcion que nos diga si es capicua o no.
	static boolean sleccionador(int n) {
		
		int num = n;
		int num1;
		int r1;
		int num2;
		int r2;
		int num3;
		int r3;
		boolean solucion;
		
		num1 = num / 10;
		r1 = num % 10;
		num2 = num1 / 10;
		r2 = num1 % 10;
		num3 = num2 / 10;
		r3 = num2 % 10;
		
		if (n < 10) {
			
			solucion= true;
			 
		} else if (n < 100) {
			
			solucion =  (num1 == r1) ? true : false;
			
		} else if (n < 1000) {
			
			solucion = (num3 == r2) ? true: false;
			
		} else {
			
			solucion = (num3 == r1 && r3 == r2) ? true: false;
		}
		
		return solucion;

	}

}
