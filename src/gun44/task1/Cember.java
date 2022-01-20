package gun44.task1;

public class Cember extends Sekil{
    protected double yaricap;
    //public final double PI = Math.PI;     // instance olarak tanimlanirsa her bir nesne icin ayri ayri create edilir
    public static final double PI = Math.PI;  // statik tanimlanirsa bir defa create edilir ve tüm nesneler ulasabilir


    public Cember(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    protected double cevreHesapla() {
        return 2*PI*yaricap;
    }

    private void cevreHesaplaVoid() {
        System.out.printf("Cemberin cevresi %.2f birimdir.\n", 2*PI*yaricap);
    }


    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public String toString() {
        return "Cember{" +
                "yaricap=" + yaricap +
                '}';
    }
}
