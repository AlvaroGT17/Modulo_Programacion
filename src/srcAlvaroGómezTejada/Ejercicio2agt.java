package srcAlvaroGómezTejada;

public class Ejercicio2agt {
	
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        System.out.println("Alvaro Gómez Tejada\n");

        while(true){

            if(num1==3)
                System.out.print("A-");
            else
                System.out.print(num1+"-");

            if(num2==3)
                System.out.print("A-");
            else
                System.out.print(num2+"-");

            if(num3==3)
                System.out.print("A   ");
            else
                System.out.print(num3+"   ");

            if (num3==9)
                System.out.println("");

                num3++;
                if (num3==10){
                    num3=0;
                    num2++;
                }
                if (num2==10){
                    num2=0;
                    num1++;
                }

            if(num1==10&&num3==0&&num2==0)
                break;
        }
        
        System.out.println("\nFin del ejercicio 2");
        
    }

}
