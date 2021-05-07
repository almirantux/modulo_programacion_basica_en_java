package ciclos;

 import java.util.Scanner ;
public class ciclo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector= new Scanner(System.in);
		System.out.println("Ingrese numero");
		int numero = lector.nextShort();
		int factorial = 1;
				
		while ( numero!=0) {
			  factorial=factorial*numero;
			  numero--;
			}
		System.out.println("el factorial es: "+factorial);
		
		lector.close();


	} // void

} //class
