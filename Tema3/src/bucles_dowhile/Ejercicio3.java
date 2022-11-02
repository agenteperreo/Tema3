package bucles_dowhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {


		//Declaramos las variables
		int num, suma=0, numeros=0;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el numero al usuario
		System.out.print("Dime un numero: ");
		num=sc.nextInt();
		
		do {
			numeros++; //Aumentamos uno la variable que va a sumarse a la variable suma
			suma+=numeros; //Le sumamos
			if (numeros<num) { //si el numero es mayor a la variable que se suma
				System.out.printf("%d+",numeros); //Mostramos el numero con un + detras
			} else { //Si no
				System.out.printf("%d",numeros); //Mostramos el numero solo
			}
		}while(numeros<num); //Mientras el numero sea mayor que la variable que se suma

		//Mostramos el resultado de la suma
		System.out.printf("=%d",suma); 
		
		//Cerramos el escaner
		sc.close();
	}

}
