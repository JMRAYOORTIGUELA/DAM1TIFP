import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EjerArrayList {

	public static int alea(int li,int ls) {
		return (int)(Math.random()*(ls-li+1))+li;
	}

	public static void eliminar(ArrayList<Integer> l) {
		
		for(int i=l.size()-1;i>=0;i--) {
			if (l.get(i)>=300 && l.get(i)<=399)l.remove(i);
		}
	}
	public static void multiplicar(ArrayList<Integer> l) {
		
		for(int i=0;i<l.size();i++) {
			if (l.get(i)>=200 && l.get(i)<=299) l.set(i,l.get(i)*1000);
		}
	}
	public static void imprimir(ArrayList<Integer> l) {
		for(int i=0;i<l.size();i++) System.out.println(l.get(i));
		//for(String item:l)System.out.println(item);
	}
	
	public static void main(String[] args) {
	int numero;
	ArrayList<Integer> lista=new ArrayList();
    for(int i=1;i<=20;i++) {

       while (true) {
    	   numero=alea(100,500);
    	   if (!lista.contains(numero)) {
    		   lista.add(numero);
    		   break;
    	   }
       }
    	
    }
    Collections.sort(lista);

	multiplicar(lista);
	eliminar(lista);
	imprimir(lista);
}
}