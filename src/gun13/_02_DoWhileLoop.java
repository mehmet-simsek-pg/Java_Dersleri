package gun13;

import java.util.Scanner;

public class _02_DoWhileLoop {
    public static void main(String[] args) {
        /*
        kullanici 0 girene kadar sayi girmesini isteyin
         */

        Scanner scanner = new Scanner(System.in);
        int num;

        /*
        while (num!=0){
            System.out.println("sayi girin");
            num = scanner.nextInt();
        }
         num degiskeninin baslangic degeri olmadigi icin
         while döngüsü icerisinde kontrol edemiyor ve hata var diyor.
         Bu soru icin do-while kullandik. do blogu icerisinde num degiskenine
         kullanici tarafindan sayi atandigi icin while sorunsuz calisti
         */
        do {
            System.out.println("sayi girin");
            num = scanner.nextInt();
        } while (num!=0);


    }
}
