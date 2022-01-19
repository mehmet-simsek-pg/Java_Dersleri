package gun43.ornek1;

public class Mudur extends Calisan{
    double makamKatsayisi;

    public Mudur(String ismi, double maas, double maasKatsayisi, double makamKatsayisi) {
        super(ismi, maas, maasKatsayisi);
        this.makamKatsayisi = makamKatsayisi;
    }

    @Override
    public double maasHesapla() {
        //return maas * maasKatsayisi * makamKatsayisi;
        //return super.maas * super.maasKatsayisi * this.makamKatsayisi;
        return super.maasHesapla() * makamKatsayisi;
    }

    @Override
    public String toString() {
        return "Mudur{" +
                "ismi='" + ismi + '\'' +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                ", makamKatsayisi=" + makamKatsayisi +
                '}';
    }
}
