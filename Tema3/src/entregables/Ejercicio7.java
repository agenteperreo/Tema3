package entregables;

import java.util.Scanner;

public class Ejercicio7 {

	/*
	 * Escribe un programa que lea un n�mero n e imprima una pir�mide de n�meros con
	 * n filas como en la siguiente figura: 
	 * 1 
	 * 121 
	 * 12321 
	 * 1234321
	 */

	public static void main(String[] args) {
		
		/*PRUEBAS
		 * num=3 -> "1
					 121
					 12321"
		 * num=5 -> "1
					 121
					 12321
					 1234321
					 123454321"
		*/

		// Declaramo variable
		int num;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario un n�mero
		System.out.println("Introduzca un n�mero ");
		num = sc.nextInt();

		/*
		 * En un for, declaramos e inicializamos la variable i=1. Indicamos que i debe
		 * ser menor igual a num. Por cada iteraci�n, se incrementar� 1 a i
		 */
		for (int i = 1; i <= num; i++) {
			/*
			 * Dentro del for, abrimos otro for y declaramos e inicializamos la variable
			 * j=1. Indicamos que j debe ser menor o igual a j. Por cada iteraci�n, se
			 * incrementar� 1 a j
			 */
			for (int j = 1; j <= i; j++) {
				// Mostramos j
				System.out.print(j);
			}

			for (int k = i - 1; k > 0; k--) {
				// Mostramos k
				System.out.print(k);
			}

			// Saltamos de linea
			System.out.println();
		}

		// Cerramos el escaner
		sc.close();

	}

}
