package gun46.interface1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sekil sekil = new Sekil();
        Sekil1 sekil1 = new Sekil1();
        Sekil2 sekil2 = new Sekil2();
        ICizilebilir s = new Sekil();

        sekil.ciz();
        sekil1.ciz();
        sekil2.ciz();
        s.ciz();

        ArrayList<ICizilebilir> list = new ArrayList<>();

    }
}
