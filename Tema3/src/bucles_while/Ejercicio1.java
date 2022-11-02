package bucles_while;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
	
		//Declaramos las variables
		int res=0, num;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el primer numero
		System.out.println("Dime numeros y te hago las suma(pon un numero negativo para terminar): ");
		num=sc.nextInt();
		
		//While
		while (num>=0) { //Seguir si el numero es mayor o igual que0
			res+=num; //Sumar el numero al resultado
			num=sc.nextInt(); //Seguimos pidiendo numeros
		}
		
		//Mostramos el resultado
		System.out.printf("El resultado de la suma es: %d\n",res);
		
		//Cerramos el escaner
		sc.close();
	}
	
}
