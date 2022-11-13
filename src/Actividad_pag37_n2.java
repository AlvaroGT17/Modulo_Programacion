/*Realizar un programa que pida como entrada un número decimal y lo muestre redondea do al entero más próximo.*/

import java.util.Scanner;
import java.util.*;

public class Actividad_pag37_n2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);

		double number;
		int rounding;

		System.out.print("Escriba un número decimal (con punto): ");
		number = teclado.nextDouble();

		rounding = (int) (number + 0.5);
		System.out.println(number + " redondeado es: " + rounding);
	}
}
