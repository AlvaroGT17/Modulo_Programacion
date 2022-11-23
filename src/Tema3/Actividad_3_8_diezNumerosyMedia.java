package Tema3;

import java.util.Scanner;

public class Actividad_3_8_diezNumerosyMedia {

	public static void main(String[] args) {
		
		int cont=0;
		int suma=0;
		double med=0;
		
		while (cont<10) {
		int num = ingresarnum();
		suma = suma + num;
		cont++;
		}
		med = suma /10;
		
		
		System.out.println("La suma total de los números introducidos es: " + suma);
		System.out.println("La media de los números introducidos es: " + med);

	}

	private static int ingresarnum() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese un número: ");
		int num = teclado.nextInt();
		teclado.nextLine();
		
		return num;
		
	}

}
