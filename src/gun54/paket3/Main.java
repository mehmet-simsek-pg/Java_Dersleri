package gun54.paket3;

public class Main {
    /*
        Makine class"i
            String tur;
            int yapimYili;
            static int makineSayisi;

            constructor(tur)

            static method getMakineSayisi
            void calis();
                sout("Makineye ozel")

        Motor ext Makine
            String isim;
            int gucu;

            void calis();
                sout("Motor calisiyor")

        TesviyeMakinesi ex Makine
            String isim;
            int calisanSayisi;

            void calis();
                sout("Tesviye islemi n kisi ile basladi")




     */

    public static void main(String[] args) {
        Motor m = new Motor("Motor", "Beygir", 200);
        TesviyeMakinesi t = new TesviyeMakinesi("TM", "Tesviye", 3);
        m.calis();
        t.calis();
        System.out.println(Makine.getMakineSayisi());
        System.out.println(m);
        System.out.println(t);
    }
}
