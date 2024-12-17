package Format;

import java.io.PrintStream;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Obtener {
	/*************************************************************************/
	public static String MonedaLocal(double dato) {
		return NumberFormat.getCurrencyInstance().format(dato);
	}
    public static String MonedaLocal(double dato,Locale locale) {
		return NumberFormat.getCurrencyInstance(locale).format(dato);
	}
    /*************************************************************************/
    public static String NumeroLocal(double dato) {
    	return NumberFormat.getInstance().format(dato);
    }
    public static String NumeroLocal(double dato,Locale locale) {
    	return NumberFormat.getInstance(locale).format(dato);
    }
	public static String NumeroPersonalizado(String patron, double dato) {
		return (new DecimalFormat(patron)).format(dato);
	}
	public static String NumeroPais(String patron, double dato, Locale lugar) {
		DecimalFormat df = (DecimalFormat) DecimalFormat.getNumberInstance(lugar);
		df.applyPattern(patron);
		return df.format(dato);
	}
    /*************************************************************************/
	static String FechaLocal(Date date, int df) {
		return DateFormat.getDateInstance(df).format(date);
	}
	static String FechaLocal(Date date, int df,Locale locale) {
		return DateFormat.getDateInstance(df,locale).format(date);
	}
	/*************************************************************************/
	static String HoraLocal(Date date) {
		return DateFormat.getTimeInstance().format(date);
	}
	static String HoraLocal(Date date,int df,Locale locale) {
		return DateFormat.getTimeInstance(df,locale).format(date);
	}
	/*************************************************************************/
	static public String FechaHoraPer(String patrón, Date fechaHora) {
		return (new SimpleDateFormat(patrón)).format(fechaHora);
	}
	static public String FechaHoraPer(String patrón, Date fechaHora,Locale locale) {
		return (new SimpleDateFormat(patrón,locale)).format(fechaHora);
	}
	/*************************************************************************/
	public static void mostrar(GregorianCalendar gc) {
		DateFormat dateformat = DateFormat.getInstance();
		Date date = gc.getTime();
		System.out.println("DEFAULT " + dateformat.format(date));

		System.out.println("SHORT   " + FechaLocal(date, DateFormat.SHORT));
		System.out.println("MEDIUM  " + FechaLocal(date, DateFormat.MEDIUM));
		System.out.println("LONG    " + FechaLocal(date, DateFormat.LONG));
		System.out.println("FULL    " + FechaLocal(date, DateFormat.FULL));

		System.out.printf("Dia %d Mes %d Año %4d %2d:%2d:%2d\n", gc.get(Calendar.DAY_OF_MONTH), gc.get(Calendar.MONTH),
				gc.get(Calendar.YEAR), gc.get(Calendar.HOUR_OF_DAY), gc.get(Calendar.MINUTE), gc.get(Calendar.SECOND));
	}
	/*************************************************************************/
	public static StringBuffer AlinDer(String patron, double dato) {
		FieldPosition fieldposition = new FieldPosition(NumberFormat.FRACTION_FIELD);
		DecimalFormat decimalformat = new DecimalFormat(patron);
		StringBuffer salida = new StringBuffer();
		decimalformat.format(dato, salida, fieldposition);
		//int n=patron.length() - fieldposition.getEndIndex();
		//salida.insert(0, String.format("%-" + n + "s", ' '));  
       for (int i = 0; i < (patron.length() - fieldposition.getEndIndex()); i++)salida.insert(0, ' ');
		return salida;
	}

	static public void main(String[] args) {
		PrintStream flujoS = System.out;

		flujoS.println(MonedaLocal(123456));
		flujoS.println(MonedaLocal(123456.789));
		flujoS.println(MonedaLocal(123.45));
		flujoS.println();
		flujoS.println(MonedaLocal(123456,new Locale("en", "US")));
		flujoS.println(MonedaLocal(123456.789,new Locale("en", "US")));
		flujoS.println(MonedaLocal(123.45,new Locale("en", "US")));
		flujoS.println();
		flujoS.println(NumeroLocal(123456));
		flujoS.println(NumeroLocal(123456.789));
		flujoS.println(NumeroLocal(123.45));
		flujoS.println();
		flujoS.println(NumeroLocal(123456,new Locale("en", "US")));
		flujoS.println(NumeroLocal(123456.789,new Locale("en", "US")));
		flujoS.println(NumeroLocal(123.45,new Locale("en", "US")));
		flujoS.println();
		
		

		Date hoy = new Date();
		flujoS.println(FechaLocal(hoy, DateFormat.FULL));
		flujoS.println(FechaLocal(hoy, DateFormat.FULL,new Locale("en", "US")));
		flujoS.println(HoraLocal(hoy));
		flujoS.println(HoraLocal(hoy,DateFormat.FULL,Locale.getDefault()));
		
		flujoS.println(HoraLocal(hoy, DateFormat.FULL,new Locale("en", "US")));
		flujoS.println(FechaHoraPer("EEEE dd-MMM-yyyy, HH:mm:ss", hoy));
		flujoS.println(FechaHoraPer("EEEE dd-MMM-yyyy, HH:mm:ss", hoy,Locale.FRENCH));
		flujoS.println();

		mostrar(new GregorianCalendar(2003, 7, 2, 12, 30, 15));
		flujoS.println();
		mostrar(new GregorianCalendar());

		flujoS.println(NumeroPersonalizado("###,###.##", 123456));
		flujoS.println(NumeroPersonalizado("########", 123456));
		flujoS.println(NumeroPersonalizado("###.##", 123456.789));
		flujoS.println(NumeroPersonalizado("000000.000", 123.45));
		flujoS.println(NumeroPersonalizado("$###,###.###", 12345.67));
		flujoS.println(NumeroPersonalizado("###,###.###", 12.34));
		flujoS.println();

		String patrón = new String("###,###,##0.00");
		flujoS.println(AlinDer(patrón, 1.234));
		flujoS.println(AlinDer(patrón, 12.345));
		flujoS.println(AlinDer(patrón, -123.456));
		flujoS.println(AlinDer(patrón, 123.456));
		flujoS.println(AlinDer(patrón, 1234.567));
		flujoS.println(AlinDer(patrón, 12345.678));
		flujoS.println(AlinDer(patrón, -12345));
		flujoS.println();

		Locale[] país = { new Locale("es", "ES"), new Locale("en", "US") };
		for (Locale locale : país) flujoS.println(NumeroPais("###,###.###", 123456.789, locale));

		Object[] argumentos = { new Long(1234), "C:", new Long(125) };
		MessageFormat mensaje = new MessageFormat("Fueron verificados {0} " + "ficheros de la unidad {1} en {2} segundos");

		System.out.println(mensaje.format(argumentos));

	}
}
