package gun39.TryCatch;

public class TryCatch5 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            bekle(1000);
        }
        /*
        System.out.println(1);

        bekle(1000);

        System.out.println(2);
        */

    }

    public static void bekle(long milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
