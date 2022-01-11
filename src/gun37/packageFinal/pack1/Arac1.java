package gun37.packageFinal.pack1;

import java.util.ArrayList;
import java.util.Arrays;

public class Arac1 {

    final static String name = "Java ";
    final static ArrayList<Integer> listFinal = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    static ArrayList<Integer> listNormal = new ArrayList<>(Arrays.asList(1,2,3,4,5));


    public static void main(String[] args) {
        System.out.println(name);
        //name = "Ali"; // name final oldugu icin name"e deger atanamaz
        //name = name.trim(); // name final oldugu icin name"e deger atanamaz
        System.out.println(name.trim());
        System.out.println(name.substring(1,3));

        System.out.println("------------------------");
        System.out.println(listFinal);
        // Arraylistlerin methodlari ile final olsa da islemler yapilir. Ancak o isime new ile yeni arraylist atanamaz
        listFinal.add(10);
        listFinal.remove(3);
        System.out.println(listFinal);
        //listFinal = new ArrayList<>(Arrays.asList(1,2,3)); // hata verir, final oldugu icin atama yapilamaz

        System.out.println("--------------");
        System.out.println(listNormal);
        listNormal.add(10);
        listNormal.remove(3);
        System.out.println(listNormal);
        listNormal = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(listNormal);

    }
}
