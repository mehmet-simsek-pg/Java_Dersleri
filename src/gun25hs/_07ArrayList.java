package gun25hs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _07ArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(){{
            for (int i = 0; i < 20; i++) {
                int num = (int) (Math.random()*100);
                add(num);
            }
        }};

        ArrayList<String> list2 = new ArrayList<>(){{
            for (int i = 0; i < 20; i++) {
                int num = 97 + (int) (Math.random()*28);
                add(String.valueOf((char)num));
            }
        }};

        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);
        System.out.println("Max:" + Collections.max(list1));
        System.out.println("Min:" + Collections.min(list1));
        Collections.swap(list1, 1, 4);
        System.out.println(list1);


        /*
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
        */

    }
}
