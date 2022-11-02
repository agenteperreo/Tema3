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
			numeros++;
			suma+=numeros;
		}while(numeros<num);

	}

}
