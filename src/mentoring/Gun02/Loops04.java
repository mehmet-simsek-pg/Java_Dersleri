package mentoring.Gun02;

import java.util.*;

public class Loops04 {

//    Calculate the sum of digits of a number given by user. E.g.-
//    INUPT : 123        OUPUT : 6
//    INUPT : 12345      OUPUT : 15

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayi girin= ");
        int sayi=scanner.nextInt();
        int toplam=0;
        while (sayi>0) {
            int rakam = sayi % 10;
            toplam += rakam;
            sayi = sayi / 10;
        }

        System.out.println(toplam);
    }
}
