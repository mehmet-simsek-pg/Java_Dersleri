package gun25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        // Kullanicinin 1 ve ya 1 den fazla sayi girebilecegi ama tekrar eden sayilari
        //         kaydetmeyecek bir program yazin.

        sayilar(2);
        sayilar(2,3,4,5,2);
        sayilar(3,4,3);

    }
    public static void sayilar(int...nums){
        HashSet<Integer> sayilar = new HashSet<>();
        for (int num: nums){
            sayilar.add(num);
        }
        System.out.println(sayilar);
    }
}
