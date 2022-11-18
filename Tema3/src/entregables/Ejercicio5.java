package entregables;

import java.util.Scanner;

public class Ejercicio5 {

	/*
	 * De forma similar a la actividad 4, realiza un programa que calcule el mínimo
	 * común múltiplo de dos números dados. En este caso, habrá que partir del
	 * máximo de los dos e ir incrementando hasta encontrar el primer número que sea
	 * múltiplo de los dos números.
	 */

	public static void main(String[] args) {
		
		/*PRUEBAS
		 * a=22 b=65 -> "El minimo comun multiplo de 22 y 65 es 1430"
		 * a=2 b=10 -> "El minimo comun multiplo de 2 y 10 es 10"
		 * a=13 b=24 -> "El minimo comun multiplo de 13 y 24 es 312"
		*/

		// Declaramos las variables
		int a, b, mayor, mcm = 0;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos los 2 numros
		System.out.println("Dime 2 numeros:");
		a = sc.nextInt();
		b = sc.nextInt();

		// Comprobamos cual es el mayor
		if (a > b) {
			mayor = a;
		} else {
			mayor = b;
		}

		// Hacemos un bucle infinito ya que el minimo comun multiplo siempre tiene
		// solucion
		// Aumentamos en 1 al mayor mientras i sea mayor que 0(siempre)
		for (int i = mayor; i > 0; i++) {
			// Si el modulo de i entre a y b es 0, es minimo comun multiplo
			if (i % a == 0 && i % b == 0) {
				mcm = i;
				break;
			}
		}

		// Mostramos cual es el minimo común multiplo
		System.out.printf("El minimo comun multiplo de %d y %d es %d", a, b, mcm);

		// Cerramos el escaner
		sc.close();
	}

}
