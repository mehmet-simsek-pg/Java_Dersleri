package gun15;

public class LabeledLoop {
    public static void main(String[] args) {

        /*
        break sadece icinde bulundugu döngüyü kirar(continue icinde durum aynidir)
        disaridaki döngüyü kirmak icin disaridaki döngüye isim verilir.
         */

        disDongü: for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                if (j==3){
                    System.out.println(i+" x "+j+" = "+(i*j));
                    break disDongü;
                }
                System.out.println();
            }

        }
    }
}
