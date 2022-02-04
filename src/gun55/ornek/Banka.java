package gun55.ornek;

public abstract class Banka {
    String isim;
    BankaTuru turu;
    double kasaToplami;

    public Banka(String isim, BankaTuru turu, double kasaToplami) {
        this.isim = isim;
        this.turu = turu;
        this.kasaToplami = kasaToplami;
    }

    abstract void faizEkle();



    public void bankaBilgisi(){
        System.out.println(isim + ", " + turu + ", " + kasaToplami);
    }
}
