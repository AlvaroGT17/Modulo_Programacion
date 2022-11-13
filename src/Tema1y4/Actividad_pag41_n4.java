package Tema1y4;
/*Crea un programa que pida la base y la altura de un triángulo y muestre su área . */

import java.util.Scanner;

public class Actividad_pag41_n4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double height;
		double base;
		double area;
		
		System.out.print("Introduzca la base del triangulo: ");
		base=teclado.nextDouble();
		System.out.print("Introduzca la altura del triangulo: ");
		height= teclado.nextDouble();
		
		area= base * height /2;
		
		System.out.print("El area del triangulo que a introducido es: " + area);

	}

}
