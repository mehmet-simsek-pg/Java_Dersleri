package gun46.abstract2;

public class Cember extends Sekil {
    double yaricap;

    public Cember(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double cevreHesapla() {
        return 2*PI*yaricap;
    }

    @Override
    public double alanHesapla() {
        throw new RuntimeException("Cemberin alani olmaz");
    }

    @Override
    public String toString() {
        return "Cember{" +
                "yaricap=" + yaricap +
                ", cevre=" + cevreHesapla() +
                '}';
    }
}
