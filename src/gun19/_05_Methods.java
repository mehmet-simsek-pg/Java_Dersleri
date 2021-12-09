package gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _05_Methods {
    public static void main(String[] args) {

        /*
        Kullanicidan aralarinda bir bosluk birakarak 5 tam sayi girmesini isteyin.
        Bu sayilardan en büyügünü ve en kücügünü bulan iki farkli metot yazin.
         */

        Scanner scanner = new Scanner(System.in);

        String sayilarCumle = scanner.nextLine();

        String[] array = sayilarCumle.split(" ");

        int[] sayilar = new int[array.length];

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = Integer.parseInt(array[i]);
        }

        enbArray(sayilar);
        enkArray(sayilar);

    }

    public static void enkArray(int[] nums) {
        Arrays.sort(nums);
        /*
        metot icerisinde baska bir metodda kullanilabilir.
        Metotlarda yapilan islemler sadece kendi icini etkiler,
        eger bir metot baska bir metot icerisinde de kullanilirsa o zaman kullanilan
        metodu da etkiler.
         */
        System.out.println("en kücük sayi="+nums[0]);
    }

    public static void enbArray(int[] dizi) {
        Arrays.sort(dizi);
        System.out.println("en büyük sayi="+dizi[dizi.length-1]);
    }

}
