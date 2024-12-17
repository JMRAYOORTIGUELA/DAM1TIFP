package nuevo;

import java.util.Iterator;

public class Ejer3Matrices {

	public static void rellenar(String z[][]) {
		for(int i=0;i<z.length;i++) {
			for(int j=0;j<z[i].length;j++) {
				z[i][j]="";
			}
		}
	}
	public static void imprimir(String z[][]) {
		for(int i=0;i<z.length;i++) {
			for(int j=0;j<z[i].length;j++) {
				System.out.printf("%5s",z[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		String m[][]=new String[3][6];
		
		rellenar(m);
		m[0][0]="0";
		m[0][1]="30";	
		m[0][2]="2";	
		m[0][5]="5";
		m[1][0]="75";
		m[1][4]="0";
		m[2][2]="-2";
		m[2][3]="9";
		m[2][5]="11";
		
		String qq[][]= {
			       {"0","30","2","","","5"},
			       {"75","","","","0",""},
			       {"","","-2","9","","11"}
			       };	
		
		System.out.println("\nImpresion de de m\n");
		imprimir(m);
		System.out.println("\nImpresion de de qq\n");
		imprimir(qq);

	}

}
