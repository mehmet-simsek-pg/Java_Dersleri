package gun25.proje1Solutions;

import java.util.Scanner;

public class TamKare {
    /*
       Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
       tamkare ise true  değilse false yazdırınız.

        Not: sqrt gibi fonksiyonları  kullanmayın.

        Örnek 1:    Input: 16   ise     Output: true
        Not: bu sayı tamkare çünkü 4*4 = 16

        Example 2:  Input: 25   ise     Output: true
        Note: bu sayı tamkare çünkü 5*5=25

        Example 3:  Input: 14   ise     Output: false
        Note: herhangi aynı iki tamsayının çarpımı 14 etmez

     */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız.

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int i = 0;
        boolean tamKareMi = false;
        while (i < input/2){

            if (i*i == input){
                tamKareMi = true;
                break;
            }
            i++;
        }
        System.out.println(tamKareMi);

    }
}
