package gun46.interface2;

public class Kare extends Dikdortgen{

    public Kare(double uzunluk) {
        super(uzunluk, uzunluk);
    }

    @Override
    public String toString() {
        return "Kare{" +
                "kenar=" + uzunluk +
                ", alan=" + alanHesapla() +
                ", cevre=" + cevreHesapla() +
                '}';
    }
}
