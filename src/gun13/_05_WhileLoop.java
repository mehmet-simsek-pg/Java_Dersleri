package gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane pozitif tam sayi alin.
        Bu sayilardan en kücügünü ekrana yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi girin");
        int enk = scanner.nextInt();
        int count = 0;

        while (count < 4) {
            System.out.println("sayi girin");
            int num = scanner.nextInt();
            if (num < enk) {
                enk = num;
            }
            count++;
        }
        System.out.println("enk = " + enk);


    }
}
