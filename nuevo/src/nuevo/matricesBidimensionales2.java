package nuevo;

public class matricesBidimensionales2 {
	/*******************************************************/
	public static int alea(int ls,int li) {
		return (int)(Math.random()*(ls-li+1))+li;
	}
	/*******************************************************/
	public static void imprimir(int ma[][]) {
		int sumax[]=new int[  ma[0].length   ];
		int suma;
		for (int i = 0; i < ma.length; i++) {
			suma=0;
			for (int j = 0; j < ma[i].length; j++) {
				System.out.printf("%5d",ma[i][j]);
				suma +=ma[i][j];
				sumax[j] +=ma[i][j];
			}
			System.out.printf("%5d\n",suma);
		}
		
		
		for (int i = 0; i < sumax.length; i++) {
			System.out.printf("%5d",sumax[i]);
		}
	}
	/*******************************************************/
	public static void rellenar(int ma[][]) {
		for (int i = 0; i < ma.length; i++) {
			for (int j = 0; j < ma[i].length; j++) {
				ma[i][j]=alea(100,0);
			}

		}
	}
	/*******************************************************/
	public static void prueba(int a) {
		a +=100;
	}
	/*******************************************************/
	public static void main(String[] args) {
		

		int ta[][]=new int[4][4];
		
	    rellenar(ta);
		imprimir(ta);
		
		
	}

}
