package Tema3;

import java.util.Scanner;

public class multiplosDe7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Indique de que n?mero quiere sacar los n?meros primos: ");
		int num=teclado.nextInt();
		teclado.nextLine();
		
		int mult=0;
		int i;
		
		for (i=0; mult<100; i++) {
			System.out.println(mult);
			mult=num*i;
			
		}
			
			
		

	}

}
