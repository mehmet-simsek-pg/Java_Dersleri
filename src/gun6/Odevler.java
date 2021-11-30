package gun6;

public class Odevler {
    public static void main(String[] args) {
        String str = "nasılsınız?";
        char ilkHarf = str.charAt(0);
        char sonHarf = str.charAt(str.length() - 1);
        // System.out.println(ilkHarf+""+sonHarf);

        int a = 5;
        int b = 10;
        String aStr = "mehmet";
        // System.out.println(aStr+(a+b));

        /*
        hocam bir string in ilk orta ve son karakterini char olarak tanımlıyorum.
        daha sonra bu tanımlama üzerinden index buluyorum.sonra indexleri
        toplarken hata oluyor.
        mesela son char "k" ve indexi 45.
        toplama yaparken daha önce bir k varsa onun indexini alıyor
        ve yanlış çıkıyor.nasıl yapabilirim.oysa ki tanımlama yaparken harf olarak değil
        length-1 olarak tanımladım ama yine ilk k nin indexini aldı.
         */

        String sStr = "Bugün günlerden pazartesi";

        char ilk = sStr.charAt(0);
        char orta = sStr.charAt(sStr.length()/2);
        char son = sStr.charAt(sStr.length()-1);

        int ilkIndex = 0;
        int ortaIndex = sStr.length()/2;
        int sonIndex = sStr.length()-1;

        //System.out.println(ilkIndex+ortaIndex+sonIndex);
        //System.out.println(ilk+""+orta+""+son);

       /*
       7.  Girilen metnin ilk yarısı ile ikinci yarısının yerlerini değiştirerek
        // yeni bir string oluşturup ekrana yazınız
        //String str = “Java nasıl”;                Çıktı : nasılJava
        //String str = “telekominikasyon”;        Çıktı : nikasyontelekomi
*/
        String soru7 = "Java güzel";
        int orta7 = soru7.indexOf(" ");
        String ilkKisim = soru7.substring(0,orta7);
        String ikinciKisim = soru7.substring(orta7+1);
       // System.out.println(ikinciKisim+" "+ilkKisim);

        /*
           6. Girilen metnin ilk ve son harflerinin yerlerini değiştirip
            yeni bir string oluşturup ekrana yazınız
        //String str = “Java”;
        */

        String soru6 = "Java";

        char j = soru6.charAt(0);
        char asoru6 = soru6.charAt(soru6.length()-1);
        String ortaDeger = soru6.substring(1,soru6.length()-1);
        System.out.println(asoru6+ortaDeger+j);







    }
}
