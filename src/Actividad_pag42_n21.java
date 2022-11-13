/* Un biólogo está realizando un estudio de distintas especies de invertebrados y cesita 
 * una aplicación que le ayude a contabilizar el número de patas que tienen en total todos los animales capturados durante 
 * una jornada de trabajo . Para ello , te ha solicitado que escribas una aplicación a la que hay que proporcionar : 
 * El número de hormigas capturadas ( 6 patas ) . 
 * El número de arañas capturadas ( 8 patas ) . 
 * El número de cochinillas capturadas ( 14 patas ) . 
 * La aplicación debe mostrar el número total de patas . 
 */

import java.util.Scanner;

public class Actividad_pag42_n21 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int ant;
		int spiders;
		int mealybugs;
		int totalPaws;

		System.out.print("Introduzca el número de hormigas capturadas: ");
		ant = teclado.nextInt();
		System.out.print("Introduzca el número de arañas capturadas: ");
		spiders = teclado.nextInt();
		System.out.print("Introduzca el número de cochinillas capturadas: ");
		mealybugs = teclado.nextInt();

		totalPaws = (ant * 6) + (spiders * 8) + (mealybugs * 14);

		System.out.print("El total de las patas de los especimes capturados es de: " + totalPaws);

	}

}
