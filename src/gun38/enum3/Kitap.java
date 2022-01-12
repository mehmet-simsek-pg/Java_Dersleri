package gun38.enum3;

public enum Kitap {
    /*
        kitap bilgileri tutan ve gerekli islemleri yapan enum yazin
        adi, yazari, basimYili, sayfaSayisi

     */

    KITAP1("Satranc", "Stephan Zweig", 1942, 70),
    KITAP2("Gülün Adi", "Emile Zola", 1930, 300),
    KITAP3("Bahar", "Ali Korkmaz", 1980, 124),
    ;
    private String kitapAdi;
    private String yazari;
    private int basimYili;
    private int sayfaSayisi;

    Kitap(String kitapAdi, String yazari, int basimYili, int sayfaSayisi) {
        this.kitapAdi = kitapAdi;
        this.yazari = yazari;
        this.basimYili = basimYili;
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public String getYazari() {
        return yazari;
    }

    public int getBasimYili() {
        return basimYili;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", yazari='" + yazari + '\'' +
                ", basimYili=" + basimYili +
                ", sayfaSayisi=" + sayfaSayisi +
                '}';
    }
}
