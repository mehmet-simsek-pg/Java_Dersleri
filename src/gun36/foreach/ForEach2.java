package gun36.foreach;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEach2 {

    public static void main(String[] args) {
        // Array listdeki sayi degerleri kadar her satira yildiz yazdirin
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,7,8,12,35));

        for (Integer n : list) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------");

        list.forEach(n -> {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        });
    }
}
