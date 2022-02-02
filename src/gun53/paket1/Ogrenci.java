package gun53.paket1;

public class Ogrenci {
    // statikler classa aittir. Class ismi ile ulasilir
    // class variables
    static String okul = "Okul adi";

    // static olmayannlar nesneye aittir
    // instance (nesne) variables
    String isim;
    int numara;
    int[] notlar = new int[10];

    // statik tanimlilar class"a aittir ve bir tanedir


    // class"in methodudur
    public static void okulIsmi(){
        System.out.println(okul);
    }

    // nesnenin methodudur
    public void ogrenciAdi(){
        System.out.println(okul + ", " + isim);
    }

}
