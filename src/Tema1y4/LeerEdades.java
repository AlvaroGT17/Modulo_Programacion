package Tema1y4;
//Otro ejemplo.Tenemos un programa que lee 4 edades por teclado y antes de leer cada edad muestra un mensaje en consola indicando lo que se pide:

import java.util.Scanner;

public class LeerEdades {
	static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		
		

		System.out.print("Dame primera edad: ");
		short ed1 = sc.nextShort();

		System.out.print("Dame segunda edad: ");
		short ed2 = sc.nextShort();

		System.out.print("Dame tercera edad: ");
		short ed3 = sc.nextShort();

		System.out.print("Dame cuarta edad: ");
		short ed4 = sc.nextShort();

		float media = (ed1 + ed2 + ed3 + ed4) / 4;

		System.out.printf("\nLa edad media es: %,5.2f %n", media);
	}
}