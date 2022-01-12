package gun38.enum2;

public class Main {


    public static void main(String[] args) {

        // class ile tanimlama
        Aylar1 ay1 = Aylar1.MART;
        System.out.println(ay1);
        System.out.println(ay1.getGunSayisi());

        System.out.println("----------------");
        // enum ile tanimlama
        Aylar ay = Aylar.MART;
        System.out.println(ay);
        System.out.println(ay.name());
        System.out.println(ay.getGunSayisi());
        ay.yaz();

        // String olan SUBAT eger enum icinde varsa
        // enum"in SUBAT verisi olarak islem yürütüyor.
        Aylar.valueOf("SUBAT").yaz();

    }
}

