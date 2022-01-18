package gun42.extend2;

import java.util.Random;

public class Otomobil extends Arac{
    String marka;


    public Otomobil(Turu turu, int model, String marka){
        super(turu, model);
        this.marka = marka;
    }

    @Override
    public String toString() {
        return turu + ", " + marka;
    }
}
