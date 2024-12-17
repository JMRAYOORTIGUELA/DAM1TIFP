package nuevo;

public class nuevorotar3 {
	  static final String colores[][] = {
	  {"34","Azul"},{"32","Verde"},{"31","Rojo"},{"36","Cian"},
	  {"33","Amarillo"},{"35","Magenta"},{"37","Blanco"},{"30","Negro"},
	  {"90","Gris claro"},{"91","Rojo claro"},{"92","Verde claro"},
	  {"93","Amarillo claro"},{"94","Azul claro"},{"95","Magenta claro"},
	  {"96","Cian claro"},{"97","Blanco brillante"}};	
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
	public static void imprimir(int m[][],int c[][]) {
		
		for (int i = 0; i < m.length; i++) {
			 for (int j = 0; j < m[i].length; j++) {
				System.out.printf("\033[%dm%5d\033[0m",c[i][j],m[i][j]);
			}
			 System.out.println();
		}
		
	}
	public static void rotar(int m[][],int r[][],int c[][]) {
	 	
		int capas=m.length/2,tope,color;
		
	 for(int f=0;f<capas;f++) {
		 color=Integer.valueOf(colores[f][0]);
		 tope=m.length-1-f;
			        for(int j=f;j<tope;j++) {
			             r[f][j + 1] = m[f][j];
			             r[j+ 1][tope] = m[j][tope];
			             r[tope][tope+f-j-1] = m[tope][tope+f-j];
			             r[tope+f-j-1][f] = m[tope+f-j][f];
			             c[f][j + 1] = color;
			             c[j+ 1][tope] = color;
			             c[tope][tope+f-j-1] = color;
			             c[tope+f-j-1][f] = color;
			        }

	 }
	 if (m.length%2!=0) {
		 r[capas][capas]=m[capas][capas];
		 c[capas][capas]=Integer.valueOf(colores[capas][0]);
	 }
	}
	
	public static void main(String[] args) {
		int n=5;
		int matriz[][]=new int[n][n];
		int rotada[][]=new int[n][n];
		int mcolores[][]=new int[n][n];
		rellenar(matriz);
		rotar(matriz,rotada,mcolores);
		
		System.out.println("Impresión de la matriz original\n");
		imprimir(matriz,mcolores);
	
	
		
		System.out.println("\nImpresión de la matriz rotada\n");
		imprimir(rotada,mcolores);
		
		

	}

}
