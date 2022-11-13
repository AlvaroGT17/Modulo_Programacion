package Tema2;

import java.util.Scanner;

public class Ejercicio14_pag_70_v2 {

	public static void main(String[] args) {

		System.out.print("Introdudca un numero comprendido entre 0 y 99: ");

		int num = introducirnumero();
		int unidades = descomuni(num);
		int decenas = descondece(num);
		conversio(num, unidades, decenas);

	}

	private static void conversio(int num, int unidades, int decenas) {

		switch (num) {
		
		case 0 -> System.out.print("Cero");
		case 1 -> System.out.print("Uno");
		case 2 -> System.out.print("Dos");
		case 3 -> System.out.print("Tres");
		case 4 -> System.out.print("Cuatro");
		case 5 -> System.out.print("Cinco");
		case 6 -> System.out.print("Seis");
		case 7 -> System.out.print("Siete");
		case 8 -> System.out.print("Ocho");
		case 9 -> System.out.print("Nueve");
		case 10 -> System.out.print("Diez");
		case 11 -> System.out.print("Once");
		case 12 -> System.out.print("Doce");
		case 13 -> System.out.print("Trece");
		case 14 -> System.out.print("Catorce");
		case 15 -> System.out.print("Quince");
		case 16 -> System.out.print("Diec");
		case 17 -> System.out.print("Siete");
		case 18 -> System.out.print("Ocho");
		case 19 -> System.out.print("Nueve");
		default -> {switch (decenas) {
					case 3 -> System.out.print("Treinta");
					case 4 -> System.out.print("Cuarenta");
					case 5 -> System.out.print("Cincuenta");
					case 6 -> System.out.print("Sesenta");
					case 7 -> System.out.print("Setenta");
					case 8 -> System.out.print("Ochenta");
					case 9 -> System.out.print("Noventa");
		}
		}
		}
		
		if (decenas>=3 && unidades !=0) {
			
			System.out.print(" y ");
			switch (unidades) {
			
			case 1 -> System.out.print("uno");
			case 2 -> System.out.print("dos");
			case 3 -> System.out.print("tres");
			case 4 -> System.out.print("cuatro");
			case 5 -> System.out.print("cinco");
			case 6 -> System.out.print("seis");
			case 7 -> System.out.print("siete");
			case 8 -> System.out.print("ocho");
			case 9 -> System.out.print("nueve");
			}
		}

	}

	private static int descondece(int num) {

		int unidades;
		int decenas;

		unidades = num % 10;
		num = num / 10;
		decenas = num % 10;

		return decenas;

	}

	private static int descomuni(int num) {

		int unidades;
		int decenas;

		unidades = num % 10;
		num = num / 10;
		decenas = num % 10;

		return unidades;
	}

	private static int introducirnumero() {
		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();

		return num;
	}

}
