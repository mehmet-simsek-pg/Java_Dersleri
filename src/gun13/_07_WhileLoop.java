package gun13;

import java.util.Scanner;

public class _07_WhileLoop {
    public static void main(String[] args) {
        /*
        0-100 arasi Random bir sayi olusturun. Kullaniya 5 hak verin.
        Eger dogru tahmin ederse Tebrikler yazdirin. 5 kerede de bilemezse
        oyunu kaybettiniz yazdirin.
         */

        Scanner scanner = new Scanner(System.in);

        int random = (int) (Math.random()*100);
        /*
        Math.random() sonucu double deger üretiyor. Ama bana tam sayi kismi lazim oldugu
        icin basina (int) deyip tip dönüsümü yapiyoruz.
         */

        int sayac = 0;

        while (sayac<5){
            System.out.println("Sayi girin");
            int num = scanner.nextInt();

            if (num==random){
                System.out.println("Tebrikler");
                break; // sayi dogru tahmin edilirse break döngüyü kirar ve program sonlanir
            } else if (sayac==4){ // 5. sayida da bilemediginde kaybettiniz yazdirmasi icin bu satir var
                System.out.println("random = " + random);
                System.out.println("Kaybettiniz");
                // else olsaydi sadece her bilemediginde kaybettiniz yazardi
            }
            sayac++;
        }
    }
}
