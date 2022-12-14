package srcAlvaroGómezTejada;

import java.util.Scanner;

public class Ejercicio1agt {

	public static void main(String[] args) {

		System.out.println("Alvaro Gómez Tejada\n");
		
		int ano = leerNumagt("Dame el año (1900 a 2050): ", 1900, 2050);
		int mes = leerNumagt("Dame el mes (1 a 12): ", 1, 12);
		int dia = leerNumagt("Dia de comienzo del mes (1 a 7): ", 1, 7);

		dibujarCalendarioAgt(ano,mes,dia);

	}

// Metodo para leer numeros ----------------------------------------------------------------------------------------------------

	public static int leerNumagt(String m, int nummin, int nummax) {

		Scanner teclado = new Scanner(System.in);

		int num = 0;

		boolean continuar;

		System.out.print(m);
		do {
			continuar = true;

			try {
				num = teclado.nextInt();
			} catch (Exception e) {
				continuar = false;
			}
			teclado.nextLine();

			if (num < nummin || num > nummax || !continuar) {
				System.out.print("Numero Incorrecto, intentalo de nuevo: ");
			}
		} while (num < nummin || num > nummax || !continuar);

		return num;
	}

// Metodo para saber si un año es bisiesto o no lo es --------------------------------------------------------------------------	

	public static boolean comprobarBisiestoagt(int ano) {

		int caso1 = ano % 4;
		int caso2 = ano % 100;
		int caso3 = ano % 400;
		boolean bisiesto = caso1 == 0 && (caso2 != 0 || caso3 == 0);
		return bisiesto;

	}

// Metodo para comprobar si se quiere seguir ejecutando el programa ------------------------------------------------------------	

	private static char finprogramaagt() {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Desea continuar pintando calendarios (n/N para salir)?: ");
		char cont = teclado.nextLine().charAt(0);

		return cont;
	}

// Metodo para dibujar los calendarios -----------------------------------------------------------------------------------------	

	public static void dibujarCalendarioAgt(int ano, int mes, int dia) {

		char continuar = 's';

		do {

			System.out.println();

			boolean bisiesto = comprobarBisiestoagt(ano);
			int numDiasMes = 0;
			String nombreMes = "";
			String nombreDia = "";

			switch (mes) {
			case 1: {
				nombreMes = "Enero";
				numDiasMes = 31;
			}
			case 2: {
				nombreMes = "Febrero";
				if (bisiesto) {
					numDiasMes = 29;
				} else {
					numDiasMes = 28;
				}
				break;
			}
			case 3: {
				nombreMes = "Marzo";
				numDiasMes = 31;
				break;
			}
			case 4: {
				nombreMes = "Abril";
				numDiasMes = 30;
			}
			case 5: {
				nombreMes = "Mayo";
				numDiasMes = 31;
			}
			case 6: {
				nombreMes = "Junio";
				numDiasMes = 30;
			}
			case 7: {
				nombreMes = "Julio";
				numDiasMes = 31;
			}
			case 8: {
				nombreMes = "Agosto";
				numDiasMes = 31;
			}
			case 9: {
				nombreMes = "Septiembre";
				numDiasMes = 30;
			}
			case 10: {
				nombreMes = "Octubre";
				numDiasMes = 31;
			}
			case 11: {
				nombreMes = "Noviembre";
				numDiasMes = 30;
			}
			case 12: {
				nombreMes = "Diciembre";
				numDiasMes = 31;
			}
			}

			switch (dia) {
			case 1: {
				nombreDia = "Lunes";
			}
			case 2: {
				nombreDia = "Martes";
			}
			case 3: {
				nombreDia = "Miercoloes";
			}
			case 4: {
				nombreDia = "Jueves";
			}
			case 5: {
				nombreDia = "Viernes";
			}
			case 6: {
				nombreDia = "Sabado";
			}
			case 7: {
				nombreDia = "Domingo";
			}
			}

			System.out.println("El mes de " + nombreMes + " del año " + ano + " comienza en: " + nombreDia);
			System.out.println(" ");

			System.out.println("  L   M   X   J   V   S   D");
			int num = 1;
			int dia2 = 1;
			for (int i = 1; i <= 5; i++) {
				for (int c = 1; c <= 7; c++) {
					if (c == 1) {
						System.out.print("");
					}
					if (num >= dia && dia2 <= numDiasMes) {
						System.out.printf(" %,2d ", dia2);
						dia2++;
					} else if (dia2 != dia) {
						System.out.print("    ");
					}

					num++;
				}

				System.out.println();

			}

			System.out.println();

			continuar = finprogramaagt();

		} while (continuar != 'n' && continuar != 'N');

		System.out.println("\nFin del ejercicio 1");

	}

}
