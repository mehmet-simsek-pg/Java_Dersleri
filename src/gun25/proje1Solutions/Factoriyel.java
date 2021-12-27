package gun25.proje1Solutions;

import java.util.Scanner;

public class Factoriyel {

    /*
        Girilen pozitif bir sayının faktöriyel değerini bulmak için bir program yazın.
        Sayı negatif girilirse 0 yazsın

        number : 5     ise  (factorial : 1*2*3*4*5=120)
        output : 120

    */
    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız.

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long fakt;
        if (num > -1){
            fakt = 1;
            for (int i = 1; i <= num; i++) {
                fakt *= i;
            }
        }else{
            fakt = 0;
        }
        System.out.println(fakt);
    }
}
