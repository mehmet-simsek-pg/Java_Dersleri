package gun16;

import java.util.Scanner;

public class _04_Array {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane isim girmesini isteyin.
        Bu isimlerden uzunlugu 6 dan buyuk kac isim oldugunu bulun.
         */

        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];

        int miktar = 0;

        for (int i = 0; i < array.length; i++) { // array.length -> 5 burda dizinin kac elemanli oldugunu belirtir
            System.out.println("isim girin");
            array[i] = scanner.nextLine();
            if (array[i].length()>6){ // array[i].length() -> dizinin o indisindeki elemanin uzunlugu
                miktar++;
            }
        }
        System.out.println("miktar = " + miktar);
    }
}
