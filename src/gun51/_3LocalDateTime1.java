package gun51;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _3LocalDateTime1 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println(dateTime.getHour());
        System.out.println(dateTime.getSecond());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.println(dateTime.format(formatter));
        System.out.println(formatter);
    }
}
