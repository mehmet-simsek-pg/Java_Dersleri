package gun36.ternary;

import java.util.Scanner;

public class Ternary1 {

    public static void main(String[] args) {
        // sayi tek mi cift mi

        Scanner sc = new Scanner(System.in);
        System.out.print("Tamsayi girin : ");
        int num = sc.nextInt();

        System.out.println(tekCift1(num));
        System.out.println(tekCift2(num));

    }

    public static String tekCift1(int num){
        String sonuc = "";
        if (num % 2 == 0)
            sonuc = "Cift";
        else
            sonuc = "Tek";
        return sonuc;
    }

    public static String tekCift2(int num){
        //String sonuc = "";
        // Ternary operator
        //    () ? true : false;

        // sonuc stringi neye esit olsun
        // (num % 2 == 0) "nun sonucu true ise "Cift", false ise "Tek" olsun
        String sonuc = (num % 2 == 0) ? "Cift" : "Tek";
        return sonuc;

        /*
        if (num % 2 == 0)
            sonuc = "Cift";
        else
            sonuc = "Tek";
        return sonuc;
         */
    }
}
