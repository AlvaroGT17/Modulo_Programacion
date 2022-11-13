/*
 * Solicita al usuario tres distancias : 
 * La primera , medida en milímetros . 
 * La segunda , medida en centímetros .
 * La última , medida en metros . Diseña un programa que muestre la suma de las tres longitudes introducidas
 * ( medida en centímetros ) .
 */

import java.util.Scanner;

public class Actividad_pag42_n19 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double measure1;
		double measure2;
		double measure3;
		double result;

		System.out.print("Ingrese la primera medida esta se recogera en milimetros: ");
		measure1 = teclado.nextDouble();
		System.out.print("Ingrese la segunda medida esta se recogera en centimetros: ");
		measure2 = teclado.nextDouble();
		System.out.print("Ingrese la tercera medida esta se recogera en metros: ");
		measure3 = teclado.nextDouble();

		measure1 = measure1 / 10;
		measure3 = measure3 * 10;
		result = measure1 + measure2 + measure3;

		System.out.print("La suma de las distancia es de: " + result + " cm.");

	}

}
