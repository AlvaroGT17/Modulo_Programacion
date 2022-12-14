package srcAlvaroGómezTejada_supuesto;

public class Ejercicio1 {

	public static void main(String[] args) {

		int dia = 13;
		int mes = 3;

		NombreDiaSemana(dia, mes);
		
		dia = 17;
		mes = 2;

		NombreDiaSemana(dia, mes);
		
		dia = 8;
		mes = 6;

		NombreDiaSemana(dia, mes);
		
		dia = 28;
		mes = 7;

		NombreDiaSemana(dia, mes);


	}

//---------------------------------------------------------------------------------------------------------------------------------------------

	private static void NombreDiaSemana(int dia, int mes) {

		int diasPasados = 0;
		int diasem = 1;
		int n = 1;
		String nombreMes = "";
		String nombredia = "";

		switch (mes) {
		case 1:
			nombreMes = "Enero";
			diasPasados = dia;
			break;
		case 2:
			nombreMes = "Febrero";
			diasPasados = 31;
			break;
		case 3:
			nombreMes = "Marzo";
			diasPasados = 59;
			break;
		case 4:
			nombreMes = "Abril";
			diasPasados = 90;
			break;
		case 5:
			nombreMes = "Mayo";
			diasPasados = 120;
			break;
		case 6:
			nombreMes = "Junio";
			diasPasados = 151;
			break;
		case 7:
			nombreMes = "Julio";
			diasPasados = 181;
			break;
		case 8:
			nombreMes = "Agosto";
			diasPasados = 212;
			break;
		case 9:
			nombreMes = "Septiembre";
			diasPasados = 243;
			break;
		case 10:
			nombreMes = "Octubre";
			diasPasados = 273;
			break;
		case 11:
			nombreMes = "Noviembre";
			diasPasados = 304;
			break;
		case 12:
			nombreMes = "Diciembre";
			diasPasados = 334;
			break;
		default:
			System.out.print("El número introducido no corresponde a ningun més");

		}

//---------------------------------------------------------------------------------------------------------------------------------------------

		if (mes == 1) {

			for (n = 1; n < diasPasados; n++, diasem++)
				if (diasem >= 7) {
					diasem = 0;
				}

		}

		if (mes >= 2) {

			diasPasados = diasPasados + dia;

			for (n = 1; n < diasPasados; n++, diasem++)
				if (diasem >= 7) {
					diasem = 0;
				}
		}
//---------------------------------------------------------------------------------------------------------------------------------------------

		switch (diasem) {
		case 0:
			nombredia = "Viernes";
		case 1:
			nombredia = "Viernes";
			break;
		case 2:
			nombredia = "Sabado";
			break;
		case 3:
			nombredia = "Domingo";
			break;
		case 4:
			nombredia = "Lunes";
			break;
		case 5:
			nombredia = "Martes";
			break;
		case 6:
			nombredia = "Miercoles";
			break;
		case 7:
			nombredia = "Jueves";
			break;

		}

		System.out.println("La fecha " + dia + " del " + nombreMes + " corresponde que fue: " + nombredia + "\n");

	}
}
