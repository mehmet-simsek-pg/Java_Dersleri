package gun25.proje1Solutions;

import java.util.Scanner;

public class CiftmiTekmi {

     /*
        Girilen bir sayı çift ise "true" , tek ise "false" yazdırınız
     */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println( number % 2 == 0 );

    }

}
