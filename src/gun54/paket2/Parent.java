package gun54.paket2;

public class Parent{
    String isim;
    int yas;

    public Parent(String isim) {
        this.isim = isim;
    }

    public Parent(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    public void yaz(){
        System.out.println(isim + ", " + yas);
    }

    @Override
    public String toString() {
        return "Parent{" +
                "isim='" + isim + '\'' +
                ", yas=" + yas +
                '}';
    }
}
