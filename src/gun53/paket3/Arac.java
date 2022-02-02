package gun53.paket3;

public class Arac {
    String marka;
    int model;
    int buAracSayisi;
    static int aracSayisi;

    // this o nesneyi ifade eder
    public void define(String marka, int model){
        this.marka = marka;
        this.model = model;
        buAracSayisi++;
        aracSayisi++;
    }

    public void aracBilgisi(){
        System.out.println(marka + ", " + model + ", " + buAracSayisi + ", " + aracSayisi);
    }
}
