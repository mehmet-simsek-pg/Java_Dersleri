package mentoring.Gun03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEg02 {
    //   Consider an integer array, the number of elements in which is determined by the user.
    //   The elements are also taken as input from the user.
    //   Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin eleman sayisini giriniz= ");
        int elemanSayisi = scanner.nextInt();
        int[] array = new int[elemanSayisi];

        for (int i = 0; i < elemanSayisi; i++) {
            int eleman = scanner.nextInt();
            array[i] = eleman;
        }

        int enBuyuk = enBuyukFark(array);
        int enKucuk = enKucukFark(array);

//        Bu kismi methoda aldik

//        int enBuyuk = 0;
//        int enKucuk=0;
//        int count=0;
//        for (int j = 0; j < array.length - 1; j++) {
//            for (int k = j+1; k < array.length; k++) {
//                int fark1 = Math.abs(array[j] - array[k]);
//                if (fark1 > enBuyuk) {
//                    enBuyuk = fark1;
//                }
//                //int fark2 = Math.abs(array[j] - array[k]);
//                if (count==0){
//                    enKucuk=fark1;
//                    count++;
//                }
//
//                if (fark1 < enKucuk) {
//                    enKucuk = fark1;
//                }
//            }
//        }
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        System.out.println("enKucukFark = " + enKucuk);
        System.out.println("enBuyukFark = " + enBuyuk);
    }

    public static int enKucukFark(int[] dizi) {

        int enKucukFark = 0;
        int count = 0;
        for (int j = 0; j < dizi.length - 1; j++) {
            for (int k = j + 1; k < dizi.length; k++) {
                int fark1 = Math.abs(dizi[j] - dizi[k]);
                //int fark2 = Math.abs(array[j] - array[k]);
                if (count == 0) {
                    enKucukFark = fark1;
                    count++;
                }

                if (fark1 < enKucukFark) {
                    enKucukFark = fark1;
                }
            }
        }
        return enKucukFark;
    }

    public static int enBuyukFark(int[] dizi) {

        int enBuyukFark = 0;
        for (int j = 0; j < dizi.length - 1; j++) {
            for (int k = j + 1; k < dizi.length; k++) {
                int fark1 = Math.abs(dizi[j] - dizi[k]);
                if (fark1 > enBuyukFark) {
                    enBuyukFark = fark1;
                }
            }
        }
        return enBuyukFark;
    }


}
