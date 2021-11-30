package gun11;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        /*
        Kullanicidan 1-9 arasi bir tam sayi girmesini isteyin. 0-10 arasi bir random sayi
        tanimlayin. Eger kullanicinin girdigi sayi ile random sayi esit ise
        ekrana tebrikler yazdirin. Eger cevap yanlis ise maalesef kaybettiniz yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("1-9 arasi bir tam sayi girin");
        int sayi = scanner.nextInt();

        int random = (int)(Math.random()*10);

        if (sayi==random){
            System.out.println("Tebrikler");
        }
        else{
            System.out.println("Kaybettiniz");
        }


    }
}
