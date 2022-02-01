package gun51;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _4ZonedDateTime1 {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        LocalTime time1 = LocalTime.now(ZoneId.of("Turkey"));

        System.out.println(time);
        System.out.println(time1);

        Set<String> bolgeler = ZoneId.getAvailableZoneIds();
        for (String bolge : bolgeler) {
            System.out.println(bolge);
        }
        System.out.println(LocalTime.now(ZoneId.of("Asia/Kuala_Lumpur")));
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Nicosia"));
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("US/Pacific"));
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);
    }
}
