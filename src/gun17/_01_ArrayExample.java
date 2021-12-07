package gun17;

import java.util.Scanner;

public class _01_ArrayExample {
    public static void main(String[] args) {

        /*
        Kullanicidan 5 tane sayi alin ve bu sayilarin tek olanlarini sayisini bulun
         */

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) { // diziye eleman eklemek icin
            System.out.println("sayi girin");
            array[i]=scanner.nextInt();
        }

        int miktar = 0;
        for (int i = 0; i < array.length; i++) { // dizideki elemanlari kontrol etmek icin
            if (array[i]%2==1){
                System.out.println(array[i]);
                miktar++;
            }
        }
        System.out.println("miktar = " + miktar);
    }
}
