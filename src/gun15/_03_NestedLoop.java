package gun15;

public class _03_NestedLoop {
    public static void main(String[] args) {
        /*

        *
        **
        ***
        ****
        *****

         */

        for (int satir = 1; satir <=5 ; satir++) {
            for (int sütun = 1; sütun <=satir ; sütun++) {
                // her satirda satirin o anki sayisi kadar yildiz oldugundan sütun<=satir dedik
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
