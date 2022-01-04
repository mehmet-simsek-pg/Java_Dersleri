package gun31.paket1;


public class Kitap {
    String adi;
    int basimYili;
    int sayfaSayisi;

    static int kitapSayisi;

    public void kitapTanimla(String adi, int basimYili, int sayfaSayisi){
        this.adi = adi;
        this.basimYili = basimYili;
        this.sayfaSayisi = sayfaSayisi;
        kitapSayisi++;
        //Kitap.kitapSayisi++;
        //System.out.println("Adi : " + adi + "Basim Yili : " + basimYili + "Sayfa Sayisi : " + sayfaSayisi);
    }

    public void getKitapBilgisi(){
        System.out.println("Adi : " + adi + "\nBasim Yili : " + basimYili + "\nSayfa Sayisi : " + sayfaSayisi);
        /*  System.out.println("Adi : " + adi);
            System.out.println("Basim Yili : " + basimYili);
            System.out.println("Sayfa Sayisi : " + sayfaSayisi);
         */

    }

    public static void kitapSayisiYaz(){
        System.out.println("Toplam Kitap Sayisi : " + kitapSayisi);
    }

}
