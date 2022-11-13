/*
 * En una granja se compra diariamente una cantidad ( comidaDiaria ) de comida para los animales. 
 * El número de animales que alimentar ( todos de la misma especie ) es numAnimales , y sabemos
 * que cada animal come una media de kilosPorAnimal . Diseña un programa que solicite al usuario 
 * los valores anteriores y determine si dispone mos de alimento suficiente para cada animal. 
 * En caso negativo , ha de calcular cuál es la ración que corresponde a cada uno de los animales. 
 * Nota : Evitar que la aplicación realice divisiones por cero .
 */

package Tema2;

import java.util.Scanner;

public class Ejercicio13_pag_70 {

	public static void main(String[] args) {

		System.out.println("Introduzca el numero de kilos de comida comprados hoy: ");
		int comidaDiaria = introducirnumero();
		System.out.println("Introduzca el numero de animales que hay que alimentar: ");
		int numanimales = introducirnumero();
		System.out.println("Introduzca la media de kilos por animal que se consume: ");
		double kilosPorAnimal = introducirnumerob();

		comprovacion(comidaDiaria, numanimales, kilosPorAnimal);
		
		

	}

	private static void comprovacion(int comidaDiaria, int numanimales, double kilosPorAnimal) {
		
		double cantidadDeComidaNecesaria= numanimales*kilosPorAnimal;
		
		if (comidaDiaria > cantidadDeComidaNecesaria){
			System.out.println("Hay suficientte comida para todos los animales");
		}else {
			recalcular(comidaDiaria, numanimales);
		}
	}

	private static void recalcular(int comidaDiaria, int numanimales) {
		
		if (comidaDiaria==0) {
			System.out.println("No se puede llevar a cabo la acción tiene que haber como minimo un animal");
		}else {
			double comidarecalculada= comidaDiaria/numanimales;
			System.out.println("La nueva cantidad de comida que le toca a cada animal es: " + comidarecalculada);
		}
		
	}

	private static double introducirnumerob() {

		Scanner teclado = new Scanner(System.in);
		double num = teclado.nextInt();

		return num;
	}

	private static int introducirnumero() {

		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();

		return num;
	}

}
