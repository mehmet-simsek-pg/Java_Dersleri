package gun20hs;

import java.util.Arrays;

public class _04Array2D {

    public static void main(String[] args) {
        // elemanlari int olan bir dizi
        int[] arr = {1,2,3};


        int[][] arr2 = {         //                 0   1   2
                {1, 2, 3},      // arr2[0]      0   1   2   3
                {3, 5, 7},      // arr2[1]      1   3   5   7
                {10, 11, 12}    // arr2[2]      2   10  11  12
        };

        System.out.println(arr + " - " + arr[0]);
        System.out.println(arr2 + " - " + arr2[0] + ", " + arr2[0][1]);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }


        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }


    }

}
