/*
 * Hacer una funcion que reciba dia, mes, año (de tipo int) 
 * y decuelva true o false indicando si la decha es correcta.
 * 
 * año correcto > que 0
 * mes entre 1 y 12
 * dia entre 1 y 31 depende del mes, y si es febrero el mes puede ser bisiesto.
 */

package Tema2;

public class Ejercicio1_Pizarra {

	public static void main(String[] args) {
		
		int dia=17;
		int mes=2;
		int ano=1983;
		
		boolean com = comprobaciconFecha(dia,mes,ano);
		 
	}

	private static boolean comprobaciconFecha(int dia, int mes, int ano) {
		
		if (ano <= 0) {
			return false;
		}
		
		if (mes < 1 || mes > 12) {
			return false;
		}
		
		if (dia < 0 || dia >31) {
			return false;
		}
		
		boolean valor = false;
		
		switch (mes) {
		case 1,3,5,7,8,10,12 -> { 
			valor=true;
		}
		case 4,6,9,11 -> {
			if (dia > 30) {
				valor=false;
			} else {
				valor=true;
			}
		}
		case 2 -> {
			if (bisiesto(ano)== true) {
				if (dia == 29) {
				valor=true;
			}
			if (bisiesto(ano)== true) {
				if (dia == 28) {
					valor=true;
			}
			}
			
			}else {
				valor=false;
			}
				
		}
			
		}
		return valor;
	}

	private static boolean bisiesto(int ano) {
		int op1= ano%4;
		int op2= ano%100;
		int op3= ano%400;
		boolean esBisiesto= op1 == 0 && (op2!=0 || op3==0);
		return esBisiesto;
	}
}
