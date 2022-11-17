package entregables;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Declaración de variables
		int num; //Donde guradaremos el numero del ususarios
		int contF=0; //Cantidad de numeros falldos
		int contT=1; //Cantidad de numeros introducidos
		int numA; //Numero anterior
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el numero inicicla al usuario
		System.out.print("Dime un numero inicial: ");
		num=sc.nextInt();
		
		//Mientras el numero no sea 0
		while(num!=0){
			numA=num;
			//Pedimos el siguiente numero
			System.out.print("Dime un numero: ");
			num=sc.nextInt();
			
			//Si el numero es 0, terminamos el bucle
			if(num==0) {
				break;
			}
			
			//Si el numero anterior es menor que el actual
			if (numA>num) {
				num=-99999999; //Cambiamos el numero a uno muy chcico
				System.err.println("Fallo, es menor."); //Mostramos el mensaje de error
				contF++; //Aumentamos en 1 el contador de errores
			}
			
			//Aumentamos en 1 el contador de numeros introducidos
			contT++; 
			
		}
		
		System.out.printf("Total de numeros introducidos: %d\n",contT);
		System.out.printf("Total de fallos: %d",contF);
		
		//Cerramos el escaner
		sc.close();

	}

}
