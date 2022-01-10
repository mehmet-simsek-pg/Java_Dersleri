package gun36.foreach;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEach1 {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,7,8,12,35));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();

        for (Integer integer : list) {
            System.out.print(integer + ", ");
        }
        System.out.println();

        // lambda    n -> .....
        list.forEach(integer -> System.out.print(integer + ", "));
        System.out.println();


    }

    public static void yaz(int integer){
        System.out.print(integer + ", ");
    }
}
