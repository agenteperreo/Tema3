package entregables;

import java.util.Scanner;

public class Ejercicio10 {

	/*
	 * Realiza un programa que nos diga si un número introducido por teclado es
	 * capicúa o no. El número debe ser mayor o igual que 0.
	 */

	public static void main(String[] args) {
		
		/*PRUEBAS
		 * num=0 --> "Es capicua"
		 * num=-8, -2, 12 -> "El numero tiene que ser mayor o igual a 0,
		 					  El numero tiene que ser mayor o igual a 0,
		 					  No es capicua"
		 * num=76467 -> "Es capicua"
		 * num=9746 -> "No es capicua"*/
		
		// Declaramos variables
		int num; // Numero del usuario
		int reves; // Numero al reves
		int cifras = 0; // Cifras del numero
		int resto; // Resto del modulo

		// Abrimos el Scanner
		Scanner sc = new Scanner(System.in);

		// Hacemos un do while para que pida el numero almenos una vez
		do {
			// Pedimos un número al usuario
			System.out.print("Dime un numero: ");
			num = sc.nextInt();
			if (num<0) {
				System.err.println("El numero tiene que ser mayor o igual a 0");
			}
		} while (num < 0);

		// Equivalemos el numero a la variable reves
		reves = num;
		// Mientras reves no sea 0
		while (reves != 0) {
			// Descomponemos el número
			resto = reves % 10;
			cifras = cifras * 10 + resto;
			reves = reves / 10;
		}

		// Si el numero normal es igual al numero al reves es capicua
		if (num == cifras) {
			System.out.println("Es capicua");
		} else { // Si no no es capicúa
			System.out.println("No es capicua");
		}
		// Cerramos el escaner
		sc.close();

	}

}
