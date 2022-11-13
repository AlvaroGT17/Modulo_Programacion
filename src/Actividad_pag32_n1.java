import java.util.Scanner;

/* Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras. 
 * Por este motivo, es necesario diseñar una aplicación que solicite las ventas (en kilos) de cada semestre 
 * para cada fruta. La aplicación mostrará el importe total sabien do que el precio del kilo de manzanas 
 * está fijado en 2,35 € y el kilo de peras en 1,95 €.
 */
public class Actividad_pag32_n1 {

	public static void main(String[] args) {

		int apple;
		int pear;
		final double priceApple = 2.35;
		final double pricePear = 1.95;
		double resultApple1;
		double resultPear1;
		double resultApple2;
		double resultPear2;
		double totalApple;
		double totalPear;

		Scanner teclado = new Scanner(System.in);
		
		// Primer semestre

		System.out.print("Ingrese el número de kilos vendidos de manzanas en el primer semestre: ");
		apple = teclado.nextInt();

		System.out.print("Ingrese el número de kilos vendidos de peras en el primer semestre: ");
		pear = teclado.nextInt();

		resultApple1 = apple * priceApple;
		resultPear1 = pear * pricePear;
		
		System.out.println("- El importe ingresado por la venta de " + apple + " Kilos de manzas ");
		System.out.println("  en el primer semestre da un veneficio de: " + resultApple1 + "Euros.");
		System.out.println("- El importe ingresado por la venta de " + pear + " Kilos de peras ");
		System.out.println("  en el primer semestre da un veneficio de: " + resultPear1 + "Euros.");
		
		// Segundo semestre
		
		System.out.print("Ingrese el número de kilos vendidos de manzanas en el segundo semestre: ");
		apple = teclado.nextInt();

		System.out.print("Ingrese el número de kilos vendidos de peras en el segundo semestre: ");
		pear = teclado.nextInt();

		resultApple2 = apple * priceApple;
		resultPear2 = pear * pricePear;
		
		System.out.println("- El importe ingresado por la venta de " + apple + " Kilos de manzas ");
		System.out.println("  en el primer semestre da un veneficio de: " + resultApple2 + "Euros.");
		System.out.println("- El importe ingresado por la venta de " + pear + " Kilos de peras ");
		System.out.println("  en el primer semestre da un veneficio de: " + resultPear2 + "Euros.");
		
		// Resultado final
		
		totalApple = resultApple1 + resultApple2;
		totalPear = resultPear1 + resultPear2;
		
		System.out.println("- Los veneficios anuales de las manzanas son: " + totalApple + " Euros ");
		System.out.println("- Los veneficios anuales de las peras son: " + totalPear + " Euros.");


	}

}
