package gun39.TryCatch;

import java.util.Scanner;

public class TryCatch4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2 sayi girin : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
