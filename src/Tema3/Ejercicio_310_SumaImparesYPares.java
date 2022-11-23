package Tema3;

public class Ejercicio_310_SumaImparesYPares {

	public static void main(String[] args) {
		
		
		int sumapares = 0, sumaimpares= 0;
		
		for (int i=0, impar=1, par=0; i<=10 ; i++, impar+=2,par+=2 ) {
			sumapares=sumapares+par;
			sumaimpares=sumaimpares+impar;
		}
		
		System.out.println(sumapares);
		System.out.println(sumaimpares);

	}

}
