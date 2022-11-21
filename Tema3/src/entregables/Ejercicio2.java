package entregables;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		/*PRUEBAS
		 * num=5 -> "Entre 1 y 5 hay 3 números primos"
		 * num=9 -> "Entre 1 y 9 hay 4 números primos"
		 * num=2 -> "Entre 1 y 2 hay 1 números primos"
		*/

		//Declaración de variables
		int num; //Numero introducido por el usuario
		int cont = 0; //Variable contador para saber cuantos numeros primos hay
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		//Pedimos el numero al usuario
		System.out.print("Dime un número: ");
		num = sc.nextInt();

		//Si el nnumero es mayor que 0
		if (num > 0) {

			// Repetimos lo de dentro hasta que i sea mayor que el numero del usuario
			for (int i = 2; i <= num; i++) {
				
				//Añadimos 1 al contador
				cont++; 

				//Repetimos lo de dentro hasta que j sea equivalente a i
				for (int j = 2; j < i; j++) {

					//Si el modulo de i y j es 0 no es primos
					if (i % j == 0) {
						//restamos 1 al contador 
						cont--;
						//Terminamos el 2º bucle for
						break;
					
					}

				}
				
			}

			//Mostramos la cantidad de numeros primos que hay
			System.out.printf("Entre 1 y %d hay %d números primos",num,cont); 

		} else { //Si el numero es menor o igual que 0

			System.err.println("ERROR: Numero no valido"); // Mostramos un mensaje de error

		}

		//Cerramos el escaner
		sc.close();

	}

}
