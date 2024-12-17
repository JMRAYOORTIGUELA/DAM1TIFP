package nuevo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class EjemploHash2 {

	public static void main(String[] args) {
		TreeMap<String,ArrayList<String>> lista=
				new TreeMap<String,ArrayList<String>>();
		
		ArrayList<String> l=new ArrayList<String>();
		l.add("andres");
		l.add("manuel");
		l.add("jose andres");
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("itziar");
		a.add("mercedes");
		a.add("Mar");
		
		lista.put("familia", l);
		lista.put("amigos", a);
		
		for(String key :lista.keySet()) {
			System.out.println(key);
			System.out.println("=".repeat(key.length()));
			 
			for(String s:lista.get(key))System.out.println(s);
		}
	}

}
