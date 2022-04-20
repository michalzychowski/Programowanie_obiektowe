package PO_UR.LAB05.LocalDataExample;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        // aktualna z domyślną strefą
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        System.out.println("Aktualny czas w strefie komputera (serwera): " + zonedDateTime1);

        // aktualna w konretnej strefie
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("Poland"));
        System.out.println("Aktualny czas w strefie czasowej Polski: " + zonedDateTime2);

        // na podstawie LocalDateTime w konkretnej strefie
        LocalDateTime localDateTime = LocalDateTime.parse("2015-05-30T14:20:50");
        ZonedDateTime zonedDateTime3 = ZonedDateTime.of(localDateTime, ZoneId.of("Japan"));
        System.out.println("Data '2015-05-30T14:20:50' w strefie czasowej Japoni: " + zonedDateTime3);
    }
}
