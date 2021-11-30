package gun9;

import java.util.Scanner;

public class _02IfElseOrnekler {
    public static void main(String[] args) {
        /*
        ekrandan bir sayi girin. eger sayi sifirdan buyukse ekrana
        pozitif yazin, eger sayi sifirdan kucukse negatif yazin.
        Pozitif ya da negatif degilse ekrana sifir yazdirin
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi =scanner.nextInt();

        if (sayi>0){
            System.out.println("pozitif");}
        else if (sayi<0){
            System.out.println("negatif");}
        else {
            System.out.println("0");
        }



    }
}
