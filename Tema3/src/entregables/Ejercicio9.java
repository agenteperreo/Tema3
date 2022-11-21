package entregables;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		//Declaración de variables
        int num; //Numero que pedimos al usuario
        int cont = 0; //Contador

        // Abrimos escaner
        Scanner sc = new Scanner(System.in);

        // Pedimos el numero al usuario
        System.out.println("Dime un número mayor que 0: ");
        num = sc.nextInt();
        
        // Si el numero es mayor que 0
        if (num > 0) {
        	
            //Mientras el numero no sea 0
        	while(num!=0) {
        		cont++; //Añadimos 1 al contador de cifras
        		num/=10; //Dividimos el numero entre 10 para que pierda una cifra
        	}
        	
            // Imprimimos el resultado.
            System.out.printf("El número tiene %d cifras",cont);
            
        } else { // Si no es mayor que 0
            System.err.println("El número es menor que 0"); //Mostramos un mensaje de error
        }
        
        // Cerramos el escaner
        sc.close();

	}

}
