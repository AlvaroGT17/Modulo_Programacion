import java.util.Scanner;

public class Ejercicio1_20221027 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int dia;
		String nombre= "";
		System.out.print("Ingrese el numero del dia de la semana: ");
		dia= teclado.nextInt();
		teclado.nextLine();
		
		nombre = DiaDeLaSemana(dia);
		System.out.println("EL DIA DE LA SEMANA ES: " + nombre);
		nombre= DiaDeLaSemana(3);
		System.out.println("EL DIA DE LA SEMANA ES: " + nombre);
		nombre= DiaDeLaSemana(5);
		System.out.println("EL DIA DE LA SEMANA ES: " + nombre);
		

	}

	private static String DiaDeLaSemana(int dia) {
		String nombre;
		switch (dia) {
		case 1:
		nombre = "Lunes";
		break;
		case 2:
		nombre = "Martes";
		break;
		case 3:
		nombre = "Miercoles";
		break;
		case 4:
		nombre = "Jueves";
		break;
		case 5:
		nombre = "Viernes";
		break;
		case 6:
		nombre = "Sabado";
		break;
		case 7:
		nombre = "Domingo";
		break;
		default:
		nombre = "error en el dia";
		}
		return nombre;
	}

}
