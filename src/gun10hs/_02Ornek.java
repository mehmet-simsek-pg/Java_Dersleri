package gun10hs;

import java.util.Scanner;

public class _02Ornek {

    /*
        Girilen iki tamsayidan büyük olani ekrana yazdirin
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("2 Sayi Giriniz : ");

        int number1;
        number1 = sc.nextInt();

        int number2 = sc.nextInt();

        //sc.nextInt();

        if (number1 > number2){
            System.out.println("Büyük sayi : " + number1);
        }else{
            System.out.println("Büyük sayi : " + number2);
        }

    }
}
