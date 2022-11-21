package entregables;

import java.util.Scanner;

public class Ejercicio7 {

	/*
	 * Escribe un programa que lea un número n e imprima una pirámide de números con
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

		// Declaración de variables
		int num;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario un número
		System.out.println("Introduzca un número ");
		num = sc.nextInt();

		// Hacemos lo de dentro hast que i sea mayor que el numero del usuario
		for (int i = 1; i <= num; i++) {
			
			// Mostramos j hast que sea mayor que i
			for (int j = 1; j <= i; j++) {
				// Mostramos j
				System.out.print(j);
			}

			//Mostramos k hasta que sea igual a 0
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
