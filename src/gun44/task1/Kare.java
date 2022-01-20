package gun44.task1;

public class Kare extends Dikdortgen{


    public Kare(double uzunluk) {
        super(uzunluk, uzunluk);
    }

    @Override
    public double getUzunluk() {
        return super.getUzunluk();
    }

    @Override
    public void setUzunluk(double uzunluk) {
        super.setUzunluk(uzunluk);
        super.setGenislik(uzunluk);
    }

    @Override
    public String toString() {
        return "Kare{" +
                "uzunluk=" + super.getUzunluk() +
                '}';
    }
}
