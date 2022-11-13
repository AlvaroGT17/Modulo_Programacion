import java.util.Scanner;

public class ActividadPizarra_20221018 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame un número: ");

		int number = teclado.nextInt();

		if (number > 0) {

			System.out.println("El Número es mayor que 0");
			System.out.println("Dame un swegundo número: ");
			int number2 = teclado.nextInt();
			System.out.println("La suma de los dos numeros es: " + (number + number2));

		}

	}

}
