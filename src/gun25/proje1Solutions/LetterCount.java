package gun25.proje1Solutions;

import java.util.Scanner;

public class LetterCount {

    /*
      Girilen bir stringdeki harf sayısı tek ise true, değilse false yazdırınız.
     */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println( word.length() % 2 == 1 );

    }
}
