/*Un economista te ha encargado un programa para realizar cálculos con el IVA . La aplica 
ción debe solicitar la base imponible y el IVA que se debe aplicar . Muestra en pantalla 
el importe correspondiente al IVA y al total . */

import java.util.Locale;
import java.util.Scanner;

public class Actividad_pag41_n1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);

		double taxableBase = 0;
		double iva = 0;
		double calculateIva;
		double total;

		System.out.print("Porfavor, ingrese la base imponible de la factura: ");
		taxableBase = teclado.nextDouble();
		System.out.print("Ingrese el valor actual del I.V.A: ");
		iva= teclado.nextDouble();
		
		calculateIva= iva * taxableBase / 100;
		total = taxableBase + calculateIva;

		System.out.println("El precio introducido del articulo es: " + taxableBase + " con un I.V.A del " + iva + "% hace un total de: " + total);
		System.out.print("La cantidad que se le añadio al articulo en impuestos fue: " + calculateIva);
	
	}

}
