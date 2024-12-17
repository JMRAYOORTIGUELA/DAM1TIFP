package nuevo;

public class ejer1Matrices {

	public static int alea(int li,int ls) {
		return (int)(Math.random()*(ls-li+1))+li;
	}
	
	public static void rellenar(int m[][]) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j]=alea(200,300);
			}
		}
	}
	
	public static void imprimir(int m[][]) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.printf("%5d",m[i][j]);
			}
			System.out.println("");
		}
	}
	public static void diagonalPrincipal(int m[][]) {
		int maximo=0,minimo=400,suma=0;
		
		for(int i=0;i<m.length;i++) {
			if 	(m[i][i]>maximo)maximo=m[i][i];
			if 	(m[i][i]<minimo)minimo=m[i][i];
			suma +=m[i][i];
			System.out.printf("%5d",m[i][i]);
		}
		System.out.printf("\nMaximo=%d Minimo=%d Media=%.2f",maximo,minimo,(double)suma/m.length );
	}
	public static void diagonalPrincipalMejorado(int m[][]) {
		int maximo,minimo,suma;
		  maximo=minimo=suma=m[0][0];
		  System.out.printf("%5d",m[0][0]);
			
		for(int i=1;i<m.length;i++) {
			if 	(m[i][i]>maximo) {
				maximo=m[i][i];
			}else if (m[i][i]<minimo) {
				minimo=m[i][i];
			}
			suma +=m[i][i];
			System.out.printf("%5d",m[i][i]);
		}
		System.out.printf("\nMaximo=%d Minimo=%d Media=%.2f",maximo,minimo,(double)suma/m.length );
	}
	public static void diagonalSecundariaMejorado(int m[][]) {
		int maximo,minimo,suma,mc=m.length,c;
		  maximo=minimo=suma=m[mc-1][0];
		  
		  System.out.printf("%5d",m[mc-1][0]);
			
		for(int i=mc-2;i>=0;i--) {
			  c=mc-1-i;
			if 	(m[i][c]>maximo) {
				maximo=m[i][c];
			}else if (m[i][c]<minimo) {
				minimo=m[i][c];
			}
			suma +=m[i][c];
			System.out.printf("%5d",m[i][c]);
		}
		System.out.printf("\nMaximo=%d Minimo=%d Media=%.2f",maximo,minimo,(double)suma/m.length );
	}
	public static void main(String[] args) {
		int matriz[][]=new int[4][4];
		rellenar(matriz);
        imprimir(matriz);
        System.out.println("****************");
        diagonalPrincipal(matriz);
        System.out.println();
        diagonalPrincipalMejorado(matriz);
        System.out.println("****************");
        diagonalSecundariaMejorado(matriz);
        
	}

}
