package gun25hs;

import java.util.ArrayList;
import java.util.List;

public class _05ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(7, 8, 9, 10, 11, 12, 13));
        ArrayList<Integer> list3 = new ArrayList<>(List.of(101, 102, 103));

        // deger degistirme
        list3.set(2, 105);
        System.out.println(list3);

        System.out.println("-----------------------------");
        // Iki list arasinsindaki ortak ve farkli elemanlar

        /*
        list1.addAll(list3);
        System.out.println(list1);
        list1.removeAll(list3);
        System.out.println(list1);
        list1.removeAll(list2);
        System.out.println(list1);

        */
        // retainAll  kesisen elemanlari list1 icinde birakir
        list1.retainAll(list2);
        System.out.println(list1);


        /*
            list1 = 1, 2, 3, 4, 5, 6, 7, 8, 9
            list2 = 7, 8, 9, 10, 11, 12, 13
            [1, 2, 3, 4, 5, 6, 10, 11, 12, 13]

         */
    }
}
