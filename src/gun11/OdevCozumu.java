package gun11;

import java.util.Scanner;

public class OdevCozumu {
    public static void main(String[] args) {
        /*
        4.
        Kullanicinin Consoldan harf, karakter ve sayi karisik iceren metnin harf
        ve sayilarini ayirin, sayiyi integera cevirin
        Örnek :       Girdi --> a2ja4va
                    Cikti --> ajava,    24
         */

        /*
        3.    Girilen farkli aralikli kelimeleri düzenleyip tek aralikli hale getirin
        Örnek :   Girdi -->  "Java      kursu  basladi mi"
         */

        Scanner scanner = new Scanner(System.in);
/*


        System.out.println("Bir cümle yazin icerisinde sayi da olabilir");
        String cumle =scanner.nextLine();

        String duzenliCumleHarfler = cumle.replaceAll("[^a-z]","");
        String rakamlar =cumle.replaceAll("[^0-9]","");

        int sayi=Integer.parseInt(rakamlar);

        System.out.println(duzenliCumleHarfler+" "+sayi);
        System.out.println("Aralarinda birden fazla bosluk olacak sekilde cümle yazin");
        String cümle2 =scanner.nextLine();

        String duzenlenmis = cümle2.replaceAll("[ ]+"," ");
        //birden fazla bosluk varsa onu tek bosluga cevir( [ ]+, " "   )
        System.out.println(duzenlenmis);
 */
        System.out.println("saniye girin");
        int saniye = scanner.nextInt();
/*
        int sn = saniye%60;
        int saat = saniye/60;
        int dakika = saat%60;
        saat = saat / 60;
*/
        int saat = saniye/3600;
        int kalanZaman = saniye%3600;
        int dakika = kalanZaman/60;
        int sn = kalanZaman%60;

        System.out.println(saat+":"+dakika+":"+sn);
    }
}
