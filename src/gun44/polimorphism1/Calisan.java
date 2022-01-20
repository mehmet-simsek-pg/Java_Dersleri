package gun44.polimorphism1;

public class Calisan extends Insan{
    double maas;

    public Calisan(String adi, double maas) {
        super(adi);
        this.maas = maas;
    }
    @Override
    public String toString() {
        return "Calisan{" +
                "adi='" + adi + '\'' +
                ", maas=" + maas +
                '}';
    }
}
