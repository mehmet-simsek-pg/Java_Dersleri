package gun15;

public class _02_NestedLoop {
    public static void main(String[] args) {

        /*

        *****
        *****
        *****
        *****
        *****

        ekrana bu sekilde cikti verecek programi yazin
         */

        for (int satir = 1; satir <= 5; satir++) {
            for (int sütun = 1; sütun <= 5; sütun++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
