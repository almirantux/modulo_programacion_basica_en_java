package menuopciones;

import java.util.Scanner;

public class MenuOpciones {

	public static boolean esPrimo( int numero ) {
		  int contador = 2;
		  boolean primo=true;
		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
		}
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
	       boolean salir = false;
	       int opcion; //Guardaremos la opcion del usuario
	       while(!salir){
	           System.out.println("1. Opcion 1");
	           System.out.println("2. Opcion 2");
	           System.out.println("3. Opcion 3");
	           System.out.println("4. Salir");
	           System.out.println("Escribe una de las opciones");
	           opcion = sn.nextInt();
	           switch(opcion){
	               case 1:
	            	   int numero;
	            	   System.out.println("ingrese  numero ");
	                   numero = sn.nextInt();
	                    if (numero%2==0)
	                	    System.out.println("El número es par");
	                	else
	                	    System.out.println("El número es impar");
	                   break;
	               case 2:
	            	  int I, cuenta=0 ;
	            	   System.out.println("ingrese  numero ");
	                   numero = sn.nextInt();
	                   for(I = 1; I <= numero; I++)
	                   {
	                       if((numero % I) == 0)
	                       {
	                           cuenta++;
	                       }
	                   }
	                   if(cuenta <= 2)
	                   {
	                       System.out.println("El numero es primo");
	                   }else{
	                       System.out.println("El numero no es primo");
	                   }
	                   break;
	                case 3:	       
	                	 int numero2,numero1, x,  suma=0;
	                   System.out.println("ingrese primer numero ");
	                   numero1 = sn.nextInt();
	                   System.out.println("ingrese segundo numero ");
	                   numero2 = sn.nextInt();	                   
	                   for ( x=numero1;x<=numero2;x++) {
	                	   if (esPrimo(x))
	                	     suma++;				
	                	 }
	                   System.out.println("la cantidad de numeros primos en el rango son:"+suma);
	                   break;
	                case 4:
	                	System.out.println("hasta la vista baby ...");
	                   salir=true;
	                   break;
	                default:
	                   System.out.println("Solo números entre 1 y 4");
	           }
	       }
	       sn.close() ; 
	}

	
}
