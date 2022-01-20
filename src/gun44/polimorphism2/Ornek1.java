package gun44.polimorphism2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ornek1 {

    public static void main(String[] args) {

        /*  List
                ArrayList, LinkedList
            Set
                HashSet, LinkedHashSet, TreeSet
            Map
                HashMap, LinkedHashMap, TreeMap
         */

        List<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        yazdir(list);
        yazdir(list1);

    }


    public static void yazdir(List<Integer> list){
        list.forEach(n-> System.out.print(n + ", "));
    }
}
