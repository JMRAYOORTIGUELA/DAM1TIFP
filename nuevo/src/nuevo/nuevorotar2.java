package nuevo;

public class nuevorotar2 {

	public static int alea(int li,int ls) {
		return (int)(Math.random()*(ls-li+1))+li;
	}
	
	public static void rellenar(int m[][]) {
		
		for (int i = 0; i < m.length; i++) {
			 for (int j = 0; j < m[i].length; j++) {
				m[i][j]=alea(0,100);
			}
		}
		
	}
	public static void imprimir(int m[][]) {
		
		for (int i = 0; i < m.length; i++) {
			 for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%5d",m[i][j]);
			}
			 System.out.println();
		}
		
	}
	public static void rotar(int m[][],int r[][]) {
		int capas=m.length/2,tope;
		
	 for(int f=0;f<capas;f++) {
		 	tope=m.length-1-f;
		 
			for (int j = f; j < tope; j++) {
				r[f][j+1]=m[f][j];
				r[j+1][tope]=m[j][tope];
			}
			for (int j = tope; j >f ; j--) {
				r[tope][j-1]=m[tope][j];
				r[j-1][f]=m[j][f];
			}
	 }
	 if (m.length%2!=0)r[capas][capas]=m[capas][capas];
	}
	
	public static void main(String[] args) {
		int n=6;
		int matriz[][]=new int[n][n];
		int rotada[][]=new int[n][n];
		rellenar(matriz);
		
		System.out.println("Impresión de la matriz original\n\n");
		imprimir(matriz);
		
	
		 rotar(matriz,rotada);
	
		
		System.out.println("\nImpresión de la matriz rotada\n\n");
		imprimir(rotada);
		
		

	}

}
