package gun13;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        /*
        Kullanicidan isim girmesini isteyin ve kac isim girmesini
        istedigini sorun. kac isimin bas harfi A ile basliyor bunu bulun.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("kac isim girmek istiyorsunuz");
        int isimSayisi = scanner.nextInt();
        int sayac = 0;
        int toplamKacTane = 0;
        scanner.nextLine();

        while (sayac < isimSayisi) {
            System.out.println("isim girin");
            String isim = scanner.nextLine();
            if (isim.startsWith("A")) {
                toplamKacTane++;
            }
            sayac++;
        }
        System.out.println("toplamKacTane = " + toplamKacTane);
    }
}
