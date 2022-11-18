package entregables;

import java.util.Scanner;

public class Ejercicio3 {
	
	/*Solicita al usuario un número n y dibuja un triángulo de base y altura n. Por ejemplo para n=4 debe dibujar lo siguiente:
	    *
	   * *
	  * * *
	 * * * *
	*/
	
	public static void main(String[] args) {
		
		/*PRUEBAS
		 * num=9 -> 
		 * "    * 
		 	   * * 
       		  * * * 
      		 * * * * 
     		* * * * * 
    	   * * * * * * 
   		  * * * * * * * 
  		 * * * * * * * * 
 		* * * * * * * * * "
 		
 		* num=3 ->"  * 
 					* * 
 				   * * *" 
		*/
		
		//Declaramos las variables
		int num;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el numero
		System.out.print("Dime un numero: ");
		num=sc.nextInt();
		//Mientras i menor o igual que el numero
		for(int i=1; i<=num; i++) {
			
			//k igual a num - i, mientras k sea mayor que 0 añadimos espacios, restamos 1 a k por iteracion
			for(int k=num-i; k>0; k--) {
				System.out.print(" ");
			}
			
			//Mientras j sea menor o igual que i, mostramos un asterisco y un espacio, aumentamos 1 a j
			for(int j=1; j<=i; j++) {
				System.out.print("* "); //Mostramos
			}
			System.out.println(); //Saltamos de linea para formar la piramide
		}
		
		//Cerramos el escaner
		sc.close();
	}
}
