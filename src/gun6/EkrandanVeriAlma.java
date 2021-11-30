package gun6;

import java.util.Scanner;

public class EkrandanVeriAlma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String isim = sc.next();
        System.out.println("Isminiz: "+isim);


        System.out.println("Bir cumle yazin");
        String cümle =sc.nextLine();
        System.out.println(cümle);

        /*
        System.out.println("1. sayi=");
        int a =sc.nextInt();
        System.out.println("2. sayi");
        int b = sc.nextInt();

        System.out.println("toplam="+(a+b));

        System.out.println("Dikdörtgenin ilk kenari");
        double a =sc.nextDouble();
        System.out.println("Dikdörtgenin ikinci kenari");
        double b = sc.nextDouble();

        System.out.println("Dikdörtgenin alani:"+(a*b));

        short s = sc.nextShort();
        byte bByte = sc.nextByte();
        float f = sc.nextFloat();
        long l = sc.nextLong();
*/
    }
}
