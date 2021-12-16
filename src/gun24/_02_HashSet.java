package gun24;

import java.util.HashSet;
import java.util.TreeSet;

public class _02_HashSet {
    public static void main(String[] args) {

        HashSet<String> renkler = new HashSet<>();
        // HashSet kurali uygulayan class <String> veya <Integer> veri tipi

        renkler.add("blue");
        renkler.add("red");
        renkler.add("black");
        renkler.add("blue");
        renkler.add("yellow");

        //1. yazdirma sekli
        System.out.println("renkler = " + renkler);

        //2. yazdirma sekli
        for (String renk: renkler){
            System.out.println(renk);
        }

    }
}
