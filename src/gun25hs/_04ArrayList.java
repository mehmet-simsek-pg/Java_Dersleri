package gun25hs;

import java.util.ArrayList;
import java.util.List;

public class _04ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(7,8,9, 10, 11, 12, 13));
        ArrayList<Integer> list3 = new ArrayList<>(List.of(101, 102, 103));
        ArrayList<String> list4 = new ArrayList<>(List.of("a", "b", "c"));


        // eleman ekleme
        list1.add(10);
        list2.add(3, 15);
        System.out.println(list1 + " , " + list2);

        // elemana ulasma
        System.out.println(list1.get(1));

        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + ", ");      // random access
        }

        // contains, 1 sayisi list1 icinde var mi?
        System.out.println(list1.contains(1));

        // addAll
        // list3.addAll(list1);
        if (list3.addAll(0, list1)){
            System.out.println("eklendi");
        }else{
            System.out.println("eklenemedi");
        }

        System.out.println(list3);
        System.out.println(list1);
        System.out.println("----------------------------------");

    }
}
