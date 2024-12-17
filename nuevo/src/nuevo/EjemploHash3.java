package nuevo;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class EjemploHash3 {
    static Scanner sc=new Scanner(System.in);
    
	public static void main(String[] args) {
		TreeMap<String,String> lista=new TreeMap<String,String>();
		String respuesta,castellano,ingles;
		
		do {
		    System.out.print("Dime la palabra en castellano ");
		    castellano=sc.nextLine();
		    
		    if (lista.containsKey(castellano)) {
		    	System.out.println("Su traducción es "+lista.get(castellano));
		    }else {
		    	  System.out.print("Dime su traducción ");
				  ingles=sc.nextLine();
				  lista.put(castellano, ingles);
		    }
			System.out.print("¿Introducir siguiente palabra (S/N)?");
			respuesta=sc.nextLine();
		}while(respuesta.equals("S"));
		
		for(Entry<String,String> l :lista.entrySet()) {
			System.out.println("Castellano "+l.getKey()+" Ingles "+l.getValue());
		}
	}
}
