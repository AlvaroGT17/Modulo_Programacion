/*Leer datos de departamentos en un proceso repetitivo hasta que el número de departamento leído sea menor o igual 0, 
  los datos a leer son:
	Nº DE DEPARTAMENTO, NOMBRE, LOCALIDAD y Nº DE EMPLEADOS QUE TIENE.
	
  A continuación leer los datos de sus empleados (tantos como empleados tenga), los datos son:
	NºEMPLEADO, APELLIDO, OFICIO y SALARIO.
  
  • Visualizar por cada departamento el salario medio y el apellido con más salario.
  • Visualizar al final del todo el nombre de departamento con más empleados y el número de empleados que tiene
  • Visualizar el número de departamentos que se han introducido.
  • Si no se introducen departamentos (el primer numero de departamento leído de teclado es 0)

mostrar mensaje indicándolo, no se debe mostrar el máximo ni el nº de departamentos introducido.*/

package Tema3;

import java.util.Scanner;

public class Ejercicio3_pag18 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String depmasempleado = "";
		int contador = 0;
		double calsalario=0;
		double salariomax=0;
		
		do {
			
			System.out.print("========DATOS============================================");
			System.out.print("Ingrese el nº de departamento: ");
			int ndepartamento = leerint();
			System.out.print("Ingrese el nombre de la localidad: ");
			String localidad = leerstring();
			System.out.print("Ingrese el nº de empleados: ");
			int nempleados = leerint();
			
			int numEmple;
			String apellidos;
			String oficio;
			double salario;
			
			for (int i=1; i<=nempleados; i++) {
				System.out.print("Ingrese el Oficio: ");
				oficio = leerstring();
				System.out.print("Ingrese el salario: ");
				salario = leerdouble();
				System.out.print("Ingrese el nº de empleado: ");
				numEmple= leerint();
				
				calsalario= calsalario+salario;
				
				if (salario>salariomax) {
					salariomax=salario;
				}
			}
			
			
			
			
		} while (ndepartamento>0);

	}
	
	private static double leerdouble() {

		Scanner teclado = new Scanner(System.in);
		double num = 0;
		num = teclado.nextInt();
		teclado.nextLine();
		
		return num;
	}

	private static int leerint() {

		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		teclado.nextLine();

		return num;

	}

	private static String leerstring() {

		Scanner teclado = new Scanner(System.in);
		String nombre = teclado.nextLine();
		return nombre;
	}

}
