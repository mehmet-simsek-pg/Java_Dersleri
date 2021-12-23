package gun29.task1;

public class Main {

    public static void main(String[] args) {

        Kitap kitap1 = new Kitap();
        kitap1.adi = "Monsters";
        kitap1.sayfaSayisi = 219;
        kitap1.basimYili = 2001;

        Kitap kitap2 = new Kitap();
        kitap2.adi = "Calikusu";
        kitap2.sayfaSayisi = 123;
        kitap2.basimYili = 1954;

        kitap1.bilgileriniYaz();
        kitap2.bilgileriniYaz();
        System.out.println("-------------------");
        kitapAdi(kitap1);
        System.out.println("---------------");
        kitapAdiText(kitap1.adi);

    }

    public static void kitapAdi(Kitap kitap){
        System.out.println("Adi : " + kitap.adi +
                "\nBasim Yili : " + kitap.basimYili +
                "\nSayfa Sayisi : " + kitap.sayfaSayisi);
    }

    public static void kitapAdiText(String text){
        System.out.println("Kitabin adi :" + text);
    }


    public static void kitapAdiText(int num){
        System.out.println("Kitabin adi :" + num);
    }

}
