package Tema3;

import java.util.Scanner;

public class Eco {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int veces = 0;
		
		System.out.print("Ingrese el número de ecos que desea hacer: ");
		veces=teclado.nextInt();
		teclado.nextLine();
		
		for (int i=0; i<veces; i++) {
			System.out.println("Eco...");
		}
	}

}
