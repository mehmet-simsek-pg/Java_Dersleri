package gun15;

import java.util.Scanner;

public class _02_Continue {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 pozitif tam sayi girmesini isteyin.
        Bu sayilardan 5 ile 10 arasindakiler haric, digerlerinin toplamini bulun.
        Bu soruda continue kullanin.
         */

        Scanner scanner = new Scanner(System.in);

        int toplam = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("sayi girin");
            int num = scanner.nextInt();

            if (num>5 && num<10){
                continue;
            }
            toplam+=num;
        }
        System.out.println("toplam = " + toplam);
    }
}
