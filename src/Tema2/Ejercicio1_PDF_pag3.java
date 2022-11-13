package Tema2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1_PDF_pag3 {

	public static void main(String[] args) {

		int number = leer();
		comparador(number);
		
	}

	

	private static int leer() {

		Scanner teclado = new Scanner(System.in);
		int num = 0;
		
		try {
			
			
			System.out.print("Ingrese un número: ");
			num=teclado.nextInt();
			teclado.nextLine();
		
		}catch (InputMismatchException es){
			
			System.out.print("El formato introducido no es correcto.");
			teclado.nextLine();
		}
		
		return num;
	}
	
	private static void comparador(int number) {
	
		if (number>0) {
			
			System.out.print("El número " + number + " es mayor que 0");
			
		}
			
		}
}
