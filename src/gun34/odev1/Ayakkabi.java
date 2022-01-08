package gun34.odev1;

public class Ayakkabi {
    Mevsim mevsim;
    Marka marka;
    int numara;

    public Ayakkabi(Mevsim mevsim, Marka marka, int numara) {
        this.mevsim = mevsim;
        this.marka = marka;
        this.numara = numara;
    }


    @Override
    public String toString() {
        return "Ayakkabi{" +
                "mevsim=" + mevsim +
                ", marka=" + marka +
                ", numara=" + numara +
                '}';
    }
}
