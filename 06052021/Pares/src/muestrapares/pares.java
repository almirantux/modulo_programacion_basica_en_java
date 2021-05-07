package muestrapares;

import java.util.Scanner ;

public class pares {

	public static void main(String[] args) {
		Scanner lector= new Scanner(System.in);
		System.out.println("Ingrese numero");
		int numero = lector.nextShort();
	
		int contador=0;
	
		for(int i=1;i<numero;i+=2)
			{
			contador=contador+1;//aqui X toma el valor del actual valor de i, multiplicado por 2
					
					} // for
		System.out.println("Numeros par:"+contador);
			}// void

} // class

