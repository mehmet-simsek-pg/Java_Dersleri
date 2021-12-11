package gun20hs;

import java.util.Arrays;

public class _01Array {
    public static void main(String[] args) {

        int i = 1;  // decleration, initialization
        int[] arr1; // {1, 2, 6, 7, 90}

        // arraylerde sinir belirlenir
        int[] arr2 = new int[5];  //ram'da 5 adet int yeri acar ve hepsini 0'a esitler

        // veri atamasi
        // length 1"den baslar, index ise 0"dan baslar
        arr2[0] = 1;
        arr2[1] = 3;
        arr2[2] = 6;
        arr2[3] = 8;
        arr2[4] = 9;
        //arr2[5] = 10;  hata verir

        // ekrana yazdirma
        System.out.println(arr2);

        // arrayler icinde for ile gezinti yapariz
        for (int j = 0; j < arr2.length; j++) {
            System.out.println(arr2[j]);
        }

        // Arrays.toString()
        System.out.println(Arrays.toString(arr2));


        // for each
        for (int k : arr2) {
            System.out.print(k + ", ");
        }

    }
}
