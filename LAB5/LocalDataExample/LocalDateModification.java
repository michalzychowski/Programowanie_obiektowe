package PO_UR.LAB05.LocalDataExample;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateModification {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Aktualna data: " + localDate);

        LocalDate date6YearsAfter = localDate.plus(6, ChronoUnit.YEARS);
        System.out.println("Data za 6 lat: " + date6YearsAfter);

        LocalDate date50DaysBefore = localDate.minus(50, ChronoUnit.DAYS);
        System.out.println("Data sprzed 50 dni: " + date50DaysBefore);

    }
}
