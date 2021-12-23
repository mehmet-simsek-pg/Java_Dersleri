package gun29.task1;

public class Kitap {
    // instance vars
    String adi;
    int basimYili;
    int sayfaSayisi;
    int a;

    public void bilgileriniYaz(){
        int a = 2;  // local degisken
        this.a = 3; // this kelimesi class nesnesini ifade eder
        String adi="";

        System.out.println(
                         "Adi : " + this.adi +
                        "\nBasim Yili : " + basimYili +
                        "\nSayfa Sayisi : " + sayfaSayisi
        );
    }



}
