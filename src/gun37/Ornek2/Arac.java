package gun37.Ornek2;

public class Arac {

    /*
        private 3 degisken tanimlayin
            Marka (enum), model, tip (enum), fiyat

        2-3 adet constructor yazin
        getter ve setter larini oluturun
        toString methodunu olusturun

        main methodu icinde bir nesne oluturun
        setterlari uygun sekilde düzenleyin
     */

    private Marka marka;
    private int model;
    private Tip tip;
    private double fiyat;

    public Arac(Marka marka, int model, Tip tip) {
        this.marka = marka;
        this.model = model;
        this.tip = tip;
    }

    public Arac(Marka marka, int model, Tip tip, double fiyat) {
        this(marka, model, tip);
        this.fiyat = fiyat;
    }


    public Marka getMarka() {
        return marka;
    }

    public int getModel() {
        return model;
    }

    public Tip getTip() {
        return tip;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Arac Bilgileri" +
                "\nmarka=" + marka +
                "\nmodel=" + model +
                "\ntip=" + tip +
                "\nfiyat=" + fiyat;
    }
}
