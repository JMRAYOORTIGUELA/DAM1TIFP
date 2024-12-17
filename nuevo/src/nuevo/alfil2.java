package nuevo;

import java.util.ArrayList;
import java.util.Scanner;

public class alfil2 {
	    public static final String ANSI_BLACK = "\u001B[30m";
		public static final String ANSI_RED = "\u001B[31m";
		public static final String ANSI_GREEN = "\u001B[32m";
		public static final String ANSI_YELLOW = "\u001B[33m";
		public static final String ANSI_BLUE = "\u001B[34m";
		public static final String ANSI_PURPLE = "\u001B[35m";
		public static final String ANSI_CYAN = "\u001B[36m";
		public static final String ANSI_WHITE = "\u001B[37m";
		public static final String ANSI_RESET = "\u001B[0m";
		public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
		public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
		public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
		public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
		public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
		public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
		public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
		public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
		public static final String ALFIL = "♝ ";
		public static final String ALFIL2 = "a ";
	
   static Scanner sc=new Scanner(System.in);
   static final String columnas="abcdefgh";
   static final String filas="87654321";
   
   public static void diagonal1(int nf,int nc,ArrayList<String> s,String p[][]) {
	   s.add("Diag1");
	   while (true){
			--nf;
			++nc;
			if (!(nf>=0 && nf<=7 &&nc>=0 && nc<=7))break;
			p[nf][nc]="* ";
			s.add(String.valueOf(columnas.charAt(nc))+String.valueOf(filas.charAt(nf)));
		}
   }
   public static void diagonal2(int nf,int nc,ArrayList<String> s,String p[][]) {
	   s.add("Diag2");
	   while (true){
			--nf;
			--nc;
			if (!(nf>=0 && nf<=7 &&nc>=0 && nc<=7))break;
			p[nf][nc]="* ";
			s.add(String.valueOf(columnas.charAt(nc))+String.valueOf(filas.charAt(nf)));
		}
   }
   public static void diagonal3(int nf,int nc,ArrayList<String> s,String p[][]) {
	   s.add("Diag3");
	   while (true){
			++nf;
			++nc;
			if (!(nf>=0 && nf<=7 &&nc>=0 && nc<=7))break;
			p[nf][nc]="* ";
			s.add(String.valueOf(columnas.charAt(nc))+String.valueOf(filas.charAt(nf)));
		}
   }
   public static void diagonal4(int nf,int nc,ArrayList<String> s,String p[][]) {
	   s.add("Diag4");
	   while (true){
			++nf;
			--nc;
			if (!(nf>=0 && nf<=7 &&nc>=0 && nc<=7))break;
			p[nf][nc]="* ";
			s.add(String.valueOf(columnas.charAt(nc))+String.valueOf(filas.charAt(nf)));
		}
   }
   public static String blanco(String c) {
	   return ANSI_WHITE_BACKGROUND + ANSI_BLUE + c+ANSI_RESET;
   }
   public static String negro(String c) {
	   return ANSI_BLACK_BACKGROUND + ANSI_BLUE + c+ANSI_RESET;
   }
   public static void tablero(String p[][]) {
  		boolean inicio;
  		String cadena;
  		
  		System.out.print("   ");
  		for(int i=0;i<=7;i++) System.out.print(columnas.charAt(i)+" ");
  		System.out.println();
  		
  		System.out.print(" ");
  		for(int i=0;i<=9;i++) System.out.print("░░");
  		System.out.println();
  		
  		for(int i=0;i<=7;i++) {
  			inicio=i%2==0 ?true:false;
  			System.out.print(filas.charAt(i)+"░░");
  		   for (int j=0;j<=7;j++) {
  			   cadena=inicio ? blanco(p[i][j]):negro(p[i][j]);
			   System.out.print(cadena);
  			  inicio=!inicio;	   
  		   }
  		   System.out.println("░░"+filas.charAt(i));
  		}
  		System.out.print(" ");
  		for(int i=0;i<=9;i++) System.out.print("░░");
  		System.out.println();
  		
  		System.out.print("   ");
  		for(int i=0;i<=7;i++) System.out.print(columnas.charAt(i)+" ");
  		System.out.println();
   }
   public static void rellenar(String p[][]) {
	   for(int i=0;i<=7;i++) {
		   for(int j=0;j<=7;j++) {
			   p[i][j]="  ";
		   }
	   }
   }
   	public static void main(String[] args) {
   		ArrayList<String> soluciones=new ArrayList<String>();
          String piezas[][]=new String[8][8];
          rellenar(piezas);
          tablero(piezas);
		  System.out.print("\nDime la posición actual del alfil "); String
		  posicion=sc.nextLine(); 
		  int nc=columnas.indexOf(posicion.charAt(0)); int
		  nf=filas.indexOf(posicion.charAt(1));
		  piezas[nf][nc]=ALFIL;
		  diagonal1(nf,nc,soluciones,piezas);
		  diagonal2(nf,nc,soluciones,piezas); 
		  diagonal3(nf,nc,soluciones,piezas);
		  diagonal4(nf,nc,soluciones,piezas);
		  tablero(piezas);
		  for (String item : soluciones)System.out.print(item+" "); 
		 
	}

}
