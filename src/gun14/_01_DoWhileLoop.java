package gun14;

import java.util.Scanner;

public class _01_DoWhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan tam sayi girmesini isteyin. Bu sayilarin karekökünü
        ekrana yazdirin. Kullanici 0 girene kadar bu islemi tekrarlayin.
         */

        Scanner scanner = new Scanner(System.in);
        int num;

        do{
            System.out.println("sayi girin");
            num = scanner.nextInt();

            int karekok = (int) (Math.sqrt(num));
            System.out.println("karekok = " + karekok);

        }while (num!=0);
    }
}
