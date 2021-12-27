package gun25.proje1Solutions;

import java.util.Scanner;

public class TersMetin {

    /*
    Girilen bir metnin tersini ekrana yazdırınız.

    Example 1:  input: Turkiye       output: eyikruT
     */
    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız.

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.substring(i,i+1));
        }


    }

}
