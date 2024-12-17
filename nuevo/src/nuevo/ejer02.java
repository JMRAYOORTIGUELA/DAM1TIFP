package nuevo;

import java.util.Iterator;

public class ejer02 {

	public static void main(String[] args) {
	
		
		double tc[]=new double[5];
		tc[0]=123.45;
		tc[1]=23.45;
		tc[2]=3.45;
		tc[3]=45;
		tc[4]=4;
		
		double suma=0;
		for (int i = 0; i < tc.length; i++) {
			suma +=tc[i];
			System.out.println(i+" "+tc[i]);
		}

		System.out.printf("La suma=%.2f media=%,2f ",suma,suma/tc.length);
		
	}

}
