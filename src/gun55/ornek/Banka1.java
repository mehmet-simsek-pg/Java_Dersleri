package gun55.ornek;

public class Banka1 extends Banka implements IFinans{
    String adres;
    double faizOrani;

    public Banka1(String isim, BankaTuru turu, double kasaToplami, String adres, double faizOrani) {
        super(isim, turu, kasaToplami);
        this.adres = adres;
        this.faizOrani = faizOrani;
    }


    @Override
    void faizEkle() {
        kasaToplami *= (1+faizOrani);
    }

    @Override
    public void paraYatir(double miktar) {
        kasaToplami += miktar;
        kasaToplami *= 0.01;
    }

    @Override
    public void paraCek(double miktar) {
        kasaToplami -= miktar;
    }

    @Override
    public double kasaToplami() {
        return kasaToplami;
    }

    @Override
    public void bankaBilgisi() {
        System.out.println("B1:" + isim + ", " + turu + ", " + kasaToplami);
    }
}
