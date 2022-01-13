package gun39.Ornekler;

import java.util.Scanner;

public class Ornek1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();       // hata cikabilir
            System.out.println("Girilen Ilk Sayi : " + a);
            int b = sc.nextInt();
            System.out.println("Girilen Ikinci Sayi : " + b);
            System.out.println("Îlk  Sayinin Karesi : " + karesi(a));
            System.out.println("ikinci Sayinin Karesi : " + karesi(b));

        }catch (Exception e){
            System.out.println("Integer girmelisiniz");
        }

    }
    public static int karesi(int i){
        return i*i;
    }

}
