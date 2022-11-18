package entregables;

import java.util.Scanner;

public class Ejercicio6 {

	/*
	 * Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre
	 * por pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada
	 * número tantas veces como su valor.
	 */

	public static void main(String[] args) {
		
		/*PRUEBAS
		 * num=5 -> "1
					 22
					 333
					 4444
					 55555"
		 * num=2 -> "1
					 22"
		 * num=7 -> "1
					 22
					 333
					 4444
					 55555
					 666666
					 7777777"
		*/

		// Declaramos las variables
		int num;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero al usuario
		System.out.print("Dime un numero: ");
		num = sc.nextInt();

		// Mientras i sea menor o igual que el numero dado por el usuario, saltamos de
		// linea y aumentamos 1 a i
		for (int i = 1; i <= num; i++) {
			// Mientras j sea menor o igual que i, mostramos i y aumentamos 1 a j
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		// Cerramos el escaner
		sc.close();

	}

}
