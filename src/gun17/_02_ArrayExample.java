package gun17;

import java.util.Scanner;

public class _02_ArrayExample {
    public static void main(String[] args) {

        /*
        Kullanicidan 5 tane email alin. Bu emaillerde @ isareti olmayanlarin miktarini bulun.
         */

        Scanner scanner = new Scanner(System.in);

        String [] emails = new String[5];
        int miktar = 0;

        for (int i = 0; i < emails.length; i++) {
            System.out.println("e mail girin");
            emails[i] = scanner.nextLine();
        }
        /*
         for (int i = 0; i < emails.length; i++) {
            if (!emails[i].contains("@"))
                miktar++;
        }
         */

        for (String email: emails){ // foreach metodu
            if (!email.contains("@")){
                miktar++;
            }

        }

        System.out.println("miktar = " + miktar);
    }
}
