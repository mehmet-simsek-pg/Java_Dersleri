package gun19;

import java.util.Scanner;

public class _03_Methods {
    public static void main(String[] args) {
        /*
        Kullanicinin girecegi sayinin tek mi cift mi oldugunu bulan bir metot yazin.
         */

        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        tekMiCiftMi(sayi);
    }

    public static void tekMiCiftMi(int num) {
        if (num%2==1){
            System.out.println("sayi tektir");
        }else {
            System.out.println("sayi cifttir");
        }
    }
}
