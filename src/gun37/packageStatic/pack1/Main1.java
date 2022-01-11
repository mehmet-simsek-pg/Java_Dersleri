package gun37.packageStatic.pack1;

public class Main1 {

    public static void main(String[] args) {

        Banka b1 = new Banka();
        b1.sube = "A";
        b1.sehir = "AA";

        Banka.count = 2;
        Banka.ulke = "AAA";

    }
}
