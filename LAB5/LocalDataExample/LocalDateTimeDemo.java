package PO_UR.LAB05.LocalDataExample;

import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        // tworzenie
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.parse("2015-05-30T18:54:23");

        System.out.println("LocalDateTime #1: " + localDateTime1);
        System.out.println("LocalDateTime #2: " + localDateTime2);

        // modyfikacja
        Period oneYearPeriod = Period.ofYears(1);
        LocalDateTime localDateTime1AfterYear = localDateTime1.plus(oneYearPeriod);
        System.out.println("Data i czas 'za rok': " + localDateTime1AfterYear);

        LocalDateTime localDateTime1Minus30Months = localDateTime1.minusMonths(30);
        System.out.println("Data i czas 'sprzed 30 miesięcy': " + localDateTime1Minus30Months);
    }
}
