package gun25.proje1Solutions;

import java.util.Scanner;

public class RandomNum {
     /*

    Girilen 2 integer arasında Random integer sayı üreten programı yazınız.
    not : girilen sayı üretilen sayılara dahil olmalıdır

  */
    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız.

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        int rnd = min + (int)(Math.random()*(max-min)+1);
        System.out.println(rnd);


    }
}