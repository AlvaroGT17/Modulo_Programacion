package Tema3;

import java.util.Scanner;

public class Ejercicio15_pag21 {

	public static void main(String[] args) {
		
		System.out.print("Ingrese el numero que quiere transformar: ");
		
		int num = leernum();
		long totalpotencia=0;
		int contador=0;
		long resultado=0;
		
		while (num/2>1) {
									
			int restodivision = num%2;
			num=num/2;
			totalpotencia= (long) (restodivision* Math.pow(10, contador));
			resultado=resultado+totalpotencia;
			contador++;

		}
		
		System.out.print("El resultado de la combersion es: " + resultado);
		
		//System.out.print("El resultado de la combersión es: " + restoTotal);

	}

	private static int leernum() {

		Scanner teclado = new Scanner(System.in);

		int num;

		do {
			num = teclado.nextInt();
		} while (num < 0);

		return num;
	}
	
}
