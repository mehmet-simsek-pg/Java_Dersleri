package gun44.task1;

public class Daire extends Cember{

    public Daire(double yaricap) {
        super(yaricap);
    }


    @Override
    protected double alanHesapla() {
        return PI * super.yaricap * yaricap; // super.yaricap == yaricap, bu class'da yaricap olmadigi icin
    }

    @Override
    public String toString() {
        return "Daire{" +
                "yaricap=" + yaricap +
                '}';
    }
}
