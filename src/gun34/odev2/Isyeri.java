package gun34.odev2;

import java.util.HashSet;

public class Isyeri {

    String adi;
    HashSet<Isci> calisanlar = new HashSet<>();

    // adi ile Isci olusturan constructor
    public Isyeri(String adi) {
        this.adi = adi;
    }

    /**
     * isyerie iscileri atayan method, Main'de oldugu gibi statik method olarak da tanimlanabilir
     * @param isciler, isciler varargs olarak geliyor
     */
    public void setCalisan(Isci...isciler){
        for (Isci isci : isciler) {
            calisanlar.add(isci);
            calisanlar.add(isci.grupArkadasi);
        }
    }

    /**
     * grupArkadasi atayan method, iki isci gelince onlari birbirlerine grupArkadasi atiyor.
     * Ancak burada degil Isci class'i icinde yapilmasi daha uygun
     * @param i1, 1. isci
     * @param i2, 2. isci
     */
    public void setGrupArkadasi(Isci i1, Isci i2){
        i1.grupArkadasi.grupArkadasi = null;
        i1.grupArkadasi = i2;
        i2.grupArkadasi = i1;
    }

    @Override
    public String toString() {
        return "Isyeri{" +
                "adi='" + adi + '\'' +
                ", calisanlar=" + calisanlar +
                '}';
    }
}
