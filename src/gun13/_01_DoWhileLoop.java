package gun13;

import java.util.Scanner;

public class _01_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan kelime girmesini isteyin.
        kelime icerisinde x gectigi zaman program sonlansin
         */
        /*
        while döngüsünde önce sarti kontrol eder. Eger sart saglaniyorsa döngü icerisine girer.
        do-while döngüsünde tek fark önce islemi yapar sonra
        while icerisindeki sartin saglanip saglanmadigina bakar.
         */

        Scanner scanner = new Scanner(System.in);
        String kelime;

        do {
            System.out.println("Kelime girin");
            kelime = scanner.nextLine();
        } while (!kelime.contains("x"));
        // kelime icerisinde x olmadigi sürece devam et

        {
            //cevap 1
            int a =2;
            // scope {} iki süslü parantez icerisine yazilanlar
            // sadece bu kisimda kullanilabilir

        }

        {
            //cevap 2
            int a = 2;
        }

    }
}
