package Tema3;

import java.util.Scanner;

public class tabla_multiplicar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Indique de que tabla quiere mostrar: ");
		int num=teclado.nextInt();
		teclado.nextLine();
		
		int mult=0;
		int i;
		
		for (i=0; i<=10; i++) {
			mult=num*i;
			System.out.println(num + " x " + i + " = " + mult);
		}
			
			
		

	}

}
