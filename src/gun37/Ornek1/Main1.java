package gun37.Ornek1;

public class Main1 {
    public static void main(String[] args) {
        Arac arac = new Arac("BMW", 2020);

        arac.setFiyat(-100);
        System.out.println(arac.getFiyat());

        arac.setFiyat(1000);
        System.out.println(arac.getFiyat());

        arac.setFiyat(950);
        System.out.println(arac.getFiyat());


    }
}
