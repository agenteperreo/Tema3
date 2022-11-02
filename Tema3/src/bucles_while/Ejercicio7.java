package bucles_while;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Declaramos las variables
		int numA, numU;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Generamos un numero aleatorio entre 1 y 100
		numA = (int) (Math.random() * 100);

		// Pedimos el primer numero al usuario
		System.out.print(
				"Dime un numero y te dire si es mayor o menor que el numero secreto(numero negativo para rendirte): ");
		numU = sc.nextInt();

		// Bucle para seguir preguntando hasta que acierte o se rinda
		while (numU != numA && numU >= 0) {
			if (numU < numA) {//Si el numero introducido por el usuario es menor que el numero aleatorio
				System.out.println("El numero secreto es mayor"); 
			}else if (numU > numA) {//Si el numero introducido por el usuario es mayor que el numero aleatorio
				System.out.println("El numero secreto es menor");
			}
			
			//Pedimos otro numero
			numU=sc.nextInt();
		}
		
		if (numU==numA) { //Si el numero introducido por el usuario es equivalente al aleatorio
			System.out.printf("Acertaste, el numero era %d",numA); //Mostramos que acertó y cual es el numero
		} else { //Si el numero introducido por el usuario es diferente al aleatorio es que se ha rendido
			System.out.printf("¿Te rendiste? Vaya. El numero era %d",numA); //Mostramos un mensaje y decimos cual era el numero
		}
		
		//Cerramos el escaner
		sc.close();

	}

}
