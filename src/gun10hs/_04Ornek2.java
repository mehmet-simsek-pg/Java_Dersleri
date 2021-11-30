package gun10hs;

import java.util.Scanner;

public class _04Ornek2 {
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


        System.out.print("Park süresi (saat) : ");
        saat = sc.nextInt();
        sc.nextLine();
        System.out.print("Indirim karti var mi? ('Y', 'N') : ");
        indirimKarti = sc.nextLine();

        double fiyat;  // altta veri atanacagi icin ilk deger atamayabiliriz
        if (saat <= 2){
            fiyat = 5;
        }else if (saat <=5){
            fiyat = 10;
        }else {
            fiyat = 15;
        }

        // indirim uygulaniyor
        if (indirimKarti.equalsIgnoreCase("Y"))
            fiyat = fiyat * 0.8;    // fiyat *= 0.8;

        System.out.println("Borcunuz : " + fiyat);
    }
}
