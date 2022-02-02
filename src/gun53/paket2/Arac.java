package gun53.paket2;

public class Arac {
    // variables, fields
    String marka;
    int model;
    int buAracSayisi;
    static int aracSayisi;



    public void aracBilgisi(){
        String str = marka + ", " + model + ", (" + aracSayisi + ")";
        System.out.println(str);
    }



}
