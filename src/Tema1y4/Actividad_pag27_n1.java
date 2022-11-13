package Tema1y4;
/* El tipo "short" permite valores comprendidos entre -32768 y 32767
 * Escribir un programa que compruebe que el rango de valores de un
 * tipo se comporta de forma cíclica, es decir, el valor siguiente al 
 * maximo es el mínimo
 */



public class Actividad_pag27_n1 {

	public static void main(String[] args) {
		
		short numMaximo = 32767;
		
		numMaximo += 1;
		
		System.out.print(numMaximo);

	}

}
