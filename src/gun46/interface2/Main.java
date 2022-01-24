package gun46.interface2;

public class Main {

    /*
        ISekil  -> Interface
            alanHesapla()
            cevreHesapla()

            Dikdortgen  -> implements ISekil
                Kare    -> extends Dikdortgen
                Kare1   -> implemenns ISekil
            Cember      -> implements ISekil
                Daire   -> extends Cember
     */

    public static void main(String[] args) {
        ISekil dikdortgen = new Dikdortgen(3,4);
        ISekil kare = new Kare(5);
        ISekil cember = new Cember(3);
        ISekil daire = new Daire(4);
        System.out.println(dikdortgen);
        System.out.println(kare);
        System.out.println(cember);
        System.out.println(daire);
    }
}
