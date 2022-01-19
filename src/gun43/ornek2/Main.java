package gun43.ornek2;

public class Main {
    /*
         Sekil
                (cevre, alan = throws new RuntimeError)
            Cember(cevre = 2*Math.PI*Yaricap)
                fields : yaricap
                Daire (cevre = 2*Math.PI*Yaricap, alan = Math.PI*yaricap*yaricap)

            Dikdortgen (cevre = 2*(uzunluk+genislik), alan = uzunluk*genislik)
                fields : uzunluk ve genislik
                Kare (cevre = 4*uzunluk, alan = uzunluk*uzunluk)
                (fields : uzunluk, Parent§dan kullanabilir)

          Cember extends Sekil
            Daire extends Cember

         Dikdortgen extends Sekil
         Kare extends Dikdortgen

         constructor"lari, alan ve cevre hesaplama metdlari, olmayanlar icin hara throw edilecek
         toString methodlari
         hangi class"in nasil bir degiskene ihtiyaci var, belirleyin


     */
}

class Sekil{

    public double alanHesapla(){
        throw new RuntimeException("Belirsiz seklin alani hesaplanamaz");
    }

}

class Dikdortgen extends Sekil{
    double uzunluk, genislik;

    public Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    public double alanHesapla(){
        return uzunluk*genislik;
    }

}

class Kare extends Dikdortgen{

    public Kare(double uzunluk) {
        super(uzunluk, uzunluk);
    }

}