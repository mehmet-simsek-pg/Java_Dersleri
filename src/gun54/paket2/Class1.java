package gun54.paket2;

public class Class1 extends Parent {

    int genislik;

    public Class1(String isim, int yas, int genislik) {
        super(isim, yas);
        this.genislik = genislik;
    }

    public Class1(String isim, int yas) {
        super(isim);
    }

    public int getGenislik(){
        return genislik;
    }

    @Override
    public String toString() {
        return "Class1{" +
                "genislik=" + genislik +
                ", isim='" + isim + '\'' +
                ", yas=" + yas +
                '}';
    }
}
