package nuevo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class EjemploHash {

	public static void main(String[] args) {
		TreeMap<String,Double> lista=new TreeMap<String,Double>();
		
		lista.put("Peras", 10.5);
		lista.put("Manzanas", 11.5);
		lista.put("Limones", 12.5);
		lista.put("Kiwis", 13.5);
		lista.put("Uvas", 13.5);
	
		for(Entry<String,Double> item     :lista.entrySet()) {
			System.out.println(item.getKey()+" "+item.getValue());
			
		}
         System.out.println();
		for(String key:lista.keySet()) {
			System.out.println(key+" "+lista.get(key));	
		}
	     System.out.println();
		for(Double valor:lista.values()) {
			System.out.println(valor);
		}

		if (lista.containsKey("Peras")) {
		   lista.put("Peras",lista.get("Peras")*1.10);
		}
		
	}

}
