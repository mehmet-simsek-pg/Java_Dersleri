package gun25hs;

import java.util.ArrayList;
import java.util.List;

public class _06ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(7, 8, 9, 10, 11, 12, 13));
        /*
            list1.addAll(list2)      :  list1'e list2'nin tüm elemanlarini ekler
            list1.removeAll(list2)   :  list1'den list2'nin tüm elemanlarini siler
            list1.retainAll(list2)   :  list1'den list2 ile ortak olmayan elemanlari siler


            1, 2, 3, 4, 5, 6, 7, 8, 9
            7, 8, 9, 10, 11, 12, 13

            list3 = list1
             list3.retainAll(list2)
             (1, 2, 3, 4, 5, 6, 7, 8, 9).retainAll(7, 8, 9, 10, 11, 12, 13)
             7, 8, 9

            (1, 2, 3, 4, 5, 6, 7, 8, 9).addAll(7, 8, 9, 10, 11, 12, 13)
            1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 8, 9, 10, 11, 12, 13

            list1.removeAll(list3)
            (1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 8, 9, 10, 11, 12, 13).removeAll(7, 8, 9)
            1, 2, 3, 4, 5, 6, 10, 11, 12, 13
         */

        ArrayList<Integer> list3 = new ArrayList<>(list1);

        System.out.println(list3 + " : list3=list1");
        System.out.println(list1 + " : list1");
        list3.retainAll(list2);
        System.out.println(list3 + "  : list3.retainAll(list2);");
        list1.addAll(list2);
        System.out.println(list1 + " : list1.addAll(list2);");

        list1.removeAll(list3);
        System.out.println(list1 + " : list1.removeAll(list3);");



    }
}
