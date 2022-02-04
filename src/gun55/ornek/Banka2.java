package gun55.ornek;

public class Banka2 extends Banka implements IFinans{
    int subeSayisi;
    double faizOrani;

    public Banka2(String isim, BankaTuru turu, double kasaToplami, int subeSayisi, double faizOrani) {
        super(isim, turu, kasaToplami);
        this.subeSayisi = subeSayisi;
        this.faizOrani = faizOrani;
    }


    @Override
    void faizEkle() {
        kasaToplami *= (1+faizOrani);

    }

    @Override
    public void paraYatir(double miktar) {
        kasaToplami += miktar;
        kasaToplami *= 0.02;
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
        System.out.println("B2:" + isim + ", " + turu);
    }
}
