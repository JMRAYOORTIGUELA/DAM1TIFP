package Principal;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class fechas2 {

	public static void main(String[] args) {
		// OffsetDateTime Representa una fecha y una hora en formato UTC.
		// public static OffsetDateTime of(LocalDate date, LocalTime time, ZoneOffset
		// offset)
		LocalDate localDate = LocalDate.parse("2017-02-03");
		LocalTime localTime = LocalTime.parse("12:30:30");
		OffsetDateTime date = OffsetDateTime.of(localDate, localTime, ZoneOffset.UTC);
		System.out.println(date);
		localDate = LocalDate.now();
		localTime = LocalTime.now();
		date = OffsetDateTime.of(localDate, localTime, ZoneOffset.UTC);
		System.out.println(date);
		OffsetDateTime offsetDT1 = OffsetDateTime.now();
		System.out.println("OffsetDateTime1: " + offsetDT1);
		OffsetDateTime offsetDT2 = OffsetDateTime.now(Clock.systemUTC());
		System.out.println("OffsetDateTime2: " + offsetDT2);
		OffsetDateTime offsetDT3 = OffsetDateTime.now(ZoneId.of("Asia/Jakarta"));
		System.out.println("OffsetDateTime3: " + offsetDT3);
		OffsetDateTime offsetDT4 = OffsetDateTime.of(1980, 4, 9, 20, 15, 45, 345875000, ZoneOffset.of("+07:00"));
		System.out.println("OffsetDateTime4: " + offsetDT4);
		OffsetDateTime offsetDT5 = OffsetDateTime.of(LocalDate.now(), LocalTime.of(15, 50, 25),
				ZoneOffset.of("+07:00"));
		System.out.println("OffsetDateTime5: " + offsetDT5);
		OffsetDateTime offsetDT6 = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.of("+07:00"));
		System.out.println("OffsetDateTime6: " + offsetDT6);
	}

}
