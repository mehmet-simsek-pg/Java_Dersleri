package gun52.threads;

public class Main1 {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        Thread1 t3 = new Thread1();
        t1.setName("T1");
        t2.setName("T22");
        t3.setName("T33333");
        t1.start();
        t2.start();
        t3.start();
    }
}
