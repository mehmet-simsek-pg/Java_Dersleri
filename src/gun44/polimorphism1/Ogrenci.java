package gun44.polimorphism1;

public class Ogrenci extends Insan{
    String okulu;

    public Ogrenci(String adi, String okulu) {
        super(adi);
        this.okulu = okulu;
    }
    @Override
    public String toString() {
        return "Ogrenci{" +
                "adi='" + adi + '\'' +
                ", okulu='" + okulu + '\'' +
                '}';
    }
}
