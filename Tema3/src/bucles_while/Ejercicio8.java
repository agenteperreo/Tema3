package bucles_while;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		double altura, alturaMAX=0;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos la primera altura
		System.out.print("Dime la altura de los arboles(escriba -1 para terminar): ");
		altura=sc.nextDouble();
		
		//Bucle para seguir pidiendo alturas
		while (altura!=-1) {
			if (altura>alturaMAX) { //Si la altura es mayor que la altura maxima
				alturaMAX=altura; //La nueva altura maxima es la altura introducida
			}
			
			if (altura<0) { //Si la altura es negativa
				System.out.println("Altura no valida"); //Mostramos un mensaje de que la altura no es valida
			}
			
			//Seguimos pidiendo alturas
			altura=sc.nextDouble();
		}
		
		//Mostramos cual es la altura maxima
		System.out.printf("El arbol mas alto mide %.2fm",alturaMAX);
		
		//Cerramos el escaner
		sc.close();

	}

}
