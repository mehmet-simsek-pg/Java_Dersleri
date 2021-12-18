package gun25hs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _08ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 30, 5, 3, 7, 8, 13, 4, 14, 20));
        System.out.println(list);

        /*
            6, 3, 5, 3, 7, 8, 13, 4, 1, 20
            1, 3, 5, 6, 7, 8, 3, 4, 14, 20

         */

        for (int i = 0; i < list.size(); i++) {

            for (int j = i+1; j < list.size(); j++) {       //      i               i

                if (list.get(i)>list.get(j)){
                    Collections.swap(list, i, j);
                }

            }
        }
        /*
                i   j
                0   1       list.get(0) > list.get(1)
                0   2       list.get(0) > list.get(2)
                ....
                1   2       list.get(1) > list.get(2)


         */

        System.out.println(list);

    }
}
