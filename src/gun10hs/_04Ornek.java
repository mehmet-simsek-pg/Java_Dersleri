package gun10hs;

import java.util.Scanner;

public class _04Ornek {
    /*
        Bir otopark ücret hesapalama programı yapılma isteniyor.
        0-2 saat ara 5€,
        2-5 arası 10€ ,
        5 saatten sonra 15€ olarak saat girildiğinde ücreti yazdırınız.
        Indirim karti varsa %20 indirim yapin
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int saat;
        String indirimKarti;


        // eger tek Scanner nesnesi ile önce sayi, pesine String okutulacak ise (sc.nextLine)
        // int okututulduktan sonra satirin enter kisimin okunmasi inin bos bir sc.nextLine() eklenir.
        // aksi takdirde okunmasi gereken text metin okunmadan atlanir
        // önce String sonra sayi okunacak ise buna gerek yok
        // ya da int ve String farkli Scannerlar ile okunabilir.

        System.out.print("Park süresi (saat) : ");
        saat = sc.nextInt();
        sc.nextLine();
        System.out.print("Indirim karti var mi? ('Y', 'N') : ");
        indirimKarti = sc.nextLine();

        double fiyat = 0;
        if (saat <= 2){
            if (indirimKarti.toUpperCase().equals("Y"))
                fiyat = 5 * 0.8;
            else
                fiyat = 5;
        }else if (saat <=5){
            if (indirimKarti.equalsIgnoreCase("Y"))
                fiyat = 10 * 0.8;
            else
                fiyat = 10;
        }else {
            if (indirimKarti.equalsIgnoreCase("Y"))
                fiyat = 15 * 0.8;
            else
                fiyat = 15;
        }
        System.out.println("Borcunuz : " + fiyat);
    }
}
