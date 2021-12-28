package gun30Ment.gun301;

import java.util.HashSet;

public class _04Set {

    public static void main(String[] args) {
        HashSet<Integer> set1  = new HashSet<>(){{
            add(1);
            add(8);
            add(12);
            add(1234);
            add(800);
            add(56);
            add(1);
        }};

        System.out.println(set1);

        int[] arr = {1,3};
        int[] arr1 = new int[]{1,3};

        // random access
        for (Integer integer : set1) {
            System.out.print(integer + "\t");
        }
        System.out.println();
        set1.remove(56);
        System.out.println(set1);

        // iterator
    }
}
