package ordenar;

import java.util.Scanner;

public class OrdenarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese Primer numero");
		short variable1 = lector.nextShort();
		System.out.println("Ingrese Segundo numero");
		short variable2 = lector.nextShort();
		System.out.println("Ingrese Tercer numero");
		short variable3 = lector.nextShort();
		if(variable1 <=variable2 && variable2<=variable3)
        {
           System.out.println(" "+variable1+ " " +variable2+ " " +variable3+ "");  
           System.out.println(" "+variable3+ " " +variable2+ " " +variable1+ "");
        }
        else if (variable1 <=variable3 && variable3<=variable2)
        {
             
            System.out.println(" " +variable1+ " " +variable3+ " " +variable2+ "");
            System.out.println(" " +variable2+ " " +variable3+ " " +variable1+ "");
        }
        else if (variable2<=variable1 && variable1<=variable3)
        {
             
            System.out.println(" " +variable2+ " " +variable1+ " " +variable3+ "");
            System.out.println(" " +variable3+ " " +variable1+ " " +variable2+ "");
        }
        else if (variable2<=variable3 && variable3<=variable1)
        {
             
            System.out.println(" " +variable2+ " " +variable3+ " " +variable1+ "");
            System.out.println(" " +variable1+ " " +variable3+ " " +variable2+ "");
        }
        else if (variable3<=variable1 && variable1<=variable2)
        {
             
            System.out.println(" " +variable3+ " " +variable1+ " " +variable2+ "");
            System.out.println(" " +variable2+ " " +variable1+ " " +variable3+ ""); 
        }
        else
        {
              System.out.println(" " +variable3+ " " +variable2+ " " +variable1+ "");
              System.out.println(" " +variable1+ " " +variable2+ " " +variable3+ "");
        }
		lector.close();

	}

}
