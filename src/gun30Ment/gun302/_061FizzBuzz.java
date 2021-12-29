package gun30Ment.gun302;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.TreeSet;

public class _061FizzBuzz {
    public static void main(String[] args) {
    /*
        1 ile 100 arasindaki sayilardan
        3 ile bölünenen yerine FIZZ
        5 ile bölünenen yerine BAZZ
        15  ile bölünenen yerine FIZZBAZZ yazdirin
     */

        String format = "%-10s";
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0)
                System.out.printf(format, "FIZZBUZZ");
            else if (i % 5 == 0)
                System.out.printf(format,"BAZZ");
            else if (i % 3 == 0)
                System.out.printf(format,"FIZZ");
            else
                System.out.printf(format, i);

            if (i%15 == 0) System.out.println();
        }






    }
}
