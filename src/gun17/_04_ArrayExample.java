package gun17;

import java.util.Scanner;

public class _04_ArrayExample {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cümle girmesini isteyin
        bu cümledeki kelime sayisini bulun
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cümle yazin");
        String str = scanner.nextLine();
        String[] cumle = new String[str.length()];
        int kelimeSayisi = 1;
        for (int i = 0; i < cumle.length; i++) {
            cumle[i]= String.valueOf(str.charAt(i));
            if (str.charAt(i)==' '){
                kelimeSayisi++;
            }
        }
        for (String harf : cumle){
            System.out.print(harf+" ");
        }
        System.out.println("kelimeSayisi = " + kelimeSayisi);
    }
}
