package gun17;

import java.util.Scanner;

public class _03_ArrayExample {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane sayi girmesini isteyin.
        Bu sayilardan yüzler basamagi en büyük olan sayiyi bulun.
         */

        Scanner scanner = new Scanner(System.in);
        int[] sayilar = new int[5];

        int enb = 0;
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("sayi girin");
            sayilar[i] = scanner.nextInt();
        }

        for (int sayi : sayilar){
            int yüzler = (sayi/100)%10;
            if (yüzler>enb){
                enb=yüzler;
            }
        }
        System.out.println("enb = " + enb);
    }
}
