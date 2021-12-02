package gun14;

import java.util.Scanner;

public class _01_Continue {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cümle girmesini isteyin. Cümledeki her harfi alt alta
        yazdirin. Bosluk gelirse boslugu yazdirmayin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cümle girin");
        String cumle = scanner.nextLine();

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i)==' '){
                continue; // alt satira indirmez döngüde yukariya dogru devam eder.
            }
            System.out.println(cumle.charAt(i));
        }
    }
}
