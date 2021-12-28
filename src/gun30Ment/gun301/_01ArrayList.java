package gun30Ment.gun301;

import java.util.ArrayList;
import java.util.LinkedList;

public class _01ArrayList {

    public static void main(String[] args) {
        /*
            Array               ArrayList
            siniri belli        Sinir belli degil

         */
        String str = " aa ";        // immutable
        str.trim();
        System.out.println(str.trim());
        System.out.println(str);
        str = str.trim();           // "aa"
        System.out.println(str);


        int a = 5;

        int[] arr = new int[5];
        int[] arr1 = new int[10];

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(23);
        list.add(10);
        list.add(1234);
        list.add(-1);
        list.add(1);
        System.out.println(list);

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(23);
        list1.add(10);
        list1.add(1234);
        list1.add(-1);
        list1.add(1);
        System.out.println(list1);

        System.out.println(list.get(3));

        System.out.println("------------");

        for (int i = 0; i < list.size(); i++) {
            if (i==4) continue;
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();

        for (Integer i : list) {      // iterable
            System.out.print(i + "\t");
        }
    }

}
