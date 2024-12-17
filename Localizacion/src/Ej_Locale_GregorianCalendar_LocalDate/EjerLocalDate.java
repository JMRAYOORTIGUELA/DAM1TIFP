package Ej_Locale_GregorianCalendar_LocalDate;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class EjerLocalDate {

 void metodo_OffsetDateTime() {
	 LocalDate localDate = LocalDate.parse("2017-02-03");
		LocalTime localTime = LocalTime.parse("12:30:30");
		OffsetDateTime date = OffsetDateTime.of(localDate, localTime,ZoneOffset.UTC);
		System.out.println(date);  

		OffsetDateTime offsetDT1 = OffsetDateTime.now();
		System.out.println("OffsetDateTime1: " + offsetDT1);

		OffsetDateTime offsetDT2 = OffsetDateTime.now(Clock.systemUTC());
		System.out.println("OffsetDateTime2: " + offsetDT2);

		OffsetDateTime offsetDT3 = OffsetDateTime.now(ZoneId.of("Asia/Jakarta"));
		System.out.println("OffsetDateTime3: " + offsetDT3);

		OffsetDateTime offsetDT4 = OffsetDateTime.of(1980, 4, 9, 20, 15, 45, 345875000, ZoneOffset.of("+07:00"));
		System.out.println("OffsetDateTime4: " + offsetDT4);

		OffsetDateTime offsetDT5 = OffsetDateTime.of(LocalDate.now(), LocalTime.of(15, 50, 25), ZoneOffset.of("+07:00"));
		System.out.println("OffsetDateTime5: " + offsetDT5);

		OffsetDateTime offsetDT6 = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.of("+07:00"));
		System.out.println("OffsetDateTime6: " + offsetDT6);

		OffsetDateTime offsetDT7 = OffsetDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		System.out.println("OffsetDateTime7: " + offsetDT7);

		OffsetDateTime offsetDT8 = OffsetDateTime.parse("2019-08-31T15:20:30+08:00");
		System.out.println("OffsetDateTime8: " + offsetDT8);

		OffsetDateTime offsetDT9 = OffsetDateTime.parse("1980-04-09T08:20:45+07:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		System.out.println("OffsetDateTime9: " + offsetDT9);
 }

	public static void main(String[] args) {
		
		  /*.parse*/
		  LocalDate localdateparse=LocalDate.parse("2018-10-10"); 
		  LocalTime localtimeparse=LocalTime.parse("22:45:03"); 
		  LocalDateTime  localdatetimeparse=LocalDateTime.parse("2018-10-10T11:25");
		  
		  /*.of*/
		  LocalDate localdateof=LocalDate.of(2018,10,10); 
		  LocalTime localtimeof=LocalTime.of(22,10,30); 
		  LocalDateTime localdatetimeof=LocalDateTime.of(2018,10,10,11,25,30);
		  
		  /*.with.....*/
		  localdateof=localdateof.withDayOfMonth(20); 
		  localtimeof=localtimeof.withHour(9);
		  
		  /*.plus... .minus...*/
		  localdateof=localdateof.plusDays(20);
		  localdateof=localdateof.minusMonths(2);
		  
		  /*.at......*/
		  localdatetimeof=localdateof.atTime(localtimeof);
		  
		  MonthDay monthday=MonthDay.of(4, 25);
		  YearMonth yearmonth=YearMonth.of(2020, 4);
		  LocalDate cumpleaños=monthday.atYear(2020);
		  System.out.println(cumpleaños+" "+cumpleaños.getDayOfWeek());
		  
		  System.out.println(localdateof); System.out.println(localtimeof);
		  System.out.println(localdatetimeof);
		  System.out.println(LocalDateTime.now());
		  
		  ZonedDateTime z1=ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Madrid"));
		  System.out.println(z1);
		  ZonedDateTime z2=ZonedDateTime.of(localdatetimeof,ZoneId.of("Asia/Tokyo"));
		  System.out.println(z2);
		  
		  ZonedDateTime z3=localdatetimeof.atZone(ZoneId.of("Asia/Tokyo")); 
		  System.out.println(z3);

		 // ZoneId.getAvailableZoneIds().stream().filter(e->e.startsWith("Europe")).sorted().forEach(e->System.out.println(e));
		  
		  LocalDateTime fecha=LocalDateTime.now();
		  
		for (String item : ZoneId.getAvailableZoneIds()) {
			if (item.startsWith("Europe")) {
			ZonedDateTime f=fecha.atZone(ZoneId.of(item));
			System.out.println(item+" "+f.getOffset());
			}
		}


	}

}
