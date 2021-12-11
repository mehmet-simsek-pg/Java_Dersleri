package gun20hs;

import java.util.Arrays;
import java.util.Scanner;

public class _02ArrayOrnek {


    public static void main(String[] args) {
        // kullanicidan alinan 5 adet integer sayiyi array"e atin.
        // Arrayi ekrana yazdirin
        // bunlardan tek indexlileri 1 artirin
        // cift indekslileri 0"a esitleyin
        // arrayi ekrana yazdiralim

        int[] arr = new int[5];
        /*
            int arr0 = 1;
            int arr1 = 4;
            int arr2 = 7;
            int arr3 = 2;
            int arr4 = 9;

         */

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + ". sayiyi girin : ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = 0;
            } else {
                arr[i] += 1;
            }
        }

        System.out.println();
        String s = Arrays.toString(arr);
        System.out.println(s);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        String intStr = "";
        for (int i : arr) {
            intStr += String.valueOf(i);
        }
        System.out.println(intStr);


    }



}
