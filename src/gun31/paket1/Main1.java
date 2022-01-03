package gun31.paket1;

public class Main1 {

    /*
        Bir Kitap Class"i tanimlayin
        Instance vars
            adi,
            basimYili
            sayfaSayisi
        Instance Method
            kitapTanimla() ile kitabin instance vars"lari atayalim
            getKitapBilgisi() ile kitap bilgisini ekrana yazdiralim

        Class vars
            kitapSayisi
        Class method
            kitapSayisiYaz();

        Main1 class"inda da 3 kitap olusturup
        kitap bilgilerini ve kitapSayisiYaz() ile toplam kitap sayisini yazdiralim

     */

    public static void main(String[] args) {
        Kitap kitap1 = new Kitap();
        kitap1.kitapTanimla("Cali Kusu", 1954, 234);

        Kitap kitap2 = new Kitap();
        kitap2.kitapTanimla("Sefiller", 1865, 345);

        Kitap kitap3 = new Kitap();
        kitap3.kitapTanimla("Sinekli Bakkal", 1930, 290);
        /*
            kitap3.adi  ="";
            kitap3.basimYili = 12;
            kitap3.sayfaSayisi = 1;
         */

        kitap1.getKitapBilgisi();
        kitap2.getKitapBilgisi();
        kitap3.getKitapBilgisi();

        Kitap.kitapSayisiYaz();     // normal cagrilma yontemi
        kitap1.kitapSayisiYaz();    // statik olanlarin nesne ismi altinda cagrilmasi hata vermez
        kitap2.kitapSayisiYaz();
        kitap3.kitapSayisiYaz();
        kitap1 = null;
        //kitap1.getKitapBilgisi(); // hata verir
        kitap1.kitapSayisiYaz();

    }

}
