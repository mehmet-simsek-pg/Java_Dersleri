package gun32.paket.constructor2;

public class Sirket {
    String name;
    String unvan;
    String adres;
    int vergiNo;

    public Sirket(String name, String unvan, String adres, int vergiNo) {
        this.name = name;
        this.unvan = unvan;
        this.adres = adres;
        this.vergiNo = vergiNo;
    }

    public Sirket(String name, String unvan, String adres) {
        /*
        this.name = name;
        this.unvan = unvan;
        this.adres = adres;
         */
        this(name, unvan, adres, 100);
    }

    public Sirket(String name, String unvan) {
        /*
        this.name = name;
        this.unvan = unvan;
        this.adres = "Adres Bulunamadi";
        this.vergiNo = 100;
         */
        this(name, unvan, "Adres bulunamadi", 100);
    }

    public Sirket(String unvan) {
        this("", unvan);
        //this.unvan = unvan;
    }

    @Override
    public String toString() {
        return "Sirket Bilgileri :" +
                "\nname= " + name +
                "\nunvan= " + unvan +
                "\nadres= " + adres +
                "\nvergiNo= " + vergiNo;
    }
}
