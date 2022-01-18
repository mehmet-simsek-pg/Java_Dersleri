package gun42.extend2;

public class Otobus extends Arac{
    int yolcuKapasitesi;

    // eger super class"in bos konstructor haricinde onstructor"i varsa
    // sub class icerisinde cagrilmali

    public Otobus(Turu turu, int model, int yolcuKapasitesi) {
        super(turu, model); // super class"in create edilmesi icin constructor"a veri gönderliyor
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    @Override
    public String toString() {
        return super.toString() + "-" +
                "Otobus{" +
                "yolcuKapasitesi=" + yolcuKapasitesi +
                '}';
    }
}
