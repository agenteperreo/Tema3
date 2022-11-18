package entregables;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		/*PRUEBAS
		 * h=23 m=54 s=59 inc=1200 -> "Son las 0:14:59"
		 * h=12 m=5 s=32 inc=237 -> "Son las 12:9:29"
		 * h=23 m=59 s=59 inc=3601 -> "Son las 1:0:0"
		 * h=3 m=26 s=18 inc=63 -> "Son las 3:27:21"
		*/
		
		
		//Declaramos las variables
		int h, m, s, inc; //Horas, minutos, segundos, segundos a incrementar
			
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos la hora, minutos y segundos
		System.out.println("¿Que hora es?");
		System.out.print("Hora: ");
		h=sc.nextInt();
		System.out.print("Minutos: ");
		m=sc.nextInt();
		System.out.print("Segundos: ");
		s=sc.nextInt();
		
		//Pedimos cuantos segundos va a incrementar
		System.out.print("¿Cuantos segundos quieres aÃ±adir?: ");
		inc=sc.nextInt();
		
		//Restamos 1 a i por iteración hasta que sea menor que 0 e i es los segundos a incrementar
		for (int i=inc; i>0; i--) {
			//AÃ±adimos un segundo
			s++;
			//Si los segundos son 60
			if (s==60) {
				m++; //Se añade 1 a minutos
				s=0; //Igualamos a 0 los segundos
			}
			//Si los minutos son 60
			if (m==60) {
				h++; //Se añade una hora
				m=0; //Igualamos los minutos a 0
			}
			//Si las horas son 24
			if (h==24)
				h=0; //Las igualamos a 0
		}
		
		//Mostramos la hora actual
		System.out.printf("Son las %d:%d:%d",h,m,s);
		
		//Cerramos el escaner
		sc.close();
			
	}

}
