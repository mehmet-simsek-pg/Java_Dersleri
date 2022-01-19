package gun43.ornek1;

public class Calisan {
    String ismi;
    double maas;
    double maasKatsayisi;

    public Calisan(String ismi, double maas, double maasKatsayisi) {
        if (maas < 0)
            throw new RuntimeException("Maas negatif olamaz");
        // eger maas negatig ise program sonlandirilacak
        // varsayimimiz bu oldu
        this.ismi = ismi;
        this.maas = maas;

        try {
            if (maasKatsayisi < 1)
                throw new ArithmeticException("");
            this.maasKatsayisi = maasKatsayisi;
        } catch (ArithmeticException e) {
            this.maasKatsayisi = 1;
        }
        /*
        if (maasKatsayisi<1)
            this.maasKatsayisi = 1;
        else
            this.maasKatsayisi = maasKatsayisi;
        */
    }

    public double maasHesapla(){
        return maas*maasKatsayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "ismi='" + ismi + '\'' +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                '}';
    }
}
