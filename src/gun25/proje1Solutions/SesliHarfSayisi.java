package gun25.proje1Solutions;

import java.util.Scanner;

public class SesliHarfSayisi {

    /*
      Girilen bir stringdeki sesli harf sayısını return eden
      parametre olarak bir String alacak ve int olarak sesli harf sayısını
      return edecek getSesliSayisi() isimli bir method yazın.
     */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız. Scanner classı da burada tanımlayınız

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(getSesliSayisi(str));

    }

    // bu methodun parametre ve return typelarını doğru yapılandırın
    public static int getSesliSayisi(String str){
        String sesliler = "aeıioöuü";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (sesliler.indexOf(str.charAt(i))>-1)
                count++;
        }
        return count;
    }
}
