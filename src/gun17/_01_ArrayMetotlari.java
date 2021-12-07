package gun17;

import java.util.Scanner;

public class _01_ArrayMetotlari {
    public static void main(String[] args) {

        /*
        Kullanicidan bir cümle yazmasini isteyin.
        Bu cümledeki harfleri kelime kelime bir diziye atin.
        Cümleyi tersten yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("cümle girin");
        String cumle = scanner.nextLine();

        String[] kelimeler = cumle.split(" ");
        // split() metodu icerisine verilen degere String ifadeyi böler

        for (int i = kelimeler.length-1; i >=0 ; i--) {
            System.out.print(kelimeler[i]+" ");
        }
    }
}
