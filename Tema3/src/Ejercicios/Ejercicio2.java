package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Declaramos las variables
		int res = 0, num, cont=0;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el primer numero
		System.out.println("Dime numeros y te hago las suma(pon un numero negativo para terminar): ");
		num = sc.nextInt();

		// While
		while (num >= 0) { // Seguir si el numero es mayor o igual que0
			res += num; // Sumar el numero al resultado
			num = sc.nextInt(); // Seguimos pidiendo numeros
			cont++;
		}

		// Mostramos el resultado
		System.out.printf("Has sumado %d numeros\n",cont);
		System.out.printf("El resultado de la suma es: %d\n", res);

		// Cerramos el escaner
		sc.close();

	}

}
