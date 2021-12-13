package gun21;

import java.util.Scanner;

public class _05_MethodExample {
    public static void main(String[] args) {
        /*
         Aşağıdaki gibi bir menü çıkartarak kullanicidan sürekli değişkenleri alınız ve
         her bir menü elemanını değer alan bir fonksiyon yazınız.
            1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
         Bir işlem seçiniz
         */

        Scanner scanner = new Scanner(System.in);
        int secim;
        do {
            menuYaz();
            System.out.println("Islem secin");
            secim = scanner.nextInt();
            islemYap(secim);
        }while (secim<6);

    }

    public static void menuYaz() {
        System.out.println("***Menu***");
        System.out.println("1-toplama");
        System.out.println("2-çıkarma");
        System.out.println("3-çarpma");
        System.out.println("4-bolme");
        System.out.println("5-Faktöryel");
        System.out.println("6-Çıkış");
    }

    public static void islemYap(int islem) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        switch (islem) {
            case 1:
                System.out.println("1. sayiyi girin");
                num1 = scanner.nextInt();
                System.out.println("2. sayiyi girin");
                num2 = scanner.nextInt();
                toplam(num1,num2);
                break;
            case 2:
                System.out.println("1. sayiyi girin");
                num1 = scanner.nextInt();
                System.out.println("2. sayiyi girin");
                num2 = scanner.nextInt();
                cikarma(num1,num2);
                break;
            case 3:
                System.out.println("1. sayiyi girin");
                num1 = scanner.nextInt();
                System.out.println("2. sayiyi girin");
                num2 = scanner.nextInt();
                carpma(num1,num2);
                break;
            case 4:
                System.out.println("1. sayiyi girin");
                num1 = scanner.nextInt();
                System.out.println("2. sayiyi girin");
                num2 = scanner.nextInt();
                bolme(num1,num2);
                break;
            case 5:
                System.out.println("Sayi girin");
                num1=scanner.nextInt();
                faktoriyel(num1);
                break;
        }
    }
    public static void toplam(int num1,int num2){
        System.out.println("toplam="+(num1+num2));
    }

    public static void cikarma(int num1, int num2){
        System.out.println("cikarma="+(num1-num2));
    }
    public static void carpma(int num1, int num2){
        System.out.println("carpma="+(num1*num2));
    }
    public static void bolme(int num1, int num2){
        if (num2>0)
        System.out.println("bolme="+(num1/num2));
        else
            System.out.println("Tanimsiz");
    }
    public static void faktoriyel(int num1){

        double faktoriyel=1;
        for (int i = 1; i <= num1; i++) {
            faktoriyel*=i;
        }
        System.out.println("faktoriyel = " + faktoriyel);
    }

}
