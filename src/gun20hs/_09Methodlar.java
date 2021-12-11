package gun20hs;

import java.util.Arrays;

public class _09Methodlar {
    public static void main(String[] args) {

        // Girilen bir Stringin harflerini array return esin
        String str1 = "Java dünyasi";
        /*
        System.out.println(Arrays.toString(getStringArray(str1)));
        System.out.println(Arrays.toString(getStringArray("Euro Study")));
        System.out.println(Arrays.toString(getStringArray("Türkiye")));
        */

        // str1 metnini String arraye cevirdik
        String[] arr = getStringArray(str1);
        // arr"i ekrana yazdirdik
        System.out.println(Arrays.toString(arr));

        // String[] olan arr"i metne cevirip ekrana yazdik
        System.out.println(makeString(arr));

        System.out.println(makeString(new String[] {"Merhaba", "Dünya"}));

    }

    /**
     * Bu nethod Aldigi bir stringin karakterlerini String array olarak return eder
     * @param str String parametre
     * @return String array return eder
     */
    public static String[] getStringArray(String str){
        String[] arr = str.toUpperCase().split("");
        return arr;
    }

    /**
     * Bu method aldigi String[] arrayi birlestirir
     * @param arr
     * @return
     */
    public static String makeString(String[] arr){
        String str = "";
        for (String s : arr) {
            str += s;
        }
        return str;
    }

}
