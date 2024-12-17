package nuevo;

import java.util.Iterator;

public class sobrecargaMetodos {
	
	public static void imprimir(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%5d",m[i][j]);
			}
			System.out.println();
		}
	}
    public static void imprimir(double m[][]) {
    	for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%10.2f",m[i][j]);
			}
			System.out.println();
		}
	}
	public static int suma(int a,int b) {
		return a+b;
	}
	public static double suma(double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
		int tb[][]= {{1,2,3},{4,5,6}};
		double tc[][]= {{1.5,2.5,3.5},{4.5,5.5,6.5}};

		imprimir(tb);
		imprimir(tc);
		
		System.out.println(suma(1,2));
		System.out.println(suma(1.5,2.5));
	}

}
