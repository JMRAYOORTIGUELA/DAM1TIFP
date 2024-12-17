package nuevo;

public class nuevorotar {

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
		int aux=10,ulti,capas=m.length/2;
		
	 for(int f=0;f<capas;f++) {
			for (int j = f; j < m.length-1-f; j++) {
				r[f][j+1]=m[f][j];
				r[f][j]=aux;
				aux=m[f][j];
			}
			
			for (int i = f; i < m.length-1-f; i++) {
				ulti=m[i].length-1-f;
				r[i+1][ulti]=m[i][ulti];
				r[i][ulti]=aux;
				aux=m[i][ulti];
			}
			
			for (int j = m.length-1-f; j >f ; j--) {
				ulti=m.length-1-f;
				r[ulti][j-1]=m[ulti][j];
				r[ulti][j]=aux;
				aux=m[ulti][j];
				
			}
			for (int i = m.length-1-f; i >f ; i--) {
				ulti=f;
				r[i-1][ulti]=m[i][ulti];
				r[i][ulti]=aux;
				aux=m[i][ulti];
			}
	 }
	 if (m.length%2!=0)r[capas][capas]=m[capas][capas];
	}
	
	public static void main(String[] args) {
		int n=5;
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
