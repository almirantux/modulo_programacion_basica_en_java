package inicio;

import java.util.Scanner;

public class Demo1 {
	
	public static void main (String[] args) {
		Scanner lector = new Scanner(System.in);
		String variable1;
		System.out.println("Ingrese un numero");
		variable1 = lector.nextLine();
		System.out.println("Ingrese Segundo numero");
		short variable2 = lector.nextShort();
		System.out.print("la suma de los numeros es: "+(Integer.parseInt(variable1) + variable2));
		lector.close();
	}
	

}
