package entregables;

import java.util.Scanner;

public class Ejercicio8 {

	/*
	 * Realiza un programa que lea y acepte únicamente aquellos que sean mayores que
	 * el último dado. La introducción de números finaliza con la introducción de un
	 * 0. Al final se mostrará: 
	 * A. El total de números introducidos, excluido el 0. 
	 * B. El total de números fallados.
	 */

	public static void main(String[] args) {
		
		/*PRUEBAS
		 * num=20, 21, 8, 15, 10, 30, 0
		 * -> "Dime un numero inicial: 20
			   Dime un numero: 21
			   Dime un numero: 8
			   Fallo, es menor.
			   Dime un numero: 15
			   Dime un numero: 10
			   Fallo, es menor.
			   Dime un numero: 30
			   Dime un numero: 0
			   Total de numeros introducidos: 6
			   Total de fallos: 2"
		*/

		// Declaración de variables
		int num; // Donde guradaremos el numero del ususarios
		int contF = 0; // Cantidad de numeros falldos
		int contT = 1; // Cantidad de numeros introducidos
		int numA; // Numero anterior

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero inicicla al usuario
		System.out.print("Dime un numero inicial: ");
		num = sc.nextInt();

		// Mientras el numero no sea 0
		while (num != 0) {
			numA = num;
			// Pedimos el siguiente numero
			System.out.print("Dime un numero: ");
			num = sc.nextInt();

			// Si el numero es 0, terminamos el bucle
			if (num == 0) {
				break;
			}

			// Si el numero anterior es menor que el actual
			if (numA > num) {
				num = -99999999; // Cambiamos el numero a uno muy chcico
				System.err.println("Fallo, es menor."); // Mostramos el mensaje de error
				contF++; // Aumentamos en 1 el contador de errores
			}

			// Aumentamos en 1 el contador de numeros introducidos
			contT++;

		}

		System.out.printf("Total de numeros introducidos: %d\n", contT);
		System.out.printf("Total de fallos: %d", contF);

		// Cerramos el escaner
		sc.close();

	}

}
