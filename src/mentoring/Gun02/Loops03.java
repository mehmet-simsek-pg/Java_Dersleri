package mentoring.Gun02;

import java.util.Scanner;

public class Loops03 {

        //Take 10 integers from keyboard using loop and print their average value on the screen.

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int toplam=0;
        for (int i = 0; i <2; i++) {
            System.out.print((i+1)+". sayiyi girin= ");
            int sayi=scanner.nextInt();
            toplam+=sayi;
        }

        double ortalama=  (double) toplam/10;
        System.out.println(ortalama);
    }

}
