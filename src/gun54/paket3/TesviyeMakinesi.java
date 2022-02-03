package gun54.paket3;

public class TesviyeMakinesi extends Makine{
    String isim;
    int calisanSayisi;

    public TesviyeMakinesi(String tur, String isim, int calisanSayisi) {
        super(tur);
        this.isim = isim;
        this.calisanSayisi = calisanSayisi;
    }



    @Override
    void calis() {
        System.out.println("Tesviye islemi " + calisanSayisi + " kisi ile basladi");
    }

    @Override
    public String toString() {
        return super.toString() + ", TesviyeMakinesi{" +
                "isim='" + isim + '\'' +
                ", calisanSayisi=" + calisanSayisi +
                '}';
    }
}
