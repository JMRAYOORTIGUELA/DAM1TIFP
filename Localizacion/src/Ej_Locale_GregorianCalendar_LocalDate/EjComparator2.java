package Ej_Locale_GregorianCalendar_LocalDate;
import java.io.PrintStream;
import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class EjComparator2 {

	private static ArrayList<Integer> arrayListInt = new ArrayList<>();
	private static ArrayList<Persona> personas = new ArrayList<>();

	public static void main(String args[]) {

		// Guardo datos en el ArrayList
		arrayListInt.add(3); 	arrayListInt.add(4);
		arrayListInt.add(2);	arrayListInt.add(6);
		arrayListInt.add(5);	arrayListInt.add(1);
		arrayListInt.add(7);

		// Imprimo el arrayList de Enteros desordenado
		System.out.println("ArrayList desordenado: ");
		printArrayListInt();


		// Ordeno el ArrayList de menor a mayor y lo imprimo
		System.out.println("\nArrayList ordenado de menor a mayor");
		Collections.sort(arrayListInt);
		printArrayListInt();

		// Ordeno el ArrayList de mayor a menor y lo imprimo
		System.out.println("\nArrayList ordenado de mayor a menor");
		Comparator<Integer> comparador = Collections.reverseOrder();
		Collections.sort(arrayListInt, comparador);
		printArrayListInt();

		// Guardo datos en el ArrayList de Objetos de la clase persona
		personas.add(new Persona("Pepe", 28));
		personas.add(new Persona("Juan", 32));
		personas.add(new Persona("Paco", 40));
		personas.add(new Persona("Lola", 20));
		personas.add(new Persona("Jose", 28));
		personas.add(new Persona("Dani", 24));
		personas.add(new Persona("Sara", 36));
		personas.add(new Persona("Susi", 24));
		
		Comparator<Persona> co1=new Comparator<Persona>(){
			@Override
			public int compare(Persona p1, Persona p2) {
				return new Integer(p1.getEdad()).compareTo(new Integer(p2.getEdad()));
			}
		};
		Comparator<Persona> co2=new Comparator<Persona>(){
			@Override
			public int compare(Persona p1, Persona p2) {
				return new Integer(p2.getEdad()).compareTo(new Integer(p1.getEdad()));
			}
		};
		
		// Imprimo el ArrayList desordenado por edad de la clase persona
		System.out.println("\nArrayList desordenada");
		printArrayListPersona();

		// Odeno el arrayList de menor a mayor por edad y lo imprimo
		System.out.println("\nArrayList ordenado por edad de menor a mayor:");
		Collections.sort(personas,co1);
		printArrayListPersona();

		// Odeno el arrayList de mayor a menor por edad y lo imprimo
		System.out.println("\nArrayList ordenado por edad de mayor a menor:");
		Collections.sort(personas, co2);
		printArrayListPersona();

	}

	private static void printArrayListInt() {
		Iterator<Integer> itrArrayList = arrayListInt.iterator();
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

