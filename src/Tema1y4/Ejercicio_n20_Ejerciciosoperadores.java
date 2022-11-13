package Tema1y4;
/*LEER POR TECLADO 4 NOTAS de tipo int (nota1, nota2, nota3, nota4)
SI LA NOTA NO ESTA ENTRE 1 Y 10, LE ASIGNAMOS VALOR 0. CONTROLAR EXCEPCIONES AL LEER LA NOTA, SI HAY ALGUNA NOTA ERRÓNEA, NO SE 
REALIZA EL PROCESO, SE MUESTRA MENSAJE EN CONSOLA: “ERROR DE PROCESO” SI LA ENTRADA DE NOTAS ES CORRECTA CALCULAR NOTA 
FINAL = nota1*30% + nota2*25% + nota3*15% + nota4*30%
Y Visualizar la siguiente información en consola:
Nota final: 99,99
Suspenso si nota final < 5
Aprobado si (>= 5 y <6) , Bien si ( >=6 y < 7),
Notable (>=7 y < 9) Sobresaliente si (>=9 y < 10) ,
Matrícula de honor si == 10
*/



import java.util.Scanner;

public class Ejercicio_n20_Ejerciciosoperadores {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int note1 = 0;
		int note2 = 0;
		int note3 = 0;
		int note4 = 0;
		double finalnote = 0;
		String clasification = "";

		try {

			// Ingresando notas al
			// programa----------------------------------------------------------------------------

			System.out.print("Ingrese la primera nota: ");
			note1 = teclado.nextInt();
			teclado.nextLine();

			System.out.print("Ingrese la segunda nota: ");
			note2 = teclado.nextInt();
			teclado.nextLine();

			System.out.print("Ingrese la tercera nota: ");
			note3 = teclado.nextInt();
			teclado.nextLine();

			System.out.print("Ingrese la cuarta nota: ");
			note4 = teclado.nextInt();
			teclado.nextLine();

			// Comprobando valores de las
			// variables---------------------------------------------------------------------

			note1 = note1 >= 0 || note1 <= 10 ? note1 : 0;
			note2 = note2 >= 0 || note2 <= 10 ? note2 : 0;
			note3 = note3 >= 0 || note3 <= 10 ? note3 : 0;
			note4 = note4 >= 0 || note4 <= 10 ? note4 : 0;

			// Calcular el
			// porcentaje------------------------------------------------------------------------------------

			finalnote = (note1 * 0.3) + (note2 * 0.25) + (note3 * 0.15) + (note4 * 0.30);

			// Clasificacion por
			// notas-----------------------------------------------------------------------------------

			clasification = (finalnote >= 0 && finalnote <= 4) ? "Suspenso"
					: (finalnote >= 5 && finalnote < 6) ? "Aprobado"
							: (finalnote >= 6 && finalnote < 7) ? "Bien"
									: (finalnote >= 7 && finalnote < 9) ? "Notable"
											: (finalnote >= 9 && finalnote < 10) ? "Sobresaliente"
													: "Matricula de Honor";

			// Mostrar resultado por pantalla------------------------------------------------------------------
			
			System.out.printf("Las notas introducidas dan un resultado de %,5.2f", finalnote);
			System.out.print(" por lo que le corresponde un: " + clasification);
			
		} catch (Exception e) {

			System.out.println("ERROR: el valor de tipo String contiene caracteres no numéricos");
		}

	}

}
