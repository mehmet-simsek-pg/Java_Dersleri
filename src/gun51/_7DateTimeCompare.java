package gun51;

import java.time.LocalDate;

public class _7DateTimeCompare {

    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate dun = bugun.minusDays(1);
        LocalDate bugun1 = dun.plusDays(1);

        System.out.println(bugun.isAfter(dun));
        System.out.println(bugun.isEqual(bugun1));
        System.out.println(bugun.isBefore(dun));
        System.out.println(bugun.isLeapYear()); // artik yil, 29 Subat olan yillar

        System.out.println(bugun.compareTo(dun));   // ardakadi en büyük fark ne ise onu verir
        System.out.println("--------------------------");

        LocalDate d0 = LocalDate.of(2022, 6,15);
        LocalDate d1 = LocalDate.of(2011, 2,2);
        LocalDate d2 = LocalDate.of(2022, 1,2);
        LocalDate d3 = LocalDate.of(2022, 6,2);
        System.out.println(d0.compareTo(d1));
        System.out.println(d0.compareTo(d2));
        System.out.println(d0.compareTo(d3));



    }
}
