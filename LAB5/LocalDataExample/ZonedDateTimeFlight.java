package PO_UR.LAB05.LocalDataExample;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeFlight {
    public static void main(String[] args) {
        LocalDateTime localDepartureTime = LocalDateTime.parse("2019-05-22T15:00:00");
        ZoneId departureZone = ZoneId.of("Europe/Warsaw");
        ZonedDateTime departureTime = ZonedDateTime.of(localDepartureTime,departureZone);

        System.out.println("Data i czas odlotu w strefie czasowej Polski: " + departureTime);

        ZonedDateTime arrivalTime = departureTime.plusHours(7);
        System.out.println("Data i czas przylotu w strefie czasowej Polski: " + arrivalTime);

        ZonedDateTime arrivalTimeTokyo = arrivalTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("Data i czas przylotu w strefie czasowej Tokyo: " + arrivalTimeTokyo);
    }
}
