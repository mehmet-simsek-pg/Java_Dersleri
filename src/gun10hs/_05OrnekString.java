package gun10hs;

import java.util.Scanner;

public class _05OrnekString {
    /*
        Girilen bir metinin
        a.	ilk harfini consola yazdirin
        b.	son harfini consola yazdirin
        c.	ortadaki harfini consola yazdirin
        d.	metnin uzunlugunu ekrana yazdirin
     */

    public static void main(String[] args) {

        //System.out.println("java\n dün\tyasi");

        Scanner sc = new Scanner(System.in);
        System.out.print("Metni Giriniz : ");
        String txt = sc.nextLine();

        System.out.println(
                "Ilk Harf : " + txt.charAt(0) + "\n" +
                "Orta Harf : " + txt.charAt(txt.length()/2) + "\n" +
                "Son Harf : " + txt.charAt(txt.length()-1) + "\n" +
                "Text Uzunlugu : " + txt.length()
        );

        System.out.println("Java " + " " + "dünyasi" +  " " + "nasil");
        System.out.println(
                "Java " + " " +
                "dünyasi" +  " " +
                "nasil"
        );
    }
}
