package Principal;

public class Ejer05 {

	public static int alea(int li,int ls) {
		return (int)(Math.random()*(ls-li+1))+li;
	}
	
	public static int aleatorioArray(int m[]) {
		return m[alea(0,m.length-1)];
	}
	
	public static void main(String[] args) {
		int tb[]= {10,20,30,40,50};
		System.out.println(aleatorioArray(tb));

	}

}
