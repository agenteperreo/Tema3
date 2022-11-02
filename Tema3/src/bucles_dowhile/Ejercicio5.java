package bucles_dowhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Declaramos las variables
		int numAl;
		String num="";

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Numero aleatorio
		numAl = (int) (Math.random() * 100);

		// Explicamos el juego al usuario
		System.out.println(
				"Piensa un numero entre 1 y 100. El ordenador nos dira un numero un numero aleatorio y tendremos que decir 'M' si el numero pensado es mayor o 'N' si es menor o 'I' si es igual");
		
		do {
			System.out.println(numAl);
			num=sc.next();
			
		}while(num!="I");
	}

}
