package gun12;

import java.util.Scanner;

public class _04_SwitchCase {
    public static void main(String[] args) {
        /*
        Kullanicidan 2 tamsayi alin.
        Yine kullanicidan yapmak istedigi islemi alip islemleri yaptirin
        Toplama icin t, cikarma icin c, Carpma icin p, bölme icin b olacak
        Bu soruyu switch-case ile yapin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayiyi girin");
        int sayi1 = scanner.nextInt();
        System.out.println("2. sayiyi girin");
        int sayi2 = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Bir islem secin\nToplama icin t" +
                "\ncikarma icin c\ncarpma icin p\nbolme icin b");
        String islem =scanner.nextLine();

        switch (islem){
            case "t":
                System.out.println("toplam="+(sayi1+sayi2));
                break;
            case "c":
                System.out.println("cikarma="+(sayi1-sayi2));
                break;
            case "p":
                System.out.println("Carpma="+(sayi1*sayi2));
                break;
            case "b":
                if (sayi2!=0){
                    System.out.println("bolme="+(sayi1/sayi2));
                }
                else {
                    System.out.println("tanimsiz");
                }
                break;
            default:
                System.out.println("gecersiz islem");
        }
    }
}
