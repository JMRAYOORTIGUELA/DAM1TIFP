package Principal;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class fechas1 {

	public static void main(String[] args) {
		Locale l = Locale.of("es");
		 
	
		LocalDate date = LocalDate.of(1999, Month.AUGUST, 23);         
		String dia=date.getDayOfWeek().getDisplayName(TextStyle.FULL, l); 
		String mes=date.getMonth().getDisplayName(TextStyle.FULL, l); 
		
		System.out.printf("El día que conocí a quien es mi esposa fue el %s y fue un %s %s",date,dia,mes);

	}

}
