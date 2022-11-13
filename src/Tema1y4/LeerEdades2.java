package Tema1y4;
import java.util.Scanner;

public class LeerEdades2 {
	static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		short ed1 = LeerNumero("Dame primera edad: ");
		short ed2 = LeerNumero("Dame segunda edad: ");
		short ed3 = LeerNumero("Dame tercera edad: ");
		short ed4 = LeerNumero("Dame cuarta edad: ");

		float media = (ed1 + ed2 + ed3 + ed4) / 4;

		System.out.printf("\nLa edad media es: %,5.2f %n", media);

	}

	private static short LeerNumero(String m) {

		System.out.print(m);

		short ed = 0; // se inicializa fuera por que si se inicia dentro del try no debolvera el valor
						// por ser interna de try

		try {
			ed = sc.nextShort();
		} catch (java.util.InputMismatchException ex) {
			System.out.print("error de lectura");
		}

		return ed;
	}
}