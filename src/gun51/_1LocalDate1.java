package gun51;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _1LocalDate1 {
    public static void main(String[] args) {
        // su anki tarihi
        LocalDate date = LocalDate.now();
        System.out.println(date);

        // belirli bir tarih verebiliyoruz
        LocalDate date1 = LocalDate.of(2018, 3, 21);
        System.out.println(date1);

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getDayOfWeek());
        System.out.println("--------------");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(date.format(formatter));
        System.out.println("------------------------");

        System.out.println(date.format(DateTimeFormatter.ISO_DATE));
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));

        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println(
                date.format(DateTimeFormatter
                        .ofLocalizedDate(FormatStyle.LONG)
                        .withLocale(new Locale("tr", "TR")))
        );


        // javada mevcut localleri bulmak icin
        Locale[] locales = Locale.getAvailableLocales();
        for (Locale locale : locales) {
            System.out.println(locale);
        }

        System.out.println(
                date.format(DateTimeFormatter
                        .ofLocalizedDate(FormatStyle.LONG)
                        .withLocale(new Locale("ar", "QA")))
        );





    }
}
