package gun46.interface2;

public class Daire extends Cember{

    public Daire(double yaricap) {
        super(yaricap);
    }

    @Override
    public double alanHesapla() {
        return PI*yaricap*yaricap;
    }

    @Override
    public String toString() {
        return "Daire{" +
                "yaricap=" + yaricap +
                ", cevre=" + cevreHesapla() +
                ", alan=" + alanHesapla() +
                '}';
    }
}
