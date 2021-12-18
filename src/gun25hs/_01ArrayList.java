package gun25hs;

import java.util.ArrayList;
import java.util.Scanner;

public class _01ArrayList {

    public static void main(String[] args) {


        String str = "Java";
        System.out.println(str);
        str = str.substring(0, 2);
        System.out.println(str.substring(0, 2));


        int[] arr = new int[]{1,2,3};
        arr[1] = 10;



        System.out.println(arr);


        double[] arr1 = new double[2];
        String[] arr2 = new String[5];

        Object[] arr3 = new Object[5];
        arr3[0] = 1;
        arr3[1] = "Java";
        arr3[2] = new Scanner(System.in);


        /*
            Collections
            List            Set
            ArrayList       HashSet
            LinkedList      LinkedHashSet
                            TreeSet

            Random Access
            arr[2]
         */


        int a1 = 5;
        var a2 = 5;
        //var a3;   initialize edilmeden kullanilamaz
        var sc = new Scanner(System.in);

    }

}
