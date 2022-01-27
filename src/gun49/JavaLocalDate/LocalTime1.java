package gun49.JavaLocalDate;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class LocalTime1 {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime time1 = LocalTime.of(2, 12, 34, 123);
        System.out.println(time1);

        System.out.println("time.getHour() : " + time.getHour());
        System.out.println("time.getMinute() : " + time.getMinute());
        System.out.println("time.getSecond() : " + time.getSecond());
        System.out.println("time.getNano() : " + time.getNano());

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(time.format(format1));
        format1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(time.format(format1));
        format1 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(time.format(format1));


        System.out.println(time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        System.out.println(time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));

    }

    public static void sleep(long milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
