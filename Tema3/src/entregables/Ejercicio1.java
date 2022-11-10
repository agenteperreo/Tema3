package entregables;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
			
		//Declaramos las variables
		int h, m, s, inc;
		double fin, inicio;
			
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
		System.out.print("¿Cuantos segundos quieres añadir?: ");
		inc=sc.nextInt();
		
		inicio=System.currentTimeMillis();		
		for (int i=inc; i>0; i--) {
			//Añadimos un segundo
			s++;
			//Si los segundos son 60
			if (s==60) {
				m++; //Se añade 1 a minutos
				s=0; //Igualamos a 0 los segundos
			}
			if (m==60) {
				h++;
				m=0;
			}
			if (h==24)
				h=0;
		}
		
		fin=System.currentTimeMillis();
		
		System.out.println(fin-inicio);
		//Mostramos la hora actual
		System.out.printf("Son las %d:%d:%d",h,m,s);
		
		//Cerramos el escaner
		sc.close();
			
	}

}
