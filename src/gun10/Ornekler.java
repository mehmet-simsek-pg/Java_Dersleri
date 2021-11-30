package gun10;

import java.util.Scanner;

public class Ornekler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        kullanicidan yan yana aralarinda bir bosluk olacak
        sekilde 2 tamsayi isteyin. bu sayilarin tek mi cift mi oldugunu kontrol edin
*/

        System.out.println("yan yana aralarinda bir bosluk olacak\n " +
                "        sekilde 2 tamsayi yazin");

        String sayilar = scanner.nextLine();
        System.out.println(sayilar);

        int bosluk = sayilar.indexOf(" ");
        String sayi1 = sayilar.substring(0, bosluk);
        String sayi2 = sayilar.substring(bosluk + 1);

        int sayi1Int = Integer.parseInt(sayi1);
        System.out.println(sayi1Int);
        int sayi2Int = Integer.parseInt(sayi2);
        System.out.println(sayi2Int);

        if (sayi1Int % 2 == 0) {
            System.out.println("1. sayi cifttir");
        } else {
            System.out.println("1. sayi tektir");
        }

        if (sayi2Int % 2 == 0) {
            System.out.println("2. sayi cifttir");
        } else {
            System.out.println("2. sayi tektir");
        }


        /*
        Kullanicidan bir sifre girmesini isteyin.
        Sifre belli sartlari saglamasi gerekiyor

        1. en az 6 karakter olmali
        2. icinde pass ya da sifre gecmemeli
        3. en fazla 12 karakter olmali

        girilen sifre bu kurallara uyuyorsa ekrana sifre basarili
        degilse sifre basarisiz yazdirin.
         */

        System.out.println("Sifre girin");
        String pass = scanner.nextLine();

        boolean ilkDeger = pass.contains("pass");
        boolean ikinciDeger = pass.contains("sifre");

        if (pass.length() >= 6
                && !(ilkDeger || ikinciDeger)
                && pass.length() <= 12) {
            /*
            boolean kontrollerinde ornegin
            boolean sonuc1 = 5==4 yani 5 4'e esit mi
            ya da 5!=4 5 4'e esit degil mi sorusunun cevabini aliriz
            Bu durum sadece sayisal ifadelerde degil boolean sonuc veren
            her sey icin kullanilir. Ornegin
            boolean sonuc2 = "java".contains("j") java kelimesi icinde j var degil mi
            ya da !"java".contains("c") java kelimesi icinde c yok degil mi sorusunun
            cevabini aliriz.
             */
            System.out.println("sifre basarili");
        } else {
            System.out.println("sifre basarisiz");
        }

        /*
        Kullanicidan ders ve aldigi notu alin. Mat: 90 seklinde
        >= 90 icin A
        >= 80 icin B
        >= 70 icin C
        >= 60 icin D
        >= 50 icin E
        <  50 icin F ekrana yazdirin
         */

        System.out.println("Ders ve notu girin. Orn: Mat: 90");
        String dersVeNot = scanner.nextLine();

        int boslukIndex = dersVeNot.indexOf(" ");
        String notStr = dersVeNot.substring(boslukIndex+1);

        int not = Integer.parseInt(notStr);

        if (not >= 90){
            System.out.println("A");
        }
        else if (not>=80){
            System.out.println("B");
        }
        else if (not>=70){
            System.out.println("C");
        }
        else if (not>=60){
            System.out.println("D");
        }
        else if (not>=50){
            System.out.println("E");
        }
        else {
            System.out.println("Kaldin tebrikler");
        }

    }
}
