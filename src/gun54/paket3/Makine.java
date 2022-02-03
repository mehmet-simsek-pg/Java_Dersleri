package gun54.paket3;

public class Makine {
    String tur;
    int yapimYili;
    static int makineSayisi;

    public Makine(String tur) {
        this.tur = tur;
        makineSayisi++;
    }

    public Makine(String tur, int yapimYili) {
        this(tur);
        this.yapimYili = yapimYili;
    }

    public static int getMakineSayisi(){
        return makineSayisi;
    }

    void calis(){
        System.out.println("Makineye ozel");
    }


    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getYapimYili() {
        return yapimYili;
    }

    public void setYapimYili(int yapimYili) {
        this.yapimYili = yapimYili;
    }

    public static void setMakineSayisi(int makineSayisi) {
        Makine.makineSayisi = makineSayisi;
    }

    @Override
    public String toString() {
        return "Makine{" +
                "tur='" + tur + '\'' +
                ", yapimYili=" + yapimYili +
                '}';
    }
}
