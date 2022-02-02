package gun53.paket4;

public class Arac {
    // variables, fields
    String marka;
    int model;
    int buAracSayisi;
    static int aracSayisi;

    // class ismi ile ayni ancak return"u olmayan method constructordir
    // new yapildiginda otomatik calistirilir
    public Arac(String marka, int model) {
        this.marka = marka;
        this.model = model;
        aracSayisi++;
    }



    public void aracBilgisi(){
        String str = marka + ", " + model + ", (" + aracSayisi + ")";
        System.out.println(str);
    }


    public static void main(String[] args) {
        Arac a1 = new Arac("Mercedes", 2020);
        Arac a2 = new Arac("Bmw", 2021);

        a1.aracBilgisi();
        a2.aracBilgisi();


    }


}
