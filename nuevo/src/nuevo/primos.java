package nuevo;

import java.util.Scanner;

public class primos {

	static Scanner sc=new Scanner(System.in);
	
	public static boolean primo(int n) {
		
		for (int i = 2; i <=n-1; i++) {
			if (n%i==0) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		int nprimos=0;
		
		for (int i = 0; i <=500 && nprimos<15; i++) {
			
			if (primo(i))System.out.println(++nprimos+" "+i);
		
			
		}
		

	}

}
