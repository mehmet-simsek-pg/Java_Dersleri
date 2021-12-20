package gun24;

import java.util.*;

public class _07_HashSet {
    public static void main(String[] args) {

        //Her biri tüm veri tipleri icin kullanilabilir. Integer, String, Double...

        // HashSet kendi algoritmasina göre veriye en hizli ulasacagi sekilde siraliyor
        HashSet<Integer> integerHashSet =new HashSet<>();

        //LinkedHashSet ekleme sirasina göre siralar
        LinkedHashSet<Integer> linkedHashSet =new LinkedHashSet<>();

        //String icin alfabe sirasina göre siralar
        TreeSet<String> treeSet = new TreeSet<>();

        // Integer icin kucukten buyuge dogru siralar
        TreeSet<Integer> integerTreeSet = new TreeSet<>();

    }
}
