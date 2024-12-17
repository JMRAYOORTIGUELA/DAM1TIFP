package nuevo;

public class vectores {

	/*******************************************************/
	public static int alea(int ls,int li) {
		return (int)(Math.random()*(ls-li+1))+li;
	}
	/*******************************************************/
	public static void rellenar(int m[]) {
		for (int i = 0; i < m.length; i++) {
			m[i]=alea(10,20);
		}
	}
	/*******************************************************/
	public static void imprimir(int m[]) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("%5d",m[i]);
		}
	}
	/*******************************************************/
	public static void main(String[] args) {
		int clase[]=new int[10];
		
		rellenar(clase);
		imprimir(clase);
		
	     int otro[]=new int[10];
		
		rellenar(otro);
		imprimir(otro);

	}

}
