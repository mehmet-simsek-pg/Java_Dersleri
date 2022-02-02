package gun53.paket4;

public class Arac1 {
    String marka;
    int model;
    int buAracSayisi;
    static int aracSayisi;

    public Arac1(String marka) {
        this.marka = marka;
    }

    public Arac1(String marka, int model) {
        this(marka);
        if (model<2000)
            this.model = 2000;
        else
            this.model = model;
    }

    public void aracBilgisi(){
        String str = marka + ", " + model + ", (" + aracSayisi + ")";
        System.out.println(str);
    }


    public static void main(String[] args) {
        Arac1 a1 = new Arac1("Mercedes");
        Arac1 a2 = new Arac1("Bmw", 2021);

        a1.aracBilgisi();
        a2.aracBilgisi();


    }


}
