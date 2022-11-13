import java.util.Scanner;

public class OpIncrementales {

	public static void main(String[] args) {
		// Leer por teclado 2 números enteros y mostrar la suma, el producto, la
		// división y la resta.

		Scanner number = new Scanner(System.in);

		System.out.println("Ingrese el primer número: ");
		int number1 = number.nextInt();
		System.out.println("Ingrese el segudo número: ");
		int number2 = number.nextInt();

		int addition = number1 + number2;
		int subtraction = number1 - number2;
		int product = number1 * number2;
		int division = number1 / number2;

		System.out.println(
				"El resultado de la suma del nº " + number1 + " más el nº " + number2 + " es igual a: " + addition);
		System.out.println("El resultado de la resta entre el nº " + number1 + " menos el nº " + number2
				+ " es igual a: " + subtraction);
		System.out.println("El resultado de la multiplicación del nº " + number1 + " por el nº " + number2
				+ " es igual a: " + product);
		System.out.println("El resultado de la división entre el nº " + number1 + " y el nº " + number2
				+ " es igual a: " + division);
		
	}

}
