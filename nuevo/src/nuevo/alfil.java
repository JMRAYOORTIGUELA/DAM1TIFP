package nuevo;

import java.util.Scanner;

public class alfil {
   static Scanner sc=new Scanner(System.in);
   static String columnas="abcdefgh";
   static String filas="87654321";
   public static void diagonal1(int nf,int nc,String title) {
	   System.out.println(title);
	   while (true){
			--nf;
			++nc;
			if (!(nf>=0 && nf<=7 &&nc>=0 && nc<=7))break;
			System.out.println(String.valueOf(columnas.charAt(nc))+String.valueOf(filas.charAt(nf)));
		}
   }
   public static void diagonal2(int nf,int nc,String title) {
	   System.out.println(title);
	   while (true){
			--nf;
			--nc;
			if (!(nf>=0 && nf<=7 &&nc>=0 && nc<=7))break;
			System.out.println(String.valueOf(columnas.charAt(nc))+String.valueOf(filas.charAt(nf)));
		}
   }
   public static void diagonal3(int nf,int nc,String title) {
	   System.out.println(title);
	
	   while (true){
			++nf;
			++nc;
			if (!(nf>=0 && nf<=7 &&nc>=0 && nc<=7))break;
			System.out.println(String.valueOf(columnas.charAt(nc))+String.valueOf(filas.charAt(nf)));
		}
   }
   public static void diagonal4(int nf,int nc,String title) {
	   System.out.println(title);
	
	   while (true){
			++nf;
			--nc;
			if (!(nf>=0 && nf<=7 &&nc>=0 && nc<=7))break;
			System.out.println(String.valueOf(columnas.charAt(nc))+String.valueOf(filas.charAt(nf)));
		}
   }

   	public static void main(String[] args) {


		System.out.print("Dime la posición actual del alfil ");
		String posicion=sc.nextLine();
		int nc=columnas.indexOf(posicion.charAt(0));
		int nf=filas.indexOf(posicion.charAt(1));
	    diagonal1(nf,nc,"Diagonal1");
	    diagonal2(nf,nc,"Diagonal2");
	    diagonal3(nf,nc,"Diagonal3");
	    diagonal4(nf,nc,"Diagonal4");
	}

}
