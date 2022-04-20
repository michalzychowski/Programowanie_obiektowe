package PO_UR.LAB05.LocalDataExample;

import java.time.LocalDate;

public class LocalDateCreate {
    public static void main(String[] args) {
        // aktualna data
        LocalDate localDate1 = LocalDate.now();
        System.out.println("Local date #1: " + localDate1);
        // data podawana jako liczby rok-miesiąc-dzień
        LocalDate localDate2 = LocalDate.of(2019, 5, 25);
        System.out.println("Local date #2: " + localDate2);
        // data podawana text w formacie ISO
        LocalDate localDate3 = LocalDate.parse("2019-06-13");
        System.out.println("Local date #3: " + localDate3);
    }
}
