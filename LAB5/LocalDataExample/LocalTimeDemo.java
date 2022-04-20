package PO_UR.LAB05.LocalDataExample;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {
    public static void main(String[] args) {
        // tworzenie obiektów LocalTime
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = LocalTime.parse("18:48:23");
        System.out.println("LocalTime #1: " + localTime1);
        System.out.println("LocalTime #2: " + localTime2);

        // modyfikacja czasu
        LocalTime localTime1Plus5Hours = localTime1.plusHours(5);
        System.out.println("Aktualny czas plus 5 godzin: " + localTime1Plus5Hours);

        LocalTime localTime1Minus200Minutes = localTime1.minusMinutes(200);
        System.out.println("Aktualny czas minus 200 minut: " + localTime1Minus200Minutes);

        LocalTime localTime1Plus15Hours = localTime1.plus(15, ChronoUnit.HOURS);
        System.out.println("Aktualny czas plus 15 godzin: " + localTime1Plus15Hours);
    }
}
