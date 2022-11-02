package bucles_dowhile;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		//Declaramos las variables
		int num, tabla=0, result;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos la tabla de un numero
		System.out.print("¿Que tabla quieres?: ");
		num=sc.nextInt();
		
		do {
			tabla++;
			result=num*tabla;
			System.out.printf("%dx%d=%d\n",num,tabla,result);
		}while(tabla<10);
		
		//Cerramos el escaner
		sc.close();
	}

}
