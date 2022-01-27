package gun49.JavaLocalDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDate1 {

    public static void main(String[] args) {

        // LocalDate yil, ay, gun icerir
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate date1 = LocalDate.of(1990, 3, 5);
        LocalDate date2 = LocalDate.of(1990, Month.MARCH, 5);

        System.out.println("date.getYear() : " + date.getYear());
        System.out.println("date.getMonth() : " + date.getMonth());
        System.out.println("date.getMonthValue() : " + date.getMonthValue());
        System.out.println("date.getDayOfWeek() : " + date.getDayOfWeek());
        System.out.println("date.getDayOfMonth() : " + date.getDayOfMonth());
        System.out.println("date.getDayOfYear() : " + date.getDayOfYear());

        System.out.println("----------------------------");
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(date1.format(format1));
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("d/M/yy");
        System.out.println(date1.format(format2));

        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.US)));

        Locale[] locales = Locale.getAvailableLocales();
        for (Locale locale : locales) {
            //System.out.println(locale);
        }
        System.out.println("------------------------");
        Locale tr = new Locale("tr", "TR");
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(tr)));


    }
}
