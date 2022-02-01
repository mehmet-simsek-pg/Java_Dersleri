package gun51;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CheckAge {


    public static void main(String[] args) {

        System.out.println(getAge("01/01/1980"));
        System.out.println(getAge("01/01/2010"));


    }

    public static boolean getAge(String dob){

        LocalDate date = LocalDate.now();
        LocalDate date1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return Period.between(date1, date).getYears()>=18;

    }
}
