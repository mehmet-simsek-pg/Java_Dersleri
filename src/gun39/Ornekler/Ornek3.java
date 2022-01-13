package gun39.Ornekler;

import java.util.Scanner;

public class Ornek3 {
     /*
        Kullanicidan bir cümle alin
        bu cümleyi StringBuilder"a ekleyin
        sonra kullanicidan ayri bir kelime ve hangi indexden itibaren ekleneceini alin
        bu kelimeyi istenilen indexden itibaren ekleyin ve ekrana yazin

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cümle Giriniz : ");
        String cumle = sc.nextLine();
        StringBuilder str = new StringBuilder(cumle);
        // StringBuilder str = new StringBuilder();
        // str.append(cumle);
        System.out.print("Kelime Giriniz : ");
        String kelime = sc.next();
        int index;
        try {
            System.out.print("Index Giriniz : ");
            index = sc.nextInt();
        }catch (Exception e){
            index = 0;
        }

        try {
            str.insert(index, kelime);
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("Index hatasi. Ekleme Yapilmadi");
        }
        System.out.println(str);

    }
}
