package gun53.paket4;

import java.util.ArrayList;

public class Arac2 {
    String marka;
    int model;
    int[] arr = new int[3];
    ArrayList<String> list = new ArrayList<>();
    ArrayList<Arac> list2 = new ArrayList<>();
    Arac a;
    Arac1 a1;
    Arac2 a2;


    static int aracSayisi;


    public Arac2(String marka) {
        this.marka = marka;
    }

    public Arac2(String marka, int model) {
        this(marka);
        if (model<2000)
            this.model = 2000;
        else
            this.model = model;
    }



}
