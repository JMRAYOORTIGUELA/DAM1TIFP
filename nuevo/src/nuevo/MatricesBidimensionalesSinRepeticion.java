package nuevo;

public class MatricesBidimensionalesSinRepeticion {
	public static int alea(int li,int ls) {
		return (int)(Math.random()*(ls-li+1))+li;
	}
	public static void imprimir(int m[][]) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%5d",m[i][j]);
			}
			System.out.println();
			
		}
	}
	public static boolean buscame(int n,int m[][],int cuantos) {
		int fila,columna,nc=m[0].length;
		for(int i=1;i<=cuantos;i++) {
			fila= (int)( (i-1)/nc);
			columna=i-(fila*nc)-1;
			if (m[fila][columna]==n)return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int nf=3,nc=4;
		int tb[][]= new int[nf][nc]; 
		int total=nf*nc;
		int c=0,fila,columna;
		int numero;
		
		for(int i=1;i<=total;i++) {
			while(true) {
			numero=alea(0,100);
			if (!buscame(numero,tb,c)) {
			   c++;	
			   fila= (int)( (i-1)/nc);
			   columna=i-(fila*nc)-1;
			   tb[fila][columna]=numero;
			   break;
			}
			}	
		}
		imprimir(tb);
	}

}
