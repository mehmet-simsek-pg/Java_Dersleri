package gun51;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _2LocalTime1 {
    public static void main(String[] args) {

        // suanki zaman
        LocalTime time = LocalTime.now();
        System.out.println(time);


        //1+2+3+4+....+1_000_000_000
        LocalTime t1 = LocalTime.now();
        int a = 0;
        for (int i = 0; i < 1_000_000_000; i++) {
            a+=i;
        }
        LocalTime t2 = LocalTime.now();
        System.out.println(t1 + ", " + t2);
        System.out.println("----------------");

        System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println(time.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
        System.out.println(time.format(DateTimeFormatter.ofPattern("h:m:s")));
        System.out.println(time.format(DateTimeFormatter.ofPattern("h:m:s a")));

        LocalTime time1 = LocalTime.of(2,34,12);
        System.out.println(time1.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        System.out.println(time1.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));

    }
}
