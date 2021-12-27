package gun25.proje1Solutions;

import java.util.Scanner;

public class DuzenliMetin {

    /*
    Girilen bir metnin kelimelerinin ilk harfini büyük diğer harflerini küçük yapan
    ve düzenlenmiş bu metni return eden metinDuzenle() isimli bir method yazın.

    Example 1:  input: " jAva  öGRENEbildiniz MI? "      output: "Java Ögrenebildiniz Mi?"
     */
    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız. Scanner classı da burada tanımlayınız

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(metinDuzenle(str));

    }

    // bu methodun parametre ve return typelarını doğru yapılandırın
    public static String metinDuzenle(String str){

        String[] arr = str.trim().replaceAll("[ ]+", " ").split(" ");
        String retText = "";
        for (int i = 0; i < arr.length; i++) {
            retText += String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }

        return retText.trim();
    }
}
