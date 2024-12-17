package Principal;

import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Ejer03 {
	/***********************************************************************/
	public static String FechaHoraPer(String patron,LocalDateTime fechaHora) {
		DateTimeFormatter f=DateTimeFormatter.ofPattern(patron);
		return fechaHora.format(f);
	}
	public static String FechaHoraPer(String patron,LocalDateTime fechaHora,Locale l) {
		DateTimeFormatter f=DateTimeFormatter.ofPattern(patron,l);
		return fechaHora.format(f);
	}
	public static String FechaHoraPer(String patron,LocalDate fechaHora) {
		DateTimeFormatter f=DateTimeFormatter.ofPattern(patron);
		return fechaHora.format(f);
	}
	public static String FechaHoraPer(String patron,LocalDate fechaHora,Locale l) {
		DateTimeFormatter f=DateTimeFormatter.ofPattern(patron,l);
		return fechaHora.format(f);
	}
	/***********************************************************************/
	public static String MonedaLocal(double d) {
		return NumberFormat.getCurrencyInstance().format(d);
	}
	public static String MonedaLocal(double d,Locale l) {
		return NumberFormat.getCurrencyInstance(l).format(d);
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
	/***********************************************************************/
	public static void main(String[] args) {
		PrintStream flujoS = System.out;
		LocalDateTime f1=LocalDateTime.now();
		LocalDate f2=LocalDate.now();
		
		System.out.println(FechaHoraPer("EEEE dd-MMMM-yyyy HH:mm:ss",f1));
		System.out.println(FechaHoraPer("EEEE dd-MMMM-yyyy HH:mm:ss",f1,new Locale("en","EN")));
		System.out.println(FechaHoraPer("EEEE dd-MMMM-yyyy HH:mm:ss",f1,Locale.FRENCH));

		System.out.println(FechaHoraPer("EEEE dd-MMMM-yyyy",f2));
		System.out.println(FechaHoraPer("EEEE dd-MMMM-yyyy",f2,new Locale("en","EN")));
		System.out.println(FechaHoraPer("EEEE dd-MMMM-yyyy",f2,Locale.FRENCH));
		
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MMMM-yyyy",Locale.of("ES"));
		System.out.println(f1.format(f));

		LocalDate fecha=LocalDate.parse("10-mayo-2000",f);
		
		System.out.println(MonedaLocal(1234.45));
		System.out.println(MonedaLocal(1234.45,Locale.US));
		
		flujoS.println();
		flujoS.println(NumeroLocal(123456));
		flujoS.println(NumeroLocal(123456.789));
		flujoS.println(NumeroLocal(123.45));
		flujoS.println();
		flujoS.println(NumeroLocal(123456,new Locale("en", "US")));
		flujoS.println(NumeroLocal(123456.789,new Locale("en", "US")));
		flujoS.println(NumeroLocal(123.45,new Locale("en", "US")));
		flujoS.println();
		flujoS.println(NumeroPersonalizado("###,###.##", 123456));
		flujoS.println(NumeroPersonalizado("########", 123456));
		flujoS.println(NumeroPersonalizado("###.##", 123456.789));
		flujoS.println(NumeroPersonalizado("000000.000", 123.45));
		flujoS.println(NumeroPersonalizado("$###,###.###", 12345.67));
		flujoS.println(NumeroPersonalizado("###,###.###", 12.34));
		flujoS.println();

	}

}
