package gun17;


import java.util.Scanner;

public class _05_ArrayExample {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane sayi isteyin.
        Bu sayilardan ortalamayi gecen sayi miktarini bulun.
         */

        Scanner scanner = new Scanner(System.in);
        int[] sayilar = new int[5];
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("sayi girin");
            sayilar[i]= scanner.nextInt();
            toplam+=sayilar[i];
        }
        int ortalama = toplam/ sayilar.length;
        int miktar = 0;

        for (int sayi: sayilar){
            if (sayi>ortalama){
                miktar++;
            }
        }
        System.out.println("miktar = " + miktar);
    }
}
