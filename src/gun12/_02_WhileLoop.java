package gun12;

import java.util.Scanner;

public class _02_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan pozitif bir tamsayi isteyin.
        0 ile bu sayi arasindaki tek sayilari ekrana yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi girin");
        int num = scanner.nextInt();

        while (num>0){
            if (num%2==1){
                System.out.print(num+" ");
            }
            num--; // num = num - 1  || num-=1
         }
    }
}
