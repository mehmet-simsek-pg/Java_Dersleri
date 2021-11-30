package gun8;

import java.util.Scanner;

public class Ornekler {
    public static void main(String[] args) {

        //1.) ekrandan dogum tarihinizi yil olarak ve su an ki yili  girin.
        // Yasinizi hesaplayin. (Not: ekrandan girisde harf yazmaya izin vermeyin)

        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Dogum tarihini gir");
        int dogumTarihi = scanner.nextInt();
        System.out.println("su an ki yili girin");
        int yil = scanner.nextInt();

        int yas = yil-dogumTarihi;
        System.out.println("yas = " + yas);


        //2.) Ekrandan isim ve soyisminizi tek satirda girin.
        // Ismininizin tum harflerini kucultun.
        // Soyisminizin sadece ilk harfini kucultup diger harflerini buyultun.

        System.out.println("Isim ve soyisminizi girin");
        String isimVeSoyisim = scanner.nextLine();
        int boslukIndex = isimVeSoyisim.indexOf(" ");
        String isim = isimVeSoyisim.substring(0,boslukIndex);
        String soyIsim = isimVeSoyisim.substring(boslukIndex+1);

        String isimYeni = isim.toLowerCase(Locale.ROOT);
        String ilkHarf = soyIsim.substring(0,1).toLowerCase(Locale.ROOT);
        String soyisimDigerHarfler = soyIsim.substring(1).toUpperCase(Locale.ROOT);
        String soyisimYeni = ilkHarf.concat(soyisimDigerHarfler);

        System.out.println(isimYeni+" "+soyisimYeni);
*/
        //3.) Ekrandan cemberin yaricapini alip, cemberin cevresini hesaplayin.
        // pi=3.14 formül = 2*pi*yaricap
        // cemberin cevresi karenin bir kenarina esittir.
        // Bu bilgiye gore karenin alanini hesaplayin sonuc tam sayi olmalidir.

        System.out.println("Cemberin yaricapini girin");
        int yariCap = scanner.nextInt();

        double pi = 3.14;
        double cemberCevresi = 2*pi*yariCap;
        double kareKenari = cemberCevresi;
        int sonuc = (int) (kareKenari*kareKenari);
        System.out.println("sonuc = " + sonuc);


    }
}
