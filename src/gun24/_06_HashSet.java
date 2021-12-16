package gun24;

import java.util.ArrayList;
import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {

        HashSet<Integer> integerHashSet = new HashSet<>();
        // bu sadece integer veri tutabilir.

        HashSet<String> stringHashSet = new HashSet<>();
        // bu ise sadece String  veri tutar

        HashSet<Object> objectHashSet = new HashSet<>(); // Object burada veri tipidir.
        ArrayList<Object> objectArrayList = new ArrayList<>();
        Object[] array = new Object[5];

        objectHashSet.add(34);
        objectHashSet.add("mehmet");
        objectHashSet.add(true);
        objectHashSet.add(3.14);

        System.out.println("objectHashSet = " + objectHashSet);

    }
}
