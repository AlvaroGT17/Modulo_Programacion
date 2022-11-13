import java.util.Scanner;

public class Ejercicio_examen {

	static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int cv = LeerEntero("Código del vendedor: ");

		System.out.print("Nombre del vendedor: ");
		String nombrev = sc.nextLine();
		int zona = LeerEntero("Zona de venta: (1 a 4): ");

		System.out.print("Categoría del vendedor (P, S, T): ");
		char categ = sc.nextLine().charAt(0);

		System.out.print("Importe de la venta: ");
		double importe = sc.nextDouble();
		sc.nextLine();

		System.out.println("A)==================================");
		System.out.println("\tVendedor: " + cv + ", " + nombrev + "\n\tZona: " + zona + " => " + valorarZona(zona)
				+ "\n\tCategoría: " + categ + " => " + valorarCateg(categ));

		int imzona = valorarImZona(zona);
		int imcateg = valorarImCateg(categ);
		double importetotal = importe + 0.10 * imzona + imcateg;

		System.out.println("\nB)==================================");
		System.out.printf("\tImporte : %,12.2f %n", importe);
		System.out.printf("\tImporte total: %,12.2f %n", importetotal);
	}// main

	private static int valorarImCateg(char categ) {
		return categ == 'P' ? 200 : categ == 'S' ? 150 : categ == 'T' ? 100 : 0;
	}

	private static int valorarImZona(int zona) {
		return (zona == 1) ? 2000 : zona == 2 ? 3400 : zona == 3 ? 2350 : zona == 4 ? 2500 : 0;
	}

	private static String valorarCateg(char categ) {
		return categ == 'P' ? "Primera" : categ == 'S' ? "Segunda" : categ == 'T' ? "Tercera" : "No definida";
	}

	private static String valorarZona(int zona) {
		return zona == 1 ? "CENTRO"
				: zona == 2 ? "SUR" : zona == 3 ? "ESTE-OESTE" : zona == 4 ? "NORTE" : "No definida";
	}

	private static int LeerEntero(String cad) {
		System.out.print(cad);
		int ed = sc.nextInt();
		sc.nextLine(); // ACONSEJABLE
		return ed;
	}
}// fin