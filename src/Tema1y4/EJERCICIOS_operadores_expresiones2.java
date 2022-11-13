package Tema1y4;
// El autor de este codigo es: Alvaro Gómez Tejada.

public class EJERCICIOS_operadores_expresiones2 { // Esta clase se llama EJERCICIOS_operadores_expresiones2 y comienza
													// añadiendo esta apertura de llaves.

	public static void main(String[] args) { // Esta es la forma de declarar el metodo "main" tambien se inicia con una
												// apertura de llaves y dentro es donde ira todo el codigo de esta
												// clase.

		/*
		 * a. Si un empleado está casado o no. • Boolean, por que con este tipo de
		 * variable tenemos las dos opciones posibles o verdadero o falso.
		 */

		boolean married = true;

		/*
		 * b. Valor máximo no modificable: 999999. • Un final int por que short se queda
		 * pequeño y es constante.
		 */

		final int VALUEMAX = 999999;

		/*
		 * c. Día de la semana • byte por que comprende un rango de valores de entre
		 * -128 y 127 por lo que ocuparía muy poca memoria y sería suficiente.
		 */

		byte week = 4;

		/*
		 * d. Día del año. • Short por que comprende un rango de valores de entre -32768
		 * y 32767 de modo que byte se quedaría pequeño y short es el inmediato
		 * superior.
		 */

		short dayYear = 265;

		/*
		 * e. Sexo: con dos valores posibles 'V' o 'M' • Boolean por que podemos asignar
		 * uno de los dos a verdadero y el otro a falso.
		 */

		boolean sexMale = true;

		/*
		 * f. Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días
		 * (1298332800000). • Long porque es el único tipo que nos permite tener 13
		 * dígitos.
		 */

		long milliSeconds = 1298332800000L;

		/*
		 * g. Almacenar el total de una factura • En este caso pondría un “float” o un
		 * “double ” todo depende del total de la factura.
		 */

		double facture = 2548.465;

		/*
		 * h. Población mundial del planeta tierra. • Usaria un long por que la
		 * población de la tierra son 8mil millones de personas con lo que in int se
		 * quedaría corto ya que solo llega a los 2mil millones.
		 */

		long peopleheart = 7976165045L;

		/*
		 * i. Sexo: con dos valores posibles 'V' o 'M' Char porque podemos almacenar
		 * caracteres sueltos.
		 */

		char sex = 'v';

		System.out.println("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
		System.out.println("\tEl valor de la variable \"married\" es: " + married);
		System.out.printf("\tEl valor de la variable \"VALUEMAX\" es: \"%,7d\" \n", VALUEMAX);
		System.out.println("\tEl valor de la variable \"week\" es: " + week);
		System.out.println("\tEl valor de la variable \"dayYear\" es: " + dayYear);
		System.out.printf("\tEl valor de la variable \"sexMale\" es: \"%b\"", sexMale);
		System.out.println("\n\tEl valor de la variable \"milliSeconds\" es: " + milliSeconds);
		System.out.printf("\tEl valor de la variable \"facture\" es: %,12.2f %n", facture);
		System.out.println("\tEl valor de la variable \"peopleheart\" es: " + peopleheart);
		System.out.println("\tEl valor de la variable \"sex\" es: " + sex);

	} // Esta llave de cierre pertenece al cierre del metodo "main"

} // Esta llave de cierre pertenece a la clase
	// "EJERCICIOS_operadores_expresiones2"
