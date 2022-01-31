package mentoring.Gun03;

import java.util.Arrays;

public class ArraysEg01 {
        //Fill an array with 20 unique random integers between 0-100 and print the following:
        //number of odd numbers
        //number of even numbers

    public static void main(String[] args) {

        int[] sayilar=diziOlustur();
        int[] sayilar1=diziOlustur();
        int[] sayilar2=diziOlustur();
        int[] sayilar3=diziOlustur();

//        Bu kismi method icine aldik

//        int[] dizi=new int[20];
//        int elemansayisi=0;
//
//        while (elemansayisi<20) {
//            int sayi = (int) (Math.random() * 100);
//            boolean varmi = false;
//
//            for (int eleman : dizi) {
//
//                if (eleman == sayi) {
//                    varmi = true;
//                    break;
//                }
//            }
//            if (!varmi) {
//                dizi[elemansayisi]=sayi;
//                elemansayisi++;
//            }
//        }

        int teksayi=tekSayi(sayilar);
        int ciftsayi=ciftSayi(sayilar1);

//             Bu kismi method icine aldik
//        int teksayi=0;
//        int ciftsayi=0;
//        for (int eleman: sayilar){
//            if(eleman%2==0){
//                ciftsayi++;
//            }else {
//                teksayi++;
//            }
//        }
        System.out.println("ciftsayi = " + ciftsayi);
        System.out.println("teksayi = " + teksayi);
    }

    public static int[] diziOlustur(){
        int[] dizi=new int[20];
        int elemansayisi=0;

        while (elemansayisi<20) {
            int sayi = (int) (Math.random() * 100);
            boolean varmi = false;

            for (int eleman : dizi) {

                if (eleman == sayi) {
                    varmi = true;
                    break;
                }
            }
            if (!varmi) {
                dizi[elemansayisi]=sayi;
                elemansayisi++;
            }
        }
        return dizi;
    }

    public static int tekSayi(int[] dizi) {
        int teksayi = 0;

        for (int eleman : dizi) {
            if (eleman % 2 == 1) {
                teksayi++;
            }
        }
        return teksayi;
    }

    public static int ciftSayi(int[] dizi) {
        int ciftsayi = 0;

        for (int eleman : dizi) {
            if (eleman % 2 == 0) {
                ciftsayi++;
            }
        }
        return ciftsayi;
    }
}
