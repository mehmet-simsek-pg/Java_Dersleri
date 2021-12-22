package gun27.task2;

import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Ogrenci[] ogrenciler = new Ogrenci[10];
        // 10 tane ögrenci olusturdu

        int uzunluk = ogrenciler.length;
        // dizi de kac eleman olacaginin belirtir
        System.out.println("uzunluk = " + uzunluk);

        //1. yol
        for (int i = 0; i < ogrenciler.length; i++) {

            Ogrenci ogrenci = new Ogrenci();

            System.out.println("ögrenci ismi");
            ogrenci.isim = scanner.nextLine();
            System.out.println("ögrenci soy ismi");
            ogrenci.soyIsmi = scanner.nextLine();

            ogrenciler[i] = ogrenci;
            // ogrenciler dizisine bilgileri girilmis ogrenciyi ekledik

        }

        //2. yol
        for (int i = 0; i < ogrenciler.length; i++) {

            Ogrenci ogrenci = new Ogrenci();
            ogrenciler[i] = ogrenci;
            // ogrenciler dizisine bilgileri girilmemis ogrenci nesnesini ekledik

            System.out.println("ögrenci ismi");
            ogrenciler[i].isim = scanner.nextLine();
            System.out.println("ögrenci soy ismi");
            ogrenciler[i].soyIsmi = scanner.nextLine();

        }
    }
}
