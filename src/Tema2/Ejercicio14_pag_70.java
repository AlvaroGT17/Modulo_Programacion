package Tema2;

import java.io.CharConversionException;
import java.util.Scanner;

public class Ejercicio14_pag_70 {

	public static void main(String[] args) {

		System.out.print("Introdudca un numero comprendido entre 0 y 99: ");
		
		int num = introducirnumero();
		String nombrenum = conversion1(num);
		
		System.out.print(nombrenum);

	}

	private static String conversion1(int num) {

		String selec = "";
		switch (num) {
		case 1 -> selec = "Uno";
		case 2 -> selec = "Dos";
		case 3 -> selec = "Tres";
		case 4 -> selec = "Cuatro";
		case 5 -> selec = "Cinco";
		case 6 -> selec = "Seis";
		case 7 -> selec = "Siete";
		case 8 -> selec = "Ocho";
		case 9 -> selec = "Nueve";
		case 10 -> selec = "Diez";
		case 11 -> selec = "Once";
		case 12 -> selec = "Doce";
		case 13 -> selec = "Trece";
		case 14 -> selec = "Catorce";
		case 15 -> selec = "Quince";
		case 16 -> selec = "Dieciseis";
		case 17 -> selec = "Diecisiete";
		case 18 -> selec = "Dieciocho";
		case 19 -> selec = "Diecinueve";
		case 20 -> selec = "Veinte";
		case 21 -> selec = "Ventiuno";
		case 22 -> selec = "Ventidos";
		case 23 -> selec = "Ventitres";
		case 24 -> selec = "Venticuatro";
		case 25 -> selec = "Venticinco";
		case 26 -> selec = "Ventiseis";
		case 27 -> selec = "Ventisiete";
		case 28 -> selec = "Ventiocho";
		case 29 -> selec = "Ventinueve";
		case 30 -> selec = "Treinta";
		case 31 -> selec = "Treinta y uno";
		case 32 -> selec = "Treinta y dos";
		case 33 -> selec = "Treinta y tres";
		case 34 -> selec = "Treinta y cuatro";
		case 35 -> selec = "Treinta y cinco";
		case 36 -> selec = "Treinta y seis";
		case 37 -> selec = "Treinta y siete";
		case 38 -> selec = "Treinta y ocho";
		case 39 -> selec = "Treinta y nueve";
		case 40 -> selec = "Cuarenta";
		case 41 -> selec = "Cuarenta y uno";
		case 42 -> selec = "Cuarenta y dos";
		case 43 -> selec = "Cuarenta y tres";
		case 44 -> selec = "Cuarenta y cuatro";
		case 45 -> selec = "Cuarenta y cinco";
		case 46 -> selec = "Cuarenta y seis";
		case 47 -> selec = "Cuarenta y siete";
		case 48 -> selec = "Cuarenta y ocho";
		case 49 -> selec = "Cuarenta y nueve";
		case 50 -> selec = "Cincuenta";
		case 51 -> selec = "Cincuenta y uno";
		case 52 -> selec = "Cincuenta y dos";
		case 53 -> selec = "Cincuenta y tres";
		case 54 -> selec = "Cincuenta y cuatro";
		case 55 -> selec = "Cincuenta y cinco";
		case 56 -> selec = "Cincuenta y seis";
		case 57 -> selec = "Cincuenta y siete";
		case 58 -> selec = "Cincuenta y ocho";
		case 59 -> selec = "Cincuenta y nueve";
		case 60 -> selec = "Sesenta";
		case 61 -> selec = "Sesenta y uno";
		case 62 -> selec = "Sesenta y dos";
		case 63 -> selec = "Sesenta y tres";
		case 64 -> selec = "Sesenta y cuatro";
		case 65 -> selec = "Sesenta y cinco";
		case 66 -> selec = "Sesenta y seis";
		case 67 -> selec = "Sesenta y siete";
		case 68 -> selec = "Sesenta y ocho";
		case 69 -> selec = "Sesenta y nueve";
		case 70 -> selec = "Setenta";
		case 71 -> selec = "Setenta y uno";
		case 72 -> selec = "Setenta y dos";
		case 73 -> selec = "Setenta y tres";
		case 74 -> selec = "Setenta y cuatro";
		case 75 -> selec = "Setenta y cinco";
		case 76 -> selec = "Setenta y seis";
		case 77 -> selec = "Setenta y siete";
		case 78 -> selec = "Setenta y ocho";
		case 79 -> selec = "Setenta y nueve";
		case 80 -> selec = "Ochenta";
		case 81 -> selec = "Ochenta y uno";
		case 82 -> selec = "Ochenta y dos";
		case 83 -> selec = "Ochenta y tres";
		case 84 -> selec = "Ochenta y cuatro";
		case 85 -> selec = "Ochenta y cinco";
		case 86 -> selec = "Ochenta y seis";
		case 87 -> selec = "Ochenta y siete";
		case 88 -> selec = "Ochenta y ocho";
		case 89 -> selec = "Ochenta y nueve";
		case 90 -> selec = "Noventa";
		case 91 -> selec = "Noventa y uno";
		case 92 -> selec = "Noventa y dos";
		case 93 -> selec = "Noventa y tres";
		case 94 -> selec = "Noventa y cuatro";
		case 95 -> selec = "Noventa y cinco";
		case 96 -> selec = "Noventa y seis";
		case 97 -> selec = "Noventa y siete";
		case 98 -> selec = "Noventa y ocho";
		case 99 -> selec = "Noventa y nueve";
		default -> selec = "Número fuera de rango";
		}
		return selec;

	}


	private static int introducirnumero() {

		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();

		return num;
	}

}
