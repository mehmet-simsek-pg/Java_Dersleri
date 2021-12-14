package gun22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _05_ArrayList {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cümle girmesini isteyin. Bu cümleyi harf harf  tersten yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle yazin");
        String cumle = scanner.nextLine();

        String[] array = cumle.split("");
        ArrayList<String> list = reverseArray(array);
        arrayYazma(list);

    }
    public static ArrayList<String> reverseArray (String[]array){

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        Collections.reverse(list);
        return list;
    }
    public static void arrayYazma(ArrayList<String>list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
