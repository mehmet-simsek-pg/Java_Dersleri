package gun37.Ornek2;

public class Main {
    public static void main(String[] args) {

        Arac arac = new Arac(Marka.AUDI, 2020, Tip.HATCHBACK);
        arac.setFiyat(10000);
        System.out.println(arac);

    }
}
