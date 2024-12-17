package Format;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ZonasHorarias {

    public static void main(String[] args) {

        // LocalDate
        localDateEjemplo();

        // LocalTime
        localTimeEjemplo();

        // LocalDateTime
        localDateTimeEjemplo();

        // ZonedDateTime
        zonedDateTimeEjemplo();

        // Period
        periodEjemplo();

        // Duration
        durationEjemplo();

    }

    private static void localDateEjemplo() {
        LocalDate fecha = LocalDate.now();
        LocalDate localDateOf = LocalDate.of(2017, 10, 10);
        LocalDate datePlus = localDateOf.plusDays(7);
        LocalDate dateMinus = localDateOf.minusDays(7);
        boolean isBefore = LocalDate.of(2017, 10, 10).isBefore(LocalDate.of(2017, 8, 20));
        boolean isAfter = LocalDate.of(2017, 10, 10).isAfter(LocalDate.of(2017, 8, 20));
        
        System.out.println(fecha.toString());
        System.out.println(localDateOf.toString()); // 2017-10-10
        System.out.println(datePlus.toString());  // 2017-10-17
        System.out.println(dateMinus.toString()); // 2017-10-03
        System.out.println(isBefore); // false
        System.out.println(isAfter); // true
    }

    private static void localTimeEjemplo() {
        LocalTime localTime = LocalTime.now();
        LocalTime hour = LocalTime.of(6, 30);
        LocalTime localTimePlus = hour.plus(1, ChronoUnit.HOURS);
        LocalTime localTimeMinus = hour.minus(60, ChronoUnit.SECONDS);
        boolean isBeforeHour = LocalTime.parse("08:30").isBefore(LocalTime.parse("10:20"));
        
        System.out.println(localTime);
        System.out.println(hour); // 06:30
        System.out.println(localTimePlus); // 07:30
        System.out.println(localTimeMinus); // 06:29
        System.out.println(isBeforeHour); // true
    }

    private static void localDateTimeEjemplo() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTimeOf = LocalDateTime.of(2017, Month.AUGUST, 20, 8, 30);
        LocalDateTime localDateTimePlus = localDateTimeOf.plusDays(5);
        LocalDateTime localDateTimeMinus = localDateTimePlus.minusMinutes(10);
        
        System.out.println(localDateTime);
        System.out.println(localDateTimeOf); // 2017-08-20T08:30
        System.out.println(localDateTimePlus); // 2017-08-25T08:30
        System.out.println(localDateTimeMinus); // 2017-08-25T08:20
    }

    private static void zonedDateTimeEjemplo() {
        ZoneId.getAvailableZoneIds().forEach(z -> System.out.println(z)); // list of all zones

        ZoneId zona = ZoneId.of("America/Panama");
        LocalDateTime fecha = LocalDateTime.of(2017, Month.AUGUST, 20, 8, 30);
        ZonedDateTime zDT = ZonedDateTime.of(fecha, zona);
        System.out.println(zDT); // 2017-08-20T08:30-05:00[America/Panama]

        ZonedDateTime tokyozDT = fecha.atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyozDT); // 2017-08-20T08:30+09:00[Asia/Tokyo]
    }

    private static void periodEjemplo() {
        LocalDate startLocalDate = LocalDate.of(2017, 10, 10);
        LocalDate endLocalDate = startLocalDate.plus(Period.ofDays(10));  // 2017-10-20
        
        int diffDays = Period.between(startLocalDate, endLocalDate).getDays();
        System.out.println(diffDays); // 10
    }

    private static void durationEjemplo() {
        LocalTime startLocalTime = LocalTime.of(8, 30);
        LocalTime endLocalTime = startLocalTime.plus(Duration.ofHours(3));  // 11:30

        long diffSeconds = Duration.between(startLocalTime, endLocalTime).getSeconds();
        System.out.println(diffSeconds); // 10800 seconds
    }

}