package entregables;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaramos variables.
		int num;// Se guardar� el n�mero introducido por el usuario.
		boolean esPrimo = true;// Se guardar� el valor esPrimo como true.
		int contador = 0;// Inicializamos un contador a 0.
		
		// Abrimos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Solicitamos al usuario un n�mero.
		System.out.println("Introduzca un n�mero para saber todos los n�mero primos hasta �l: ");
		num = sc.nextInt();
		
		// Si el numero se mayor que 0.
		if (num > 0) {
			/*
			 * Creamos un for, donde declaramos e inicializamos la variable i=2. Ponemos la
			 * condici�n de que i debe ser menor a num. Por cada iteraci�n se incrementar� i
			 * con a
			 */
			for (int i = 2; i < num; i++) {
				// En el caso, de que se cumpla la condici�n
				esPrimo = true;
				/*
				 * Creamos un Scanner, donde declaramos e inicializamos j=2. Ponemos la
				 * condici�n de que j debe ser menor a i. Por cada iteraci�n se le sumar� a j, 1
				 */
				for (int j = 2; j <= i; j++) {
					/*
					 * Una vez que entre en el bucle, se har� el m�dulo de num, en el caso de que
					 * tenga un divisor diferente a 1 o al propio num, la variable se convenrtir� en
					 * false y saldr� del bucle
					 */
					if (i % j  == 0) {
						esPrimo = false;
						break;
					}
				}
			}
			// En el caso de esPrimo sea true, se sumar� uno a contador
			if (esPrimo) {
				contador++;
			}
			// En caso de que introduzca un n�mero menor a 0, le mostrar� ERROR.
		} else {
			System.out.println("No se ha introducido un entero positivo.");
		}
		// Como resultado, se le mostrar� al usuario la cantidad de n�meros primos.
		System.out.println("La cantidad de n�meros primos es " + contador);
		// Finalmente, cerramos el Scanner
		sc.close();

	}

}
