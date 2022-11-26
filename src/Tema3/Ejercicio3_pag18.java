/*Leer datos de departamentos en un proceso repetitivo hasta que el número de departamento leído sea    menor o igual 0, los datos a leer son:
	
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

		System.out.print("Ingrese el numero de departamentos que tiene la empresa: ");
		int numerodepartamentos = leerint();
		System.out.println("");

		int contador = 0;
		int maxiempleado = 0;
		double maxisalario = 0;
		double salariototal = 0;
		double salariomedio = 0;
		String maxiapellido = "";
		String maxidepartamento = "";

		if (numerodepartamentos > 0) {

			do {

				System.out.println("=================Datos de la empresa=================================\n ");
				
				int iddepartamento = contador+1;
				System.out.println("\tEl numero de departamento es: " + iddepartamento);
				
				System.out.print("\tIngrese el nombre que tiene el departamento: ");
				String nombredepartamento = leerstring();

				System.out.print("\tIngrese la localidad donde esta el departamento: ");
				String localidaddepartamentos = leerstring();

				System.out.print("\tIngrese el numero de empleados que tiene el departamento: ");
				int numeroempleados = leerint();

				for (int i = 0; i < numeroempleados; i++) {

					System.out.println("\n=================Datos del trabajador================================= ");
					System.out.println("\n");

					System.out.print("\tIngrese el numero del trabajador: ");
					int numerotrabajador = leerint();

					System.out.print("\tIngrese el apellido del trabajador: ");
					String apellido = leerstring();

					System.out.print("\tIngrese el oficio del trabajador: ");
					String oficio = leerstring();

					System.out.println("\tIngrese el salario del trabajador : ");
					double salario = leerdouble();

					if (maxisalario < salario) {
						maxisalario = salario;
						maxiapellido = apellido;
					}

					if (maxiempleado < numeroempleados) {
						maxiempleado = numeroempleados;
						maxidepartamento = nombredepartamento;
					}

					salariototal = salariototal + salario;
					salariomedio = salariototal / numeroempleados;

				}

				contador++;
				numerodepartamentos--;
				
				System.out.println("========== Datos requeridos ===================================");
				System.out.println("\n");

				System.out.println("\tEl salario medio del departamento " + iddepartamento + " es: " + salariomedio);
				System.out.println("\tEl empleado con mas suseldo es: " + maxiapellido + "\n");

			} while (numerodepartamentos > 0);
			
			System.out.println("\tEl departamento con mas empleados es: " + maxidepartamento + " con un total de: " + maxiempleado + " empleados");
			System.out.println("\tEl numero de departamentos introducidos es: " + contador);

		} else {

			System.out.println(" ERROR !!! Número de departamentos insuficientes para ejecutar programa.");

		}

		teclado.close();

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
