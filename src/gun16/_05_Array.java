package gun16;

import java.util.Scanner;

public class _05_Array {
    public static void main(String[] args) {

        /*
        Kullanicidan 5 tane pozitif tam sayi girmesini isteyin.
        Bu sayilari bir diziye atin. Bu sayilardan en büyügünü ekrana yazdirin.
         */

        Scanner scanner = new Scanner(System.in);

        int enb = 0;
        int[] dizi = new int[6];

        for (int index = 0; index < dizi.length; index++) {
            System.out.println("sayi girin");
            dizi[index] = scanner.nextInt();

            if (dizi[index]>enb){
                enb = dizi[index];
            }
        }
        System.out.println("enb = " + enb);


        /*
         int enb2 = Math.max(dizi[0],Math.max(dizi[1],dizi[2]));
        System.out.println("enb2 = " + enb2);
         */

    }
}
