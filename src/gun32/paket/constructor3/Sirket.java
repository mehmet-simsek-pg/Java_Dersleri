package gun32.paket.constructor3;

public class Sirket {
    String name;
    String unvan;
    String adres;
    int vergiNo;

    public Sirket(){
        islem();
    }

    public Sirket(String name) {
        this.name = name;
    }

    public Sirket(int vergiNo) {
        this.vergiNo = vergiNo;
    }

    public Sirket(String name, String unvan) {
        this(name);
        this.unvan = unvan;
    }

    public Sirket(String name, String unvan, String adres) {
        this(name, unvan);
        this.adres = adres;
    }

    public Sirket(String name, String unvan, String adres, int vergiNo) {
        this(name, unvan, adres);
        this.vergiNo = vergiNo;
    }

    @Override
    public String toString() {
        return "Sirket Bilgileri :" +
                "\nname= " + name +
                "\nunvan= " + unvan +
                "\nadres= " + adres +
                "\nvergiNo= " + vergiNo;
    }

    public void islem(){
        System.out.println("islem tamam");
    }
}
