package gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Methods {
    public static void main(String[] args) {
         /*
        Kullanicidan aralarinda bir bosluk birakarak 5 tam sayi girmesini isteyin
        ve sayilari bir metot ile diziye atin.
        Bu sayilardan en büyügünü ve en kücügünü bulan iki farkli metot yazin.
         */


        sayilariBoslugaGöreDiziyeEkleme("12 23 34 45");
        sayilariVirgüleGöreDiziyeEkleme("23,34,45,56");

    }

    public static void sayilariBoslugaGöreDiziyeEkleme(String sayilarParametre) {

        String[] sayilar = sayilarParametre.split(" ");
        System.out.println(Arrays.toString(sayilar));
    }

    public static void sayilariVirgüleGöreDiziyeEkleme(String sayilarParametre) {
        String[] sayilar = sayilarParametre.split(",");
        System.out.println(Arrays.toString(sayilar));
    }

    public static void diziOlusturma() {
        Scanner scanner = new Scanner(System.in);
        String sayilarCumle = scanner.nextLine();
        String[] sayilar = sayilarCumle.split(" ");
        int[] intSayilar = new int[sayilar.length];

        for (int i = 0; i < sayilar.length; i++) {
            intSayilar[i]=Integer.parseInt(sayilar[i]);
        }
        System.out.println(Arrays.toString(intSayilar));
    }
}
