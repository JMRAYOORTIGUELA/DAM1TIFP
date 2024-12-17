package nuevo;

public class MaximosMinimos2 {
	
	public static int alea(int li,int ls) {
		return (int)(Math.random()*(ls-li+1))+li;
	}
	public static void rellenar(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]=alea(0,10);
			}
			
		}
	}
	public static void imprimir(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%6d",m[i][j]);
			}
			System.out.println();
			
		}
	}
	public static void maximoMinimos(int m[][]) {
		int max=-1,min=2000;
		String smax="",smin="";
	
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {

				if (m[i][j]>max) {
					max=m[i][j];
					smax=String.format("[%d,%d]=%d;",i,j,max);
				}else if(m[i][j]==max) {
					smax +=String.format("[%d,%d]=%d;",i,j,max);
				}

				if (m[i][j]<min) {
					min=m[i][j];
					smin=String.format("[%d,%d]=%d;",i,j,min);
				}else if(m[i][j]==min) {
					smin +=String.format("[%d,%d]=%d;",i,j,min);
				}
				
				
			}
			System.out.println();
			
		}
		System.out.println("MAXIMOS\n"+smax+"\n");
		System.out.println("MINIMOS\n"+smin+"\n");
		
	}


	public static void main(String[] args) {
		int tb[][]=new int[6][10];
		rellenar(tb);
		imprimir(tb);
		maximoMinimos(tb);
		
		

	}

}
