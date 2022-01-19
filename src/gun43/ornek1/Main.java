package gun43.ornek1;

public class Main {
    /*
        Bir firmamiz var. Firmada calisan var
        calisan
            ismi
            maas            (1000)
            maasKatsayisi   (1.0, 1.5)

            maasHesapla() -> maas*maasKatsayisi

        mudur
            ismi
            maas
            maasKatsayisi   (1.0, 1.5)
            makamKatsayisi  (1.0, 1.5)
            maasHesapla() -> maas*maasKatsayisi*makamKatsayisi

       Firmada 2 calisan ve 1 müdür create edip maaslari hesaplayin,
       toString ile ekrana verilerini yazdirin.

     */

    public static void main(String[] args) {
        Calisan c1 = new Calisan("Ali", 100, 1.1);
        Calisan c2 = new Calisan("Veli", 1200, 1.09);
        Mudur m = new Mudur("Hasan", 1500, 1.2, 1.1);
        System.out.println(c1 + "\n" + c1.maasHesapla());
        System.out.println(c2 + "\n" + c2.maasHesapla());
        System.out.println(m + "\n" + m.maasHesapla());
        System.out.printf("%s\n%.2f", m, m.maasHesapla());

    }
}
