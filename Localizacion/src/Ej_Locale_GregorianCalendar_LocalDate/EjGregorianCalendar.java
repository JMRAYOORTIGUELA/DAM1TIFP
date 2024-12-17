package Ej_Locale_GregorianCalendar_LocalDate;
import java.util.*;
import java.text.*;
public class EjGregorianCalendar {

	public static void mostrar(GregorianCalendar fe){
		/* getDateInstance() devuelve el formato utilizado para
		 * mostrar la fecha en la localidad actual
		 * getTimeInstance() la hora
		 */
		DateFormat df=DateFormat.getInstance();
		System.out.println(df.format(fe.getTime()));
		
		df=DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df.format(new Date()));
		
		df=DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df.format(new Date()));
		
		df=DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df.format(new Date()));
		
		df=DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(new Date()));
		
		
		System.out.println(fe.get(Calendar.DAY_OF_MONTH));
		System.out.println(fe.get(Calendar.MONTH));
		System.out.println(fe.get(Calendar.YEAR));
		System.out.println(fe.get(Calendar.HOUR_OF_DAY));
		System.out.println(fe.get(Calendar.MINUTE));
		System.out.println(fe.get(Calendar.SECOND));
	}


	public static void main(String args[]) {
		GregorianCalendar fecha1=new GregorianCalendar();//Crea fecha1 con la fecha actual
		GregorianCalendar fecha2=new GregorianCalendar(2003,7,2);
		GregorianCalendar fecha3=new GregorianCalendar(2003,Calendar.AUGUST,2);
		GregorianCalendar fecha4=new GregorianCalendar(2003,7,2,12,30);
		GregorianCalendar fecha5=new GregorianCalendar(2003,7,2,12,30,15);
		
		mostrar(fecha5);
		
		fecha5.set(Calendar.MONTH, Calendar.MAY);
		fecha5.set(Calendar.DAY_OF_MONTH, 12);
		
		mostrar(fecha5);
		fecha5.set(2003,17,9);
		
		mostrar(fecha5);
		
		System.out.println("salida de compareto "+fecha2.compareTo(fecha1));
	}
}
