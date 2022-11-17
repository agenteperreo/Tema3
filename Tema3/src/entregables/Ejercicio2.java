package entregables;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaramos variables.
		int num;// Se guardará el número introducido por el usuario.
		boolean esPrimo = true;// Se guardará el valor esPrimo como true.
		int contador = 0;// Inicializamos un contador a 0.
		
		// Abrimos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Solicitamos al usuario un número.
		System.out.println("Introduzca un número para saber todos los número primos hasta él: ");
		num = sc.nextInt();
		
		// Si el numero se mayor que 0.
		if (num > 0) {
			/*
			 * Creamos un for, donde declaramos e inicializamos la variable i=2. Ponemos la
			 * condición de que i debe ser menor a num. Por cada iteración se incrementará i
			 * con a
			 */
			for (int i = 2; i < num; i++) {
				// En el caso, de que se cumpla la condición
				esPrimo = true;
				/*
				 * Creamos un Scanner, donde declaramos e inicializamos j=2. Ponemos la
				 * condición de que j debe ser menor a i. Por cada iteración se le sumará a j, 1
				 */
				for (int j = 2; j <= i; j++) {
					/*
					 * Una vez que entre en el bucle, se hará el módulo de num, en el caso de que
					 * tenga un divisor diferente a 1 o al propio num, la variable se convenrtirá en
					 * false y saldrá del bucle
					 */
					if (i % j  == 0) {
						esPrimo = false;
						break;
					}
				}
			}
			// En el caso de esPrimo sea true, se sumará uno a contador
			if (esPrimo) {
				contador++;
			}
			// En caso de que introduzca un número menor a 0, le mostrará ERROR.
		} else {
			System.out.println("No se ha introducido un entero positivo.");
		}
		// Como resultado, se le mostrará al usuario la cantidad de números primos.
		System.out.println("La cantidad de números primos es " + contador);
		// Finalmente, cerramos el Scanner
		sc.close();

	}

}
