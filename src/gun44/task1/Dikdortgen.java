package gun44.task1;

public class Dikdortgen extends Sekil{
    private double uzunluk;
    private double genislik;


    public Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    protected double alanHesapla() {
        return uzunluk * genislik;
    }

    @Override
    protected double cevreHesapla() {
        return 2*(uzunluk + genislik);
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "uzunluk=" + uzunluk +
                ", genislik=" + genislik +
                '}';
    }
}
