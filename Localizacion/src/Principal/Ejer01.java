package Principal;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;

public class Ejer01 {
	static String FechaLocal(LocalDate date) {
		return DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(date);
	}
	public static void main(String[] args) {
	LocalDate hoy=LocalDate.now();
	DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy",Locale.of("ES"));
	System.out.println(hoy.format(f));

	LocalDate fecha=LocalDate.parse("10-05-2000",f);
	System.out.println(fecha.format(f));
	System.out.println(FechaLocal(fecha));
	
	System.out.println(fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.of("ES")));
	}

}
