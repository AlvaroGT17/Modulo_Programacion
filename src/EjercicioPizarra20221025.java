import java.util.Scanner;

public class EjercicioPizarra20221025 {

	public static void main(String[] strg) {

		int numero = leer();

	}

static int leer() {

		Scanner teclado = new Scanner(System.in);
		int numero1 = 0;

		try {

			System.out.print("Ingrese un numero: ");
			numero1 = teclado.nextInt();
			teclado.nextLine();

		} catch (java.util.InputMismatchException control) {
			System.out.println("Dígito mal introducido");

		}

		return numero1;

	}
}