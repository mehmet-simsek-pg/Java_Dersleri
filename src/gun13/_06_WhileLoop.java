package gun13;

import java.util.Scanner;

public class _06_WhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan 5 tane kelime girmesini isteyin.
        Bu kelimeler  icerisinde a olan kac tane kelime oldugunu yazdirin.
         */

        Scanner scanner = new Scanner(System.in);

        int kacTane = 0;
        int i = 0;

        while (i<5){
            System.out.println("Kelime girin");
            String name = scanner.nextLine();

            if (name.contains("a")){
                kacTane++; // icinde a gecen kelime sayisi icin
            }
            i++; // döngü icin degisken
        }
        System.out.println("icinde a gecen toplam kelime sayisi="+kacTane);
    }
}
