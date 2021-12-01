package gun13;


import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi isteyin.
        0 ile bu sayi arasindaki sayi dahil toplamini bulun
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi girin");
        int num = scanner.nextInt();

        int toplam = 0;

        while (0<=num){
            toplam+=num; // toplam = toplam + num
            num--;
        }
        System.out.println("toplam = " + toplam);

    }
}

