package bucles_dowhile;

public class Ejercicio1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Declaramos las variables
		int num=1;
		
		do {
			System.out.println(num);
			num++;
			Thread.sleep(1000);
		} while(num<=20);

	}

}
