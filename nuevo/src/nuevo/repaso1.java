package nuevo;

import java.util.Scanner;

public class repaso1 {

	static Scanner nuevo=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.print("Dime el primero numero-->");
		double numero1=Double.valueOf(nuevo.nextLine());
		
		System.out.print("Dime el segundo numero-->");
		double numero2=Double.valueOf(nuevo.nextLine());
		
		if (numero1>numero2) {
			System.out.println("El mayor es "+numero1);
		}else if(numero1<numero2) {
			System.out.println("El mayor es "+numero2);
		}else {
			System.out.println("Son iguales");
		}

	}

}
