package gun51;

import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;

public class _6Duration1 {

    public static void main(String[] args) {
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.now(ZoneId.of("Turkey"));

        Duration duration = Duration.between(time1, time2);

        System.out.println(time1 + " , " + time2);
        System.out.println(duration.getSeconds());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toMillis());
    }
}
