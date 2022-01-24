package gun46.abstract2;

public class Main {
    /*
        Sekil  -> abstract class
            alanHesapla()
            cevreHesapla()

            Dikdortgen  -> extends Sekil
                Kare    -> extends Dikdortgen

            Cember      -> extends Sekil
                Daire   -> extends Cember
     */

    public static void main(String[] args) {
        Sekil dikdortgen = new Dikdortgen(3,4);
        Sekil kare = new Kare(5);
        Sekil cember = new Cember(3);
        Sekil daire = new Daire(4);
        System.out.println(dikdortgen);
        System.out.println(kare);
        System.out.println(cember);
        System.out.println(daire);
        daire.genelAciklama();
    }
}
