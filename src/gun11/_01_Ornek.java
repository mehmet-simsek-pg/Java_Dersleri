package gun11;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        /*
        Kullanicidan aralarinda virgül olacak sekilde iki tam sayi alin.
         Bu tamsayilardan büyük olani ekrana yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Aralarina virgül koyarak iki tam sayi girin");
        String sayilar = scanner.nextLine();

        int virgül = sayilar.indexOf(",");
        String strSayi1 = sayilar.substring(0,virgül);
        String strSayi2 = sayilar.substring(virgül+1);

        int sayi1 = Integer.parseInt(strSayi1);
        int sayi2 = Integer.parseInt(strSayi2);

        int max = Math.max(sayi1,sayi2);
        System.out.println("max = " + max);
    }
}
