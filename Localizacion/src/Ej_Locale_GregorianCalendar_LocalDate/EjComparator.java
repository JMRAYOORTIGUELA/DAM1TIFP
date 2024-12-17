package Ej_Locale_GregorianCalendar_LocalDate;
import java.io.PrintStream;
import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class EjComparator {

	private static ArrayList<Integer> ListEnteros = new ArrayList<>();
	private static ArrayList<Persona> personas = new ArrayList<>();

	public static void main(String args[]) {

		// Guardo datos en el ArrayList
		ListEnteros.add(3); ListEnteros.add(4);
		ListEnteros.add(2);	ListEnteros.add(6);
		ListEnteros.add(5);	ListEnteros.add(1);
		ListEnteros.add(7);

		// Imprimo el arrayList de Enteros desordenado
		System.out.println("ArrayList desordenado: ");
		printListEnteros();


		// Ordeno el ArrayList de menor a mayor y lo imprimo
		System.out.println("\nArrayList ordenado de menor a mayor");
		Collections.sort(ListEnteros);
		printListEnteros();

		// Ordeno el ArrayList de mayor a menor y lo imprimo
		System.out.println("\nArrayList ordenado de mayor a menor");
		Comparator<Integer> comparador = Collections.reverseOrder();
		Collections.sort(ListEnteros, comparador);
		printListEnteros();

		// Guardo datos en el ArrayList de Objetos de la clase persona
		personas.add(new Persona("Pepe", 28));
		personas.add(new Persona("Juan", 32));
		personas.add(new Persona("Paco", 40));
		personas.add(new Persona("Lola", 20));
		personas.add(new Persona("Jose", 28));
		personas.add(new Persona("Dani", 24));
		personas.add(new Persona("Sara", 36));
		personas.add(new Persona("Susi", 24));
		
			
		// Imprimo el ArrayList desordenado por edad de la clase persona
		System.out.println("\nArrayList desordenada");
		printArrayListPersona();

		// Odeno el arrayList de menor a mayor por edad y lo imprimo
		System.out.println("\nArrayList ordenado por edad de menor a mayor:");
		Collections.sort(personas,new ordenar(1));
		printArrayListPersona();

		// Odeno el arrayList de mayor a menor por edad y lo imprimo
		System.out.println("\nArrayList ordenado por edad de mayor a menor:");
		Collections.sort(personas, new ordenar(2));
		printArrayListPersona();
		
		// Odeno el arrayList de mayor a menor por edad y lo imprimo
		System.out.println("\nArrayList ordenado por nombre de mayor a menor:");
		Collections.sort(personas, new ordenar(3));
		printArrayListPersona();
		
		// Odeno el arrayList de mayor a menor por edad y lo imprimo
		System.out.println("\nArrayList ordenado por nombre de menor a mayor:");
		Collections.sort(personas, new ordenar(4));
		printArrayListPersona();

	}

	private static void printListEnteros() {
		Iterator<Integer> itrArrayList = ListEnteros.iterator();
		int posicion = 1;
		while (itrArrayList.hasNext()) {
			System.out.println("Posicion(" + posicion + ") = " + itrArrayList.next());
			posicion++;
		}
	}

	private static void printArrayListPersona() {
		Iterator<Persona> itrArrayList = personas.iterator();
		int posicion = 1;
		while (itrArrayList.hasNext()) {
			System.out.println("Posicion(" + posicion + ") = " + itrArrayList.next().toString());
			posicion++;
		}
	}

}


class ordenar implements Comparator<Persona>{
    private int caso=1;
	public ordenar(int caso){this.caso=caso;}

	@Override
	public int compare(Persona p1, Persona p2) {
		switch(this.caso){
		case 1:
			return (int)Math.signum(p1.getEdad()-p2.getEdad());
		case 2:
			return (int)Math.signum(p2.getEdad()-p1.getEdad());
		case 3:
		    return p2.getNombre().compareTo(p1.getNombre());
		}
		   return p1.getNombre().compareTo(p2.getNombre());
		
	}
	
}