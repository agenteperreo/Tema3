package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		//declaracion de variables
		int edad, suma=0, contN=0, contM=0;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos la edad del primer alumno
		System.out.println("Dime la edad de cada niño(pon un numero negativo para terminar):");
		edad=sc.nextInt();
		
		//while para contabilizar la suma de las edades de los niños, cuantos niños, cuantos son mayores de edad y la media de edad
		while (edad>0) { //Seguir si la edad es mayor que 0
			if (edad>=18) { //Si la edad es mayo o igual que 18
				contM++; //Añdimos 1 al contador de mayores
			}
			//Sumamos la edad a la variable suma
			suma+=edad;
			
			//Añadimos 1 a el contador de niños
			contN++;
			
			//Pedimos la edad del siguiente niño
			edad=sc.nextInt();
		}
		
		//Mostramos la cantidad de niños
		System.out.printf("Hay %d niños\n",contN);
		//Mostramos la suma de las edades de los niños
		System.out.printf("La suma de las edades de los niños es %d\n",suma);
		//Mostramos la media de las edades de los niños
		System.out.printf("La media de las edades de los niños es %d\n",suma/contN);
		//Mostramos la cantidad de niños mayores de edad
		System.out.printf("La cantidad de niños mayores de edad es %d\n",contM);
		
		//Cerramos el escaner
		sc.close();

	}

}
