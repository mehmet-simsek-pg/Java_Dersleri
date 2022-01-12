package gun38.enum2;

// Enum yapisi
public class Aylar1 {
    public static final Aylar1 OCAK = new Aylar1(31);
    public static final Aylar1 SUBAT = new Aylar1(28);
    public static final Aylar1 MART = new Aylar1(31);

    private int gunSayisi;

    Aylar1(int gunSayisi) {
        this.gunSayisi = gunSayisi;
    }
    public int getGunSayisi() {
        return gunSayisi;
    }



    @Override
    public String toString() {
        return "Aylar{" +
                "gunSayisi=" + gunSayisi +
                '}';
    }
}
