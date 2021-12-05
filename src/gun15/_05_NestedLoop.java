package gun15;

public class _05_NestedLoop {
    public static void main(String[] args) {
        /*
        10 a kadar (10 dahil) carpim tablosunu ekrana yazdirin
         */

        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println();
        }
    }
}
