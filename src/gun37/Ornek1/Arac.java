package gun37.Ornek1;

public class Arac {

    /*
        private 3 degisken tanimlayin
            Marka, model, fiyat
        2 adet constructor yazin
        getter ve setter larini oluturun
        toString methodunu olusturun

        main methodu icinde bir nesne oluturun
        setterlari uygun sekilde düzenleyin
     */

   private String marka;
   private int model;
   private double fiyat;

    public Arac(String marka, int model) {
        this.marka = marka;
        this.model = model;
    }

    public Arac(String marka, int model, double fiyat) {
        this(marka, model);
        //this.marka = marka;
        //this.model = model;
        this.fiyat = fiyat;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        if (marka.length()>3)
            this.marka = marka;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        if (model>2000)
            this.model = model;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        if (this.fiyat==0 && fiyat > 0)
            this.fiyat = fiyat;
        else if (this.fiyat > 0 && fiyat > this.fiyat*0.9)
            this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "marka='" + marka + '\'' +
                ", model=" + model +
                ", fiyat=" + fiyat +
                '}';
    }
}
