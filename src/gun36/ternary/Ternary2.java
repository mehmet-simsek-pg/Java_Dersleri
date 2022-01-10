package gun36.ternary;

import java.util.Scanner;

public class Ternary2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String sonuc = (num % 2 == 0) ? "Sayi 2 ye bölünür" : (num % 3 == 0) ? "Sayi 3 e bölünür" : "2 ve 3 e bölünmez";
        System.out.println(sonuc);

        if (num % 2 == 0){
            sonuc = "Sayi 2 ye bölünür";
        }else{  // :
            if (num % 3 == 0){
                sonuc = "Sayi 3 e bölünür";
            }else{
                sonuc = "2 ve 3 e bölünmez";
            }
        }
        System.out.println(sonuc);
    }
}
