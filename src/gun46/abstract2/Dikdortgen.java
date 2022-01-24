package gun46.abstract2;

public class Dikdortgen extends Sekil {
    double uzunluk, genislik;

    public Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    public double cevreHesapla() {
        return 2*(uzunluk + genislik);
    }

    @Override
    public double alanHesapla() {
        return uzunluk*genislik;
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "uzunluk=" + uzunluk +
                ", genislik=" + genislik +
                ", alan=" + alanHesapla() +
                ", cevre=" + cevreHesapla() +
                '}';
    }
}
