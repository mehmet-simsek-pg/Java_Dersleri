package gun53.paket2;

public class Main {
    public static void main(String[] args) {

        Arac bmw = new Arac();
        bmw.marka = "BMW";
        bmw.model = 2020;
        Arac.aracSayisi++;

        Arac m = new Arac();
        m.marka = "Mercedes";
        m.model = 2021;
        Arac.aracSayisi++;

        bmw.aracBilgisi();
        m.aracBilgisi();
        System.out.println(Arac.aracSayisi);



    }
}
