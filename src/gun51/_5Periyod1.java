package gun51;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;

public class _5Periyod1 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalDate date1 = LocalDate.of(1975, 3, 6);

        Period period = Period.between(date1, date);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println("-------------");

        System.out.println(date.plusDays(1));
        System.out.println(date.plusDays(-1));  // plusDays(-1) == minusDays(1)
        System.out.println(date.minusDays(1));

        System.out.println(date.plusYears(3).plusDays(1).plusWeeks(3));

        Period p = Period.ofDays(1);
        System.out.println(date.plus(p));


        // burasi gun > 28/31 oldugu icin runtime hatasi verir
        LocalDate dd = LocalDate.of(2022, 6, 40);
        System.out.println(dd);
    }

}
