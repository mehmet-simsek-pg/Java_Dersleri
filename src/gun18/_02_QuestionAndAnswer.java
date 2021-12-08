package gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _02_QuestionAndAnswer {
    public static void main(String[] args) {
         /* soru 2:
        Bir gazetede calisiyorunuz. Köse yazilarinin birinde 3. cümlenin sonunda "java"
        kelimesi eksik yazilmis. Bu hatayi düzeltecek bir program yazin.

        örnek köse yazisi su sekildedir:

        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam in massa ac est finibus dictum.
        Pellentesque aliquam cursus risus, vitae elementum mi faucibus blandit. Nulla facilisi.
        Aenean molestie lacinia convallis. Morbi laoreet tellus purus, vel egestas turpis pretium in.

         */

        String koseYazisi = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam in massa ac est finibus dictum." +
                " Pellentesque aliquam cursus risus, vitae elementum mi faucibus blandit. Nulla facilisi." +
                "Aenean molestie lacinia convallis. Morbi laoreet tellus purus, vel egestas turpis pretium in.";

        String[] cumleler = koseYazisi.split("\\."); //  (\\.) regex kurali oldugu icin

        String duzenlenmis = "";
        cumleler[2]+=" java"; // 3. cümle

        for (String cumle : cumleler) {
            duzenlenmis += cumle + ".";
        }
           System.out.print(duzenlenmis);

    }
}
