package gun15;

public class _04_NestedLoop {
    public static void main(String[] args) {
        // *****
        // ****
        // ***
        // **
        // *

        for (int satir = 1; satir <=5 ; satir++) {
            for (int sütun = 5; sütun >=satir ; sütun--) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        yukaridaki ile ayni sonucu verir.

        for (int i = 5; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         */

    }
}
