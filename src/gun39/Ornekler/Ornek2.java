package gun39.Ornekler;

import java.util.Scanner;

public class Ornek2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean tamam = false;
        while (!tamam){
            try {
                int a = sc.nextInt();       // hata cikabilir
                System.out.println("Girilen Ilk Sayi : " + a);
                int b = sc.nextInt();
                System.out.println("Girilen Ikinci Sayi : " + b);
                System.out.println("Îlk  Sayinin Karesi : " + karesi(a));
                System.out.println("ikinci Sayinin Karesi : " + karesi(b));
                tamam = true;
            }catch (Exception e){
                System.out.println("Integer girmelisiniz");
                //tamam = true;
                sc.nextLine();
            }
        }



    }
    public static int karesi(int i){
        return i*i;
    }

}
