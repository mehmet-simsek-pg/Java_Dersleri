package gun38.enum2;

public enum Aylar {

    // OCAK Aylar class"inin public static final olarak olusturulmus nesnesidir
    OCAK(31),
    SUBAT(28),
    MART(31),
    NISAN(30),
    MAYIS(31),
    HAZIRAN(30),
    TEMMUZ(31),
    AGUSTOS(31),
    EYLUL(30),
    EKIM(31),
    KASIM(30),
    ARALIK(31)
    ;

    private int gunSayisi;

    Aylar(int gunSayisi) {
        this.gunSayisi = gunSayisi;
    }

    public int getGunSayisi() {
        return gunSayisi;
    }

    public void yaz(){
        System.out.println(this.ordinal()+1);
    }

    @Override
    public String toString() {
        return "Aylar{" +
                "gunSayisi=" + gunSayisi +
                '}';
    }

}
