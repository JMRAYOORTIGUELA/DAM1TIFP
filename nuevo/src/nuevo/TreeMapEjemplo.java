package nuevo;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapEjemplo {

	public static void main(String[] args) {

			TreeMap<Double, Integer> tr = new TreeMap<>(new ordenar2(2));

			tr.put(200.0, 10);
			tr.put(500.0, 10);
			tr.put(100.0, 10);

		
			  for (Entry<Double, Integer> item : tr.entrySet()) {
			  System.out.println(item.getKey()+" "+ item.getValue()); }
			 
				for(Double c: tr.keySet()) {
					System.out.println(c+" "+tr.get(c));					
				}
	}

}
class ordenar2 implements Comparator<Double> {
	private int n;

	public ordenar2(int n) {
		super();
		this.n = n;
	}

	@Override
	public int compare(Double o1, Double o2) {
		if (n == 1)	return (int) (o2 - o1);
		return (int) (o1 - o2);
	}

}