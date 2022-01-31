package mentoring.Gun02;

import java.util.Scanner;

public class Loops05 {
    //Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ).
    // Print product of all numbers.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int carpim=1;
        String secim;

        do {
            System.out.println("Bir sayi girin ya da cikmak icin q ya basin");
            secim = scanner.nextLine();

            if (!secim.equals("q")) {
                int sayi = Integer.parseInt(secim);
                carpim *= sayi;
            }
        } while (!secim.equals("q"));

        System.out.println(carpim);
    }
}
