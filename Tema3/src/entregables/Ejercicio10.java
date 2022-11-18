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
		int num; // Se guardará el número introducido por el usuario
		int reves; // Se guardará el número dado la vuelta
		int cifras = 0; // Se guardará la descomposición del número
		int resto;// Se guardará el resto de la división

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

		// Invertimos el número
		reves = num;
		// Abrimos un while para mientras que invert sea distinto de cero:
		while (reves != 0) {
			// Descomponemos el número
			resto = reves % 10;
			cifras = cifras * 10 + resto;
			reves = reves / 10;
		}

		// Si num == a descomp, mostrará el siguiente mensaje, en caso contrario otro
		// mensaje distinto.
		if (num == cifras) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}
		// Finalmente, cerramos el Scanner
		sc.close();

	}

}
