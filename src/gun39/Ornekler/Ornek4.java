package gun39.Ornekler;

import java.util.Scanner;

public class Ornek4 {
     /*
        Kullanicidan bir cümle alin
        bu cümleyi StringBuilder"a ekleyin
        sonra kullanicidan ayri bir kelime ve hangi indexden itibaren ekleneceini alin
        bu kelimeyi istenilen indexden itibaren ekleyin ve ekrana yazin

     */

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Cümle Giriniz : ");
            String cumle = sc.nextLine();
            StringBuilder str = new StringBuilder(cumle);

            System.out.print("Kelime Giriniz : ");
            String kelime = sc.next();
            int index;
            System.out.print("Index Giriniz : ");
            index = sc.nextInt();

            str.insert(index, kelime);
            System.out.println(str);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
