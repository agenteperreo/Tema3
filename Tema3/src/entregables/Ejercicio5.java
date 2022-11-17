package entregables;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Declaramos las variables
		int a, b, mayor, mcm=0;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos los 2 numros
		System.out.println("Dime 2 numeros:");
		a = sc.nextInt();
		b = sc.nextInt();

		//Comprobamos cual es el mayor
		if (a>b) {
			mayor=a;
		} else {
			mayor=b;
		}
		
		//Hacemos un bucle infinito ya que el minimo comun multiplo siempre tiene solucion
		//Aumentamos en 1 al mayor mientras i sea mayor que 0(siempre) 
		for (int i=mayor; i>0; i++) {
			//Si el modulo de i entre a y b es 0, es minimo comun multiplo
			if (i%a == 0 && i%b==0) {
				mcm=i;
				break;
			}
		}
		
		//Mostramos cual es el minimo común multiplo
		System.out.printf("El minimo comun multiplo de %d y %d es %d",a,b,mcm);
		
		//Cerramos el escaner
		sc.close();
	}

}
