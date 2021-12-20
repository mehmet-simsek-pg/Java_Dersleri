package gun25;

import java.util.Arrays;
import java.util.TreeSet;

public class Example2 {
    public static void main(String[] args) {
        // aaabbbfffgggtttddd bu sekilde yazilmis bir kelimeyi düzenleyecek
        // bir metot yazin.
        //  ciktisi bu sekilde olacaktir ->
        //  3a3b3f3g3t3d bu soruyu HashSet kullanarak cözmeye calisin.

        duzenli("aaabbbfffgggctttdddd");

    }

    public static int count(String str) {
        int miktar = 0;
        for (int i = 0; i < str.length(); i++) {
            miktar = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    miktar++;
                } else
                    return miktar;

            }
        }
        return miktar;
    }

    public static void duzenli(String str) {

        String[] array = str.split("");
        TreeSet<String> harfler = new TreeSet<>(Arrays.asList(array));

        String yeni = "";
        for (String harf : harfler) {
            yeni += count(str) + harf;
        }
        System.out.println(yeni);
    }
}
