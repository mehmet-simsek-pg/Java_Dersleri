package gun31.paket2;

public class Main2 {

        /*
            Bir dikdörtgenin alanini hesaplayalim

             Boyut class
                double x;
                double y;

            Dikdörtgen class
                //ins var
                Boyut boyut;

                //methods
                void tanimla(int x, int y);
                void tanimla(Boyut boyut);
                double getCevre();
                double getAlan();

             Main2
                Dikdörtgen tanimlanip alani ve cevresi hesaplanacak


         */

    public static void main(String[] args) {
        Dikdortgen d1 = new Dikdortgen();

        d1.tanimla(2,3);
        System.out.println("Cevre : " + d1.getCevre());
        System.out.println("Alan : " + d1.getAlan());

        System.out.println("------------------------------------");
        Boyut boyut = new Boyut();
        boyut.x = 2;
        boyut.y = 3;

        Dikdortgen d2 = new Dikdortgen();
        d2.tanimla(boyut);
        System.out.println("Cevre : " + d2.getCevre());
        System.out.println("Alan : " + d2.getAlan());

    }

}
