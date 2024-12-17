package nuevo;

import java.util.Scanner;

public class veinteNumeros {
	static Scanner sc=new Scanner(System.in);
	
	public static void imprimir(int m[][]) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%5d",m[i][j]);
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		int nf=2,nc=2;
		int posiciones=nf*nc;
		int tb[][]=new int[nf][nc];
		int fila,columna,numero;
		
		for(int i=1;i<=posiciones;i++) {
			System.out.print("Dime el numero "+i+" ");
			numero=sc.nextInt();
			fila=  (int) ((i-1)/nc);
			columna=i-(fila*nc)-1;
			tb[fila][columna]=numero;
		}
        imprimir(tb);
	}

}
