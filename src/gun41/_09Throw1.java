package gun41;

import java.util.Scanner;

public class _09Throw1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("5 ile 10 arasinda sayi giriniz : ");
        int sayi1 = sc.nextInt();

        if (sayi1 < 5){
            System.out.println("Sayi 5 den kücük olmamali");
        }

        if (sayi1 > 10){
            System.out.println("Sayi 10 dan büyük olmamali");
        }

        System.out.println("Satir sonu");

    }
}
