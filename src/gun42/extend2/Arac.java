package gun42.extend2;

public class Arac {
    protected Turu turu;    // extend edenler ulasabilir
    private int model;

    public Arac(Turu turu) {
        this.turu = turu;
    }

    public Arac(Turu turu, int model) {
        this.turu = turu;
        this.model = model;
    }

    public Turu getTuru() {
        return turu;
    }

    public void setTuru(Turu turu) {
        this.turu = turu;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "turu=" + turu +
                ", model=" + model +
                '}';
    }
}
