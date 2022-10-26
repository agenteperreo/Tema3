package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Declaramos las variables
		int num, resto;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el primer numero
		System.out.println("Dime numeros y te diré si son pares o inpares(pon 0 para terminar): ");
		num = sc.nextInt();

		// While para calcular si es par o inpar hasta que el numero sea 0
		while (num != 0) { // Mientras el numero no sea igual a 0
			resto = num % 2; // Calculamos el modulo del numero entre 2
			if (resto == 0) { // Si el resto es 0
				System.out.printf("El numero %d es par", num); // El numero es par
				System.out.println(); // Para separar
			} else { // Si no es 0
				System.out.printf("El numero %d es impar", num); // El numero es impar
				System.out.println(); // Para separar
			}
			num = sc.nextInt(); // Pedimos de nuevo el numero
		}

		// Mostramos que se ha terminado el programa
		System.out.println("Programa finalizado. adios!!");

		// Cerramos el escaner
		sc.close();

	}

}
