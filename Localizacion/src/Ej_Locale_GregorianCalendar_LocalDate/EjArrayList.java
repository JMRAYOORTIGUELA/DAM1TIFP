package Ej_Locale_GregorianCalendar_LocalDate;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EjArrayList {

	public static void main(String[] args) {
		PrintStream sa = System.out;
		ArrayList tb = new ArrayList();
		tb.add(10);
		tb.add("uno");
		tb.add(10f);

		for (Object a : tb)
			sa.println(a);

		Iterator it = tb.iterator();
		while (it.hasNext())
			sa.println(it.next());

		Punto p1 = new Punto(10, 20);
		sa.println(p1.toString() + " " + p1.hashCode());
		Punto p2 = (Punto) p1.clone();
		sa.println(p2.toString() + " " + p2.hashCode());
		Punto p3 = p1;
		p3.trasladar(8, 9);
		sa.println(p1.toString() + " " + p1.hashCode());
		sa.println(p3.toString() + " " + p3.hashCode());

		Rectangulo rect = new Rectangulo(new Punto(0, 0), 4, 5);
		Rectangulo rCopia = (Rectangulo) rect.clone();
	}

}

//=====================================CLASE PUNTO INTERFACE CLONEABLE===================
class Punto implements Cloneable {
	private int x;
	private int y;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Punto() {
		x = 0;
		y = 0;
	}

	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException ex) {
			System.out.println(" no se puede duplicar");
		}
		return obj;
	}

	public void trasladar(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public String toString() {
		String texto = "origen: (" + x + ", " + y + ")";
		return texto;
	}
}

//=====================================CLASE PUNTO INTERFACE CLONEABLE=================== 
class Rectangulo implements Cloneable {
	private int ancho;
	private int alto;
	private Punto origen;

	public Rectangulo() {
		origen = new Punto(0, 0);
		ancho = 0;
		alto = 0;
	}

	public Rectangulo(Punto p) {
		this(p, 0, 0);
	}

	public Rectangulo(int w, int h) {
		this(new Punto(0, 0), w, h);
	}

	public Rectangulo(Punto p, int w, int h) {
		origen = p;
		ancho = w;
		alto = h;
	}

	public Object clone() {
		Rectangulo obj = null;
		try {
			obj = (Rectangulo) super.clone();
		} catch (CloneNotSupportedException ex) {
			System.out.println(" no se puede duplicar");
		}
		obj.origen = (Punto) obj.origen.clone();
		return obj;
	}

	public void mover(int dx, int dy) {
		origen.trasladar(dx, dy);
	}

	public int area() {
		return ancho * alto;
	}

	public String toString() {
		String texto = origen + " ancho: " + ancho + " alto: " + alto;
		return texto;
	}
}