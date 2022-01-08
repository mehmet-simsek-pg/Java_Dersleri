package gun34.odev1;

public class Main {

    static Mevsim suAnkiMevsim = Mevsim.KIS;

    public static void main(String[] args) {

        Ayakkabi pabuc1 = new Ayakkabi(Mevsim.YAZ, Marka.ADIDAS, 45);
        Ayakkabi pabuc2 = new Ayakkabi(Mevsim.KIS, Marka.BOT, 42);
        Insan insan1 = new Insan("Ali", 42);
        insan1.ayakkabiGiy(pabuc1);
        insan1.ayakkabiGiy(pabuc2);
        insan1.eveGel();
        insan1.ayakkabiGiy(pabuc2);
        insan1.ayakkabiCikar();
        insan1.ayakkabiCikar();
        insan1.birazGez();
        insan1.ayakkabiGiy(pabuc2);
        insan1.birazGez();
        insan1.ayakkabiCikar();
        insan1.eveGel();
        insan1.ayakkabiCikar();

    }
}
