package gun14;

import java.util.Scanner;

public class _05_ForLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan icinde a ve c de olacak sekilde bir kelime girmesini isteyin.
        Kelime icerisindeki a harflerinin sayisini bulun.
        c harfi görünce program sonlansin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("icinde a ve c de olacak sekilde bir kelime girin");
        String kelime = scanner.nextLine();
        int aSayisi = 0;

        for (int i = 0; i < kelime.length(); i++) {

            if (kelime.toLowerCase().charAt(i)=='a'){
                aSayisi++;
            } else if (kelime.toLowerCase().charAt(i)=='c'){
                break;
            }
        }
        System.out.println("aSayisi = " + aSayisi);

        }
}
