package PO_UR.LAB05.LocalDataExample;

import java.time.LocalDate;
import java.time.Period;

public class PeriodAndLocalDate {
    public static void main(String[] args) {
        // okres 1 roku, 11 miesięcy i 15 dni
        Period period1 = Period.of(1, 11, 15);
        System.out.println("Okres 1 roku, 11 miesięcy i 15 dni: " + period1);

        LocalDate localDate1 = LocalDate.parse("2019-05-02");
        LocalDate localDate2 = LocalDate.parse("2015-01-28");
        System.out.println("Data #1: " + localDate1);
        System.out.println("Data #2: " + localDate2);

        // okres pomiędzy dwiema datami
        Period period2 = Period.between(localDate1, localDate2);
        System.out.println("Okres pomiędzy datami #1 i  #2: " + period2);


        LocalDate localDateNow = LocalDate.now();

        // dodanie okresu do daty
        LocalDate datePlusPeriod1 = localDateNow.plus(period1);
        System.out.println("Aktualna data plus okres 1: " + datePlusPeriod1);

        // odjęcie okresu od daty
        LocalDate dateMinusPeriod2 = localDateNow.minus(period2);
        System.out.println("Aktualna data minus okres 2: " + dateMinusPeriod2);

    }
}
