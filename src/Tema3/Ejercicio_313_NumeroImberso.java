package Tema3;

import java.util.Scanner;

public class Ejercicio_313_NumeroImberso {

	public static void main(String[] args) {
		
		int num=tecladonum();
		int cociente=0;
		int resto=0;
		
		do {
			cociente=num/10;
			resto=num%10;
			System.out.print(resto);
			num=cociente;
			
		} while (cociente != 0);
		
		
	}

	private static int tecladonum() {
		System.out.print("Ingrese un numero ");
		Scanner teclado= new Scanner(System.in);
		int num=teclado.nextInt();
		teclado.nextLine();
		return num;
	}

}
