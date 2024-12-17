package Principal;

import java.util.Iterator;

public class repasoSplit {

	public static void main(String[] args) {
		String cadena="jose\nrayo\n1234";
		String tb[]=cadena.split("\n");
		
		for (int i = 0; i < tb.length; i++) {
			System.out.println(i+" "+tb[i]);
		}

	}

}
