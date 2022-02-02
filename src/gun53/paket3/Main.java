package gun53.paket3;

public class Main {
    public static void main(String[] args) {
        Arac a1 = new Arac();
        a1.define("Mercedes", 2020);

        Arac a2 = new Arac();
        a2.define("BMW", 2019);

        Arac a3 = new Arac();
        a3.define("BMW", 2019);
        Arac a4 = new Arac();
        a4.define("BMW", 2019);
        Arac a5 = new Arac();
        a5.define("BMW", 2019);

        a1.aracBilgisi();
        a2.aracBilgisi();

    }
}
