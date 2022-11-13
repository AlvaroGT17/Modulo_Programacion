package Tema1y4;

import java.util.Locale;
import java.util.Scanner;

public class Actividad_pag23 {

	
	
	public static void main(String[] args) {
		
		Scanner sc;
		sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int number = 0;
		
		System.out.println("Ingrese su numero de telefono: ");
		number = sc.nextInt();
		
		System.out.print("El número ingresado es '" + number +"'");
	}

}
