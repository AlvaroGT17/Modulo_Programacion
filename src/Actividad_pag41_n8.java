/*Dado el siguiente polinomio de segundo grado : 
y = ax2 + bx + c crea un programa que pida los coeficientes a , b y c , así como el valor de x , y calcula
el valor correspondiente de y .*/

import java.util.Scanner;

public class Actividad_pag41_n8 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double a;
		double b;
		double c;
		double x;
		double y;

		System.out.print("Ingrese el valor de \"a\": ");
		a = teclado.nextDouble();
		System.out.print("Ingrese el valor de \"b\": ");
		b = teclado.nextDouble();
		System.out.print("Ingrese el valor de \"c\": ");
		c = teclado.nextDouble();
		System.out.print("Ingrese el valor de \"x\": ");
		x = teclado.nextDouble();

		y = a * (x * x) + (b * x) + c;

		System.out.println("La ecuación queda representada de la siguiente manera:");
		System.out.println(" y = " + a + "( " + x + " X " + x + " ) + (" + b + " X " + x + " ) + " + c);
		System.out.print("El valor de \"y\" es: " + y);

	}

}
