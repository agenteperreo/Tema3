package entregables;

import java.util.Scanner;

public class Ejercicio4 {

	/*
	 * Para dos números dados, a y b, es posible calcular el máximo común divisor
	 * (el número más grande que divide a ambos) mediante un algoritmo ineficiente
	 * pero sencillo: desde el menor de a y b, ir buscando, de forma decreciente
	 * (-1), el primer número que divide a ambos simultáneamente. Teniendo en cuenta
	 * lo que se acaba de explicar, realiza un programa que calcule el máximo común
	 * divisor de dos números.
	 */
	
	public static void main(String[] args) {
		
		/*PRUEBAS
		 * a=18 b=26 -> "El maximo comun divisor es 2"
		 * a=10 b=5 -> "El maximo comun divisor es 5"
		 * a=23562 b=15673 -> "El maximo comun divisor es 7"
		*/

		// Declaramos las variables
		int a, b, menor, MCD = 0;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos los 2 numros
		System.out.println("Dime 2 numeros:");
		a = sc.nextInt();
		b = sc.nextInt();

		// Comprobamos quien es el menor
		if (a < b) {
			menor = a;
		} else {
			menor = b;
		}

		// Decrementamos 1 al menor mientras este sea mayor que 0
		for (int i = menor; i > 0; i--) {
			// Si el modulo de "a" e "i" y "b" e "i" es 0, es el Maximo Comun Divisor y cortamos el bucle ahi
			if (a % i == 0 && b % i == 0) {
				MCD = i;
				break;
			}
		}
		// Mostramos cual es el Maximos Comun Divisor
		System.out.printf("El maximo comun divisor es %d", MCD);

		// Cerramos el escaner
		sc.close();

	}

}
