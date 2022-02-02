package gun52.threads;

import java.time.LocalTime;

public class Thread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":"+ i);
        }
    }


    public static void main(String[] args) {
        Runnable r1 = new Thread2();
        Runnable r2 = new Thread2();

        Thread t1 = new Thread(r1, "T01");
        Thread t2 = new Thread(r2, "T02");
        System.out.println(LocalTime.now());
        t1.start();
        t2.start();
        System.out.println(LocalTime.now());

    }
}
