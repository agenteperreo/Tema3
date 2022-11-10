package Pruebas;

import java.util.Scanner;

public class E1_entregable {

	public static void main(String[] args) {

		// Declaramos las variables
		int h, m, s, inc;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos la hora, minutos y segundos
		System.out.println("¿Que hora es?");
		System.out.print("Hora: ");
		h = sc.nextInt();
		System.out.print("Minutos: ");
		m = sc.nextInt();
		System.out.print("Segundos: ");
		s = sc.nextInt();

		// Pedimos cuantos segundos va a incrementar
		System.out.print("¿Cuantos segundos quieres añadir?: ");
		inc = sc.nextInt();

		m += ((s + inc) / 60);
		s = ((s + inc) % 60);
		h += (m / 60);
		m = m % 60;
		if (h > 23) {
			h %= 24;
		}

		System.out.printf("%d:%d:%d", h, m, s);

		sc.close();
	}

}
