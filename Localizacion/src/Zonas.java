import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zonas {
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
	public static void main(String[] args) {
		//HoraActual(LocalDateTime.of(2000,10,20,11,32));
		HoraActual(LocalDateTime.now());
		//HoraActual();

	}

}
