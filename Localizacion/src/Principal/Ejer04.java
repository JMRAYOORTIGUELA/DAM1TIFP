package Principal;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Ejer04 {
	public static String FechaHoraPer(String patron, LocalDate fechaHora, Locale l) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern(patron, l);
		return fechaHora.format(f);
	}

	public static void basura() {
		int anno = LocalDate.now().getYear();
		LocalDate fecha;
		for (int i = 1; i <= 12; i++) {
			fecha = LocalDate.of(anno, i, 1);
			fecha = fecha.plusMonths(1).minusDays(1);

			while (fecha.getDayOfWeek() == DayOfWeek.SATURDAY || fecha.getDayOfWeek() == DayOfWeek.SUNDAY) {
				fecha = fecha.minusDays(1);
			}
			System.out.println(FechaHoraPer("EEEE dd-MMMM-yyyy", fecha, Locale.of("ES")));
		}

	}

	public static void zonedDateTimeEjemplo() {
		LocalDateTime fecha = LocalDateTime.now();

		ZoneId.getAvailableZoneIds().forEach(z -> {
			ZonedDateTime fecha3 = fecha.atZone(ZoneId.of(z));
			System.out.println(fecha3.toLocalDateTime());
		}); // list of all zones

	}

	public static void HoraActual() {
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
		List<String> zoneList = new ArrayList<String>(ZoneId.getAvailableZoneIds());
		Collections.sort(zoneList);

		for (String s : zoneList) {
			ZonedDateTime f = ZonedDateTime.now(ZoneId.of(s));
			System.out.printf("%-35s %s\n", s, f.toLocalDateTime().format(d));
		}
	}

	public static void HoraActual(LocalDateTime fecha) {
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
		List<String> zoneList = new ArrayList<String>(ZoneId.getAvailableZoneIds());
		Collections.sort(zoneList);
		for (String s : zoneList) {
			ZonedDateTime f = ZonedDateTime.ofInstant(fecha, ZoneOffset.of("+01:00"), ZoneId.of(s));
			System.out.printf("%-35s %s %s\n", s, f.toLocalDateTime().format(d), f.getOffset().toString());
		}
	}

	public static void zonedDateTime() {
		ZoneId zona = ZoneId.of("America/Panama");
		ZoneId zona2 = ZoneId.of("Asia/Tokyo");
		LocalDateTime fecha = LocalDateTime.now();
		ZonedDateTime fecha2 = ZonedDateTime.of(fecha, zona);
		System.out.println(fecha2);

		ZonedDateTime fecha3 = fecha.atZone(zona2);
		System.out.println(fecha3);
		ZoneId zona3 = ZoneId.of("Europe/Madrid");
		ZonedDateTime fecha4 = fecha.atZone(zona3);
		System.out.println(fecha4);

	}

	public static void main(String[] args) {
		HoraActual(LocalDateTime.of(2000,10,20,12,30));
		//HoraActual();
	}

}
