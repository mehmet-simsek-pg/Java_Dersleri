package gun6;

import java.util.Scanner;

public class _01ScannerOrnekler {
    public static void main(String[] args) {
        //1.) ekrandan 2 kelimelik bir yazi yazin.

        Scanner scanner = new Scanner(System.in);
/*
        System.out.println("2 kelime girin");
        String cümle = scanner.nextLine();
        System.out.println(cümle);

        //2.) ekrandan girdiginiz bu iki kelimenin
        // yerlerini degistirip ekrana yazdirin

        int bosluk = cümle.indexOf(" ");
        String ilkKelime = cümle.substring(0,bosluk);
        String ikinciKelime = cümle.substring(bosluk+1);

        System.out.println(ikinciKelime+" "+ilkKelime);
*/
        //3.) Diktörtgenin kisa ve uzun kenarlarini
        //ekrandan alip, cevresini bulun.

        System.out.println("Uzun kenar");
        int kisaKenar = scanner.nextInt();
        System.out.println("Kisa kenar");
        int uzunKenar = scanner.nextInt();
        int cevre = 2*(kisaKenar+uzunKenar);

        System.out.println("cevre = " + cevre);

        //4.) Su an ki yili ve dogum tarihinizi ekrandan
        // alip yasinizi hesaplayin.

        System.out.println("Su an ki yil");
        int yil = scanner.nextInt();
        System.out.println("Dogum yili");
        int dogumYili = scanner.nextInt();

        int yas = yil-dogumYili;
        System.out.println("yas = " + yas);



    }
}
