/* Modifica la Actividad de Aplicación 1.12 para que , indicando dos números n y m , diga 
qué cantidad hay que sumarle a n para que sea múltiplo de m*/

import java.util.Scanner;

public class Actividad_pag41_n6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int number1;
		int number2;
		int amount;
		int numberMas;
		
		
		System.out.print("Ingrese un número: ");
		number1= teclado.nextInt();
		
		System.out.print("Ingrese un número: ");
		number2= teclado.nextInt();

		 amount = number1 % number2;
	     numberMas = number2 - amount;
	
		
		System.out.print("Para que " + number1 + " sea multiplo de " + number2 + " hay que sumarle " + numberMas);

	}

}
