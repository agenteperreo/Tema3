package bucles_while;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Declaramos las variables
		int res = 0, num, cont = 0; //Resultado, numero y contador

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el primer numero
		System.out.println("Dime numeros y te hago la media(pon un numero negativo para terminar): ");
		num = sc.nextInt();

		// While
		while (num >= 0) { // Seguir si el numero es mayor o igual que0
			res += num; // Sumar el numero al resultado
			num = sc.nextInt(); // Seguimos pidiendo numeros
			cont++; //Sumamos 1 al contador
		}

		// Mostramos la media de los numeros introducidos
		System.out.printf("La media de los numeros es: %d",res/cont);

		// Cerramos el escaner
		sc.close();

	}

}
