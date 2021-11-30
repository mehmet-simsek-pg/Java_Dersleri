package gun11;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tam sayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("islem = 'b','t','c','p' ");
        String dortIslem = scanner.nextLine();

        if (dortIslem.equalsIgnoreCase("b"))  {
            if (sayi2==0){
                System.out.println("tanimsiz islem");
            }
            else {
                System.out.println("bölme="+(sayi1/sayi2));
            }
        } else if (dortIslem.equalsIgnoreCase("c")) {
            System.out.println("cikarma="+(sayi1-sayi2));
        } else if (dortIslem.equalsIgnoreCase("t")) {
            System.out.println("toplam="+(sayi1 +sayi2));
        } else if (dortIslem.equalsIgnoreCase("p")) {
            System.out.println("carpma="+(sayi1 * sayi2));
        }
        else {
            System.out.println("gecersiz islem");
        }


    }
}
