package gun25.proje1Solutions;

import java.util.Scanner;

public class IkiStringBirlestir {
        /*
        Kullanıcıdan alınan iki adet Stringi birbirlerine ekle.
        Eger ilk kelimenin son harfi,
            ikinci kelimenin ilk harfi ile aynı ise
        aynı olan harflerin birisini kaldırın

        Örnek:      "abc", "cat" --> "abcat"
                     012 --> 3
                    "abc", "dog"  -->"abcdog"
         */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız.

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String ekliHali = "";

        if (str1.charAt(str1.length()-1) == str2.charAt(0))
            ekliHali = str1 + str2.substring(1);
        else
            ekliHali = str1 + str2;

        System.out.println(ekliHali);


    }
}
