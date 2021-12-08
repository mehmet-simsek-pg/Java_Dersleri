package gun18;

import java.util.Scanner;

public class _01_QuestionAndAnswer {
    public static void main(String[] args) {
         /*
        soru1:
        Bir okulda ögretmensiniz. Sinifa 5 yeni ögrenci kaydi yapacaksiniz.
        Ögrencilerin isim ve soyisimlerini kaydedecek bir program yazmaniz istendi.
        Bu ögrencilere seviye belirleme sinavi yaptiniz.
        Aldiklari sonuclar su sekildedir: 56,65,90,96,100
        Bu bilgilere gore ogrencilerin isim soyisim ve notlarini ekrana yazdirin.
        örnek cikti su sekilde olacak:

        ögrenci abdullah sinavdan 80 almistir.
        ögrenci cihat sinavdan 85 almistir.
        ögrenci fatma sinavdan 90 almistir.
        ögrenci harun sinavdan 96 almistir.
        ögrenci yasin sinavdan 100 almistir.
         */

        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        String[] isimSoyisim = new String[5];
        int[] notlar = new int[5]; // {56,65,90,96,100}

        for (int i = 0; i < isimSoyisim.length; i++) {
            System.out.println("ogrenci isim ve soyismi");
            isimSoyisim[i] = scannerStr.nextLine();
            System.out.println("ogrencinin notu");
            notlar[i] = scannerInt.nextInt();
        }

        for (int i = 0; i < isimSoyisim.length; i++) {
            System.out.println("ogrenci " + isimSoyisim[i] + " sinavdan " + notlar[i] + " almistir.");
        }
    }
}
