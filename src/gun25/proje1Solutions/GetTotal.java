package gun25.proje1Solutions;

import java.util.Scanner;

public class GetTotal {

     /*
     içinde negatif de olabilen sayının ve para sembolünün olduğu aşağıdaki gibi 3 tane String okutunuz.
     okunan bu 3 string içindeki sayıları toplatın.
     Toplam pozitif ise toplamı yazdırın, eğer toplam negatif ise sadece -1 yazdırın.

        Ornek:
        String num1 = "$15";    String num2 = "$20";    String num3 = "$30";
        output ----> 65; olmali

        String num1 = "$15";    String num2 = "$-80";   String num3 = "$30";
        output ----> -1; olmali
    */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız.

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        String pattern = "[^\\d.-]+";
        int num1 = Integer.parseInt(str1.replaceAll(pattern, ""));
        int num2 = Integer.parseInt(str2.replaceAll(pattern, ""));
        int num3 = Integer.parseInt(str3.replaceAll(pattern, ""));

        int toplam = num1 + num2 + num3;

        if (toplam >= 0) System.out.println(toplam);
        else System.out.println(-1);

    }
}
