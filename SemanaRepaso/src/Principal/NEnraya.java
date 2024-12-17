package Principal;

import java.util.Scanner;

public class NEnraya {
	static Scanner sc=new Scanner(System.in);
	
	public static void rellenarSoluciones(int m[][]) {
	    int nf=m.length,nc=m[0].length,c=0;
	    
	    for(int i=0;i<nc;i++) {
	    	m[nf-2][i]=(i*nc)+(i+1);
	    	m[nf-1][i]=(i*nc)+(nc-i);
	    	for(int j=0;j<nc;j++) {
	    		m[c][j]=(i*nc)+(j+1);  //filas
	    		m[c+nc][j]=(j*nc)+(i+1); //columnas
	    	}
	    	c++;
	    }
	}
	public static void imprimir(int m[][]) {
		   int nf=m.length,nc=m[0].length;
		   
		  for(int i=0;i<nf;i++) {
		    	for(int j=0;j<nc;j++) {
		         System.out.printf("%3d",m[i][j]);	
		    	}
		    	System.out.println();
		  }
	}
	public static void tablero(int nc) {
			   
		  for(int i=0;i<nc;i++) {
		    	for(int j=0;j<nc;j++) {
		         System.out.printf("%3d",(i*nc)+(j+1));	
		    	}
		    	System.out.println();
		  }
	}
	public static void imprimir(String m[][]) {
		   
		  for(int i=0;i<m.length;i++) {
		    	for(int j=0;j<m[0].length;j++) {
		         System.out.printf("%s",m[i][j]);	
		    	}
		    	System.out.println();
		  }
	}
	public static void rellenarMovimientos(String m[][]) {
		   
		  for(int i=0;i<m.length;i++) {
		    	for(int j=0;j<m[0].length;j++) {
		        m[i][j]="-";	
		    	}
			  }
	}
	public static void tirar(String m[][],boolean jug) {
		while(true) {
		System.out.print("Dime la posición");
		int pos=Integer.valueOf(sc.nextLine());
		int nc=(pos-1)%m.length;
		int nf=(pos-1)/m.length;
		if (m[nf][nc]=="-") {
			m[nf][nc]=jug ?"X":"O";
			break;
		}
		}
		
	}
	public static boolean comprobar(boolean jug,String mov[][],int sol[][]) {
		   int aciertos,m,c,f;
		   String cadena=jug ?"X":"O";
		for(int i=0;i<sol.length;i++) {
			aciertos=0;
			for(int j=0;j<sol[i].length;j++) {
				m=sol[i][j];
				c=(m-1)%sol[i].length;
				f=(int)((m-1)/sol[i].length);
				if (mov[f][c].equals(cadena))aciertos++;
			}
			if (aciertos==sol[i].length)return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		boolean jugador=true;
		System.out.print("Dime el nº de filas/columnas ");
	    int n3r=Integer.valueOf(sc.nextLine());
	    int nsoluciones=(n3r*2)+2;
	    String movimientos[][]=new String[n3r][n3r];
        int soluciones[][]=new int[nsoluciones][n3r];
        rellenarSoluciones(soluciones);
        rellenarMovimientos(movimientos);
        int jugador1=0,jugador2=0;
        
        while (true){
	        System.out.println(jugador ?"Juega 1":"Juega 2");
	        tablero(n3r);
	        tirar(movimientos,jugador);
	        imprimir(movimientos);
	        if (jugador) {	jugador1++; }else {	jugador2++;}
	        
	        if(jugador1>=n3r||jugador2>=n3r) {
	        	if (comprobar(jugador,movimientos,soluciones)) {
	        	   System.out.println("Gano el jugador "+ (jugador ?"jugador1":"jugador2"));
	        	   break;
	        	}
	        }
	        if (jugador1+jugador2==n3r*n3r) {
	     	   System.out.println("Gano empate");
	           break;
	        }
	        jugador=!jugador;
        }
	}

}
