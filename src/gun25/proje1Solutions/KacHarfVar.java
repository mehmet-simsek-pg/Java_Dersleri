package gun25.proje1Solutions;

import java.util.Scanner;

public class KacHarfVar {

    /*
        Kullanıcıdan önce bir cümle, daha sonra bir harf isteyiniz.
        Parametresi bir String ve bir char olan ve kullanıcının girdilerini alıp
        String içinde kaç adet char olduğunu return eden bir method yazınıy ve ekrana yazdırınız.
    */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız.

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        char ch = input.nextLine().charAt(0);

        System.out.println(getCharNumber(text, ch));

    }

    public static int getCharNumber(String str, char ch){
        int chrCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch)
                chrCount++;
        }
        return chrCount;
    }
}


