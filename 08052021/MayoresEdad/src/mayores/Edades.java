package mayores;

import java.util.Arrays;
import java.util.Scanner;


public class Edades {

	public static void main(String[] args) {
		int edades,i,edad;
		int[] ArrayEdades = new int[10];
		boolean resp;
		edades =0;
		i = 0;



		while(i<10){

		edad =ingresoEdad(edades);

		resp = registroEdades(edad);

		if(resp == true) {
		ArrayEdades[i]= edad;
		i++;

		}
		}


		Arrays.sort(ArrayEdades);


		i=0;
		while (i<10) {
		System.out.print(ArrayEdades[i]+" ");
		i++;
		}
		}


		public static int ingresoEdad(int edades) {


		System.out.println("ingrese 10 edades");


		Scanner scanner = new Scanner(System.in);
		return edades= scanner.nextInt();
		}

		public static Boolean registroEdades(int edades) {

		if (edades > 17) {

		return true;

		}else {
		System.out.println("Ingrese edad mayor o igual a 18 ");
		return false;

		}

		
	}

}






 
 
