package bucles_while;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		int num, sumaN=0, contN=0, cont0=0, suma=0, cN=1;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los numeros
		System.out.println("Dime 10 numeros enteros:");
		num=sc.nextInt();
		
		while (cN<10) { //Mientras el contador de numeros sea menor que 10
			if (num>0) { //Si el numero es mayor que cero
				suma+=num; //Sumamos el numero a la variable suma
			}else if(num<0) { //Si el numero es menor que 0
				sumaN+=num; //Sumamos el numero a la variable sumaN
				contN++; //Aumentamos en uno el contador de numero negativos
			}else { //Si no el numero es 0
				cont0++; //aumentamos en 1 el contador de ceros
			}
			
			//Sumamos 1 al contador de numeros
			cN++;
			
			//Pedimos el siguiente numero
			num=sc.nextInt();			
		}
		
		System.out.printf("La suma de los numeros positivos es %d\n",suma); //Mostramos la suma de los numeros positivos
		System.out.printf("La media de los numeros negativos es %d\n",sumaN/contN); //Mostramos la media de los numeros negativos
		System.out.printf("La cantidad de ceros introducidos es %d\n",cont0); //Motramos la cantidad de ceros que se han introducido
		
		//Cerramos el escaner
		sc.close();

	}

}
