package gun9;

import java.util.Scanner;

public class _01IfElseOrnekler {
    public static void main(String[] args) {

        //1.) Ekrandan isminizi girin ve ilk harfin A olup olmadigini kontrol edin.
        //Eger A ise isim a ile basliyor, degilse a ile baslamiyor yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Isminizi girin: ");
        String name = scanner.nextLine();

        char check = name.toLowerCase().charAt(0);
        String check2 = String.valueOf(check);

        if (check2.equals("a")) {
            System.out.println("Isim A harfi ile basliyor");
        } else {
            System.out.println("Isim A harfi ile baslamiyor");
        }

        /*2.) Ekrandan su an ki yili ve dogum tarihinizi girin
         ve yasinizi hesaplayin. Eger yasiniz 18 den buyukse ehliyet alabilirsiniz
         degilse ehliyet alamazsiniz yazdirin.
        */

        System.out.println("Su an ki yili girin");
        int yil = scanner.nextInt();
        System.out.println("dogum tarihinizi girin");
        int dogumYili = scanner.nextInt();

        int yas = yil-dogumYili;

        if (yas>18){
            System.out.println("Ehliyet alabilirsin");
        }
        else {
            System.out.println("Ehliyet alamazsin");
        }

        /*3.) ekrandan girilen takim gs ise ekrana yasa cimbom
         girilen takim fener ise yasa fener
         degilse kapat tv yi yazdirin :)
         */

        System.out.println("Takiminizi girin");
        String takim = scanner.nextLine();

        if (takim.equalsIgnoreCase("Galatasaray")){
            System.out.println("yasa cimbom");
        } else if (takim.equalsIgnoreCase("fenerbahce")){
            System.out.println("yasa fener");
        }
        else {
            System.out.println("kapat tv yi");
        }
    }
}
