package gun25hs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _03ArrayList {

    public static void main(String[] args) {


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(10);
        list1.add(5);
        list1.add(3);
        System.out.println(list1);
        System.out.println("--------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>(){{
            add(101);
            add(103);
            add(1, 102);
        }};
        System.out.println(list2);

        System.out.println("--------------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>(){{
            for (int i = 0; i < 20; i++) {
                int num = (int) (Math.random()*100);
                add(num);
            }
        }};
        System.out.println(list3);


        System.out.println("--------------------------------------");

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1,7,9,2,13));
        System.out.println(list4);

        System.out.println("--------------------------------------");
        ArrayList<Integer> list5 = new ArrayList<>(List.of(10, 14, 78, 103));
        System.out.println(list5);

        System.out.println("--------------------------------------");

        Integer[] arr = {1,2,3,4,5,6,7,8,9};    // int[] arr  tanimlanirsa .asList kabul etmez.  Integer olmali
        ArrayList<Integer> list6 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list6);
    }
}
