package gun53.paket5;

public class Main {
    public static void main(String[] args) {
        Ogrenci o1 = new Ogrenci("Ali", 1);
        Ogrenci o2 = new Ogrenci("Veli", 2);
        Ogrenci o3 = new Ogrenci("Hasan", 3);
        Ogrenci o4 = new Ogrenci("Hüseyin", 4);
        o1.arkadasAta(o2);

        System.out.println(o1);

    }
}
