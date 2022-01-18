package gun42.extend2;

public class Main{
    /*
        Arac (fields: turu enum, model)
            String turu = "Kamyon;
            Turu turu = Turu.Kamyon;

            Kamyon (fields: yukKapasitesi)      (class)
            Otomobil (fields: marka)            (class) (fields: turu enum, model, marka)
            Otobus (fields: yolcuKapasitesi)    (class)

       Kamyon, Otomobil, Otobus -> extends Arac

        Arac"in constructor ekleyin


     */
    public static void main(String[] args) {

        Otomobil otomobil = new Otomobil(Turu.Otomobil, 2015, "Reno");
        Otobus otobus = new Otobus(Turu.Otobus, 2020, 40);
        Kamyon kamyon = new Kamyon(Turu.Kamyon, 2010, 50);

        System.out.println(kamyon);
        System.out.println(otomobil);
        System.out.println(otobus);
    }



}
