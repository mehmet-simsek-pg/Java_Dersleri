package gun15hs;

import java.util.Scanner;

public class _09Loops1 {

    public static void main(String[] args) {
        /*  girilen bir kelimenin polidrom olup olmadigini ekrana yazdirin
          adanadc  aba 121 101  polidrom

          abc  ->  cba   -> abc == cba ?

            strRev += str.charAt(str.length()-1-i);

            a b a
            str.length()-1 = 2;

            i   str.charAt(str.length()-1-i)  strRev  (strRev += str.charAt(str.length()-1-i);)
            0   str.charAt(2-0) = a            a
            1   str.charAt(2-1) = b            ab
            2   str.charAt(2-2) = a            aba

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Metin girin : ");
        String str = sc.nextLine();

        String strRev = "";

        for (int i = 0; i<str.length(); i++) {
            strRev += str.charAt(str.length()-1-i);
        }

        /*
        for (int i = str.length()-1; i >=0 ; i--) {
            strRev += str.charAt(i);
        }
         */
        System.out.println(strRev);

        if (str.equals(strRev))
            System.out.println(str + " polidromdur");
        else
            System.out.println(str + " polidrom degildir");



    }
}