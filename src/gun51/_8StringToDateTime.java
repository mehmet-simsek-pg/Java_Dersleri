package gun51;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _8StringToDateTime {

    public static void main(String[] args) {

        String str = "10%05&2021";
        // stringin tarih formatini okumak icin olusturulan pattern
        DateTimeFormatter readFormat = DateTimeFormatter.ofPattern("dd%MM&yyyy");

        LocalDate strDate = LocalDate.parse(str, readFormat);
        //LocalDate strDate = LocalDate.parse(str, DateTimeFormatter.ofPattern("dd%MM&yyyy"));
        System.out.println(strDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(new Locale("tr", "TR"))));


        String str1 = "10.23.12";
        String str2 = "10:23";
        System.out.println(LocalTime.parse(str1, DateTimeFormatter.ofPattern("HH.mm.ss")).plusSeconds(5));
        System.out.println(LocalTime.parse(str2).plusSeconds(5));


        // 2022-01-10 10:23:11
        // 2022-01-10
        // 10:23:11


    }
}
