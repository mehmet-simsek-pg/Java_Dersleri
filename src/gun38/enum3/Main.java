package gun38.enum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*Kitap kitap1 = Kitap.KITAP1;
        Kitap kitap2 = Kitap.KITAP2;
        Kitap kitap3 = Kitap.KITAP3;

        System.out.println(kitap1.getYazari());
        System.out.println(kitap1);
        */

        ArrayList<Kitap> kitaplar = new ArrayList<>(Arrays.asList(Kitap.KITAP1, Kitap.KITAP2, Kitap.KITAP3));

        for (Kitap kitap : kitaplar) {
            System.out.println(kitap);
        }

        System.out.println("-----------------------");
        kitaplar.forEach(k -> System.out.println(k));
        System.out.println("-------------------");
        kitaplar.forEach(System.out::println);
        System.out.println("-----------------------");
        kitaplar.forEach(k -> System.out.print(k + ", "));


    }
}
