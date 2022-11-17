package entregables;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		//Declaramos las variables
		int num;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el numero al usuario
		System.out.print("Dime un numero: ");
		num=sc.nextInt();
		
		//Mientras i sea menor o igual que el numero dado por el usuario, saltamos de linea y aumentamos 1 a i
		for (int i=1; i<=num; i++) {
			//Mientras j sea menor o igual que i, mostramos i y aumentamos 1 a j
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		//Cerramos el escaner
		sc.close();

	}

}
