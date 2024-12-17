package nuevo;

public class ejer2Matrices {
	
	public static int alea(int li,int ls) {
		return (int)(Math.random()*(ls-li+1))+li;
	}
	
	public static void rellenar(int m[][]) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j]=alea(140,210);
			}
		}
	}
	public static void imprimir(int m[][],String p[]) {
		int maximo,minimo,suma;
		System.out.println("                                                                       MED   MAX   MIN"); 
		for(int i=0;i<m.length;i++) {
			suma=0;
			System.out.printf("%-20s",p[i]);
			maximo=0;
			minimo=300;
			for(int j=0;j<m[i].length;j++) {
				System.out.printf("%5d",m[i][j]);
				suma +=m[i][j];
				if (m[i][j]>maximo)maximo=m[i][j];
				if (m[i][j]<minimo)minimo=m[i][j];
			}
			System.out.printf("%5d %5d %5d\n",suma/m[i].length,maximo,minimo);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paises[]={"España", "Rusia", "Japón", "Australia"};
		int matriz[][]=new int[4][10];
		
		rellenar(matriz);
		imprimir(matriz,paises);
		
	}

}
