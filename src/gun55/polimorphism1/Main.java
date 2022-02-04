package gun55.polimorphism1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(9);
        set1.add(10);
        set1.add(123);
        set1.add(5);
        set1.add(1002);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(2);
        set2.add(9);
        set2.add(10);
        set2.add(123);
        set2.add(5);
        set2.add(1002);

        Set<Integer> set3 = new TreeSet<>();
        set3.add(2);
        set3.add(9);
        set3.add(10);
        set3.add(123);
        set3.add(5);
        set3.add(1002);

        yazdir(set1);
    }

    public static void yazdir(Set<Integer> set){
        System.out.println(set);
    }
}
