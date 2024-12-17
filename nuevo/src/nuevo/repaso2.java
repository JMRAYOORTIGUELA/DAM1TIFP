package nuevo;

import java.util.Scanner;

public class repaso2 {

	static Scanner nuevo=new Scanner(System.in);
	
	public static void main(String[] args) {
		double numero,suma=0;
		int c=0;
		
		while (true) {
			System.out.print("Dime el numero ");
		    numero=Double.valueOf(nuevo.nextLine());	
			if (numero<0)break;
			
			c++;
			suma +=numero;
			
		}
		
		System.out.printf("Nº de valores introducidos=%d y su suma=%.2f",c,suma);
		

	}

}
