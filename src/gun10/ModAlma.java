package gun10;

import java.util.Scanner;

public class ModAlma {
    public static void main(String[] args) {

        int sayi1 = 11;
        int modHali = sayi1 % 10;
        /*
        bir sayinin modunu almak icin bolme islemi yapilir
        ve sonuc kalan degerdir.
         */

        // System.out.println("modHali = " + modHali);


        int sayi2 = 2;
        int modHali2 = sayi2 % 10;
        /*
        eger modu alinacak sayi mod degerinden kucukse kendisini verir.
         */
        // System.out.println("modHali2 = " + modHali2);
        Scanner scanner = new Scanner(System.in);



        /*
        kullanicidan 3 haneli bir sayi girmesini isteyin
        ve sayinin birler basamagini bulun
*/
        System.out.println("3 basamakli bir sayi girin");
        int num = scanner.nextInt();

        int birlerBasamagi = num % 10;
        System.out.println("birlerBasamagi = " + birlerBasamagi);

        /*
       kullanicidan 3 haneli bir sayi girmesini isteyin
        ve sayinin onlar basamagini bulun
*/
        System.out.println("3 basamakli bir sayi girin");
        int num2 = scanner.nextInt();

        int onlarBasamagi = (num2 / 10) % 10;
        System.out.println("onlarBasamagi = " + onlarBasamagi);


        /*
        kullanicidan 3 haneli bir sayi girmesini isteyin
        ve sayinin yüzler basamagini bulun
         */
        System.out.println("3 basamakli bir sayi girin");
        int num3 = scanner.nextInt();

        int yuzlerBasamagi = (num3 / 100) % 10;
        System.out.println("yuzlerBasamagi = " + yuzlerBasamagi);

        /*
        kullanicidan bir sayi girmesini isteyin
        eger sayi cift ise ekrana cift
        tek ise ekrana tek yazdirin
         */

        System.out.println("Bir tam sayi girin");
        int tekVeyaCift = scanner.nextInt();

        if (tekVeyaCift % 2 == 0) {
            System.out.println("sayi cifttir");
        } else {
            System.out.println("sayi tektir");
        }

    }
}
