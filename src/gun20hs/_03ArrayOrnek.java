package gun20hs;

import java.util.Arrays;

public class _03ArrayOrnek {
    public static void main(String[] args) {
        /*
            Tanimlanmis bir int array"in max ve min degerlerini baska bir arraye atiniz
            Örnek : int[] arr = {1,-2, 5, 8, 9, 3};
         */

        int[] arr = {1,-2, 5, 8, 9, 3};

        // Ekrandan veri alinirsa bu tanimlamalari yapmak daha mantikli
        //int min = Integer.MAX_VALUE;
        //int max = Integer.MIN_VALUE;

        int min = arr[0];
        int max = arr[0];

        for (int eleman : arr) {
            if (eleman > max) max = eleman;
            if (eleman < min) min = eleman;
        }

        int[] newArr = {min, max};
        int[] newArr1 = new int[]{min, max};
        System.out.println(Arrays.toString(newArr));


        System.out.println(Arrays.toString(new int[]{min, max}));



    }
}
