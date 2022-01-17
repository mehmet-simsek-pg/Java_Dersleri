package gun41;

import java.io.IOException;
import java.util.Scanner;

public class _10Throw2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("5 ile 10 arasinda sayi giriniz : ");
            int sayi1 = sc.nextInt();

            if (sayi1 < 5)
                throw new ArithmeticException("5 den kücük olma Hatasi");

            if (sayi1 > 10)
                throw new IOException("10 dan büyük olma hatasi Hata");

            System.out.println("Satir sonu");

        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage() + ": Sayi 5 den kücük olmamali");
        } catch (IOException e){
            //e.printStackTrace();
            System.out.println(e.getMessage() + ": Sayi 10 dan büyük olmamali");
        }


    }
}
