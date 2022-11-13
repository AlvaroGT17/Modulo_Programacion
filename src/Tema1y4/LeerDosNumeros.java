package Tema1y4;
import java.util.Scanner;

public class LeerDosNumeros {

	public static void main(String[] args) {
		// Leer por teclado 2 números decimales y mostrar la suma, el producto, la
		// división y la resta.

		// creamos el objeto que escaneara lo que entre por teclado.
		Scanner number = new Scanner(System.in);

		// Mostramos por pantalla el mensaje para que el usuario nos facilite los
		// números y scaneamos la entrada por teclado.
		System.out.println("Ingrese el primer número:");
		double number1 = number.nextDouble();
		System.out.println("Ingrese el segundo número:");
		double number2 = number.nextDouble();

		// Realizamos las operaciones que nos pide el ejerccio.
		double addition = number1 + number2;
		double subtraction = number1 - number2;
		double product = number1 * number2;
		double division = number1 / number2;

		// Mostramos por pantalla el resultado del programa.
		System.out.println(
				"El resultado de la suma del nº " + number1 + " más el " + number2 + " es igual a: " + addition);
		System.out.println("El resultado de la resta entre el nº " + number1 + " menos el nº " + number2
				+ " es igual a: " + subtraction);
		System.out.println("El resultado de la multiplicación del nº " + number1 + " por el nº " + number2
				+ " es igual a: " + product);
		System.out.println("El resultado de la división entre el nº " + number1 + " y el nº " + number2
				+ " es igual a: " + division);

	}

}
