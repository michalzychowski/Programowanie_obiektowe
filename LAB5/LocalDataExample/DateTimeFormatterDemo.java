package PO_UR.LAB05.LocalDataExample;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        // formatowanie daty
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Aktualna data (format domyślny): " + zonedDateTime);
        System.out.println("Aktualna data (format dd.MM.yyyy hh:mm): " + dtf1.format(zonedDateTime));

        // parsowanie daty - gotowy formatter (yyyy-MM-ddThh:mm)
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime localDateTimeParsed = LocalDateTime.parse("2019-10-25T18:20", dtf2);
        System.out.println("Sparsowana LocalDateTime: " + localDateTimeParsed);

        // parsowanie daty - własny formatter z konkretną strefą czasową
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm")
                .withZone(ZoneId.of("Europe/Warsaw"));
        ZonedDateTime zonedDateTimeParsed = ZonedDateTime.parse("10/25/2019 18:20", dtf3);
        System.out.println("Sparsowana ZonedDateTime: " + zonedDateTimeParsed);
    }
}
