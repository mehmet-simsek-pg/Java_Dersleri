package gun26;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _03_Map {
    public static void main(String[] args) {

        // HashMap in kendi algoritmasi vardir ona göre siralar
        Map<Integer,String> hashMap = new HashMap<>();

        hashMap.put(1,"dog");
        hashMap.put(7,"cat");
        hashMap.put(5,"kus");
        hashMap.put(8,"yilan");
        System.out.println(hashMap);

        //LinkedHashMap: kullanicinin girdigi siraya göre verileri tutar
        Map<Integer,String> linkedMap = new LinkedHashMap<>();

        linkedMap.put(9,"dog");
        linkedMap.put(2,"cat");
        linkedMap.put(5,"kus");
        linkedMap.put(8,"yilan");
        System.out.println(linkedMap);

        //TreeMap: keylerin alfabetik ya da numerik olarak siralar.
        Map<Integer,String> treeMap = new TreeMap<>();

        treeMap.put(8,"dog");
        treeMap.put(7,"cat");
        treeMap.put(5,"kus");
        treeMap.put(4,"yilan");
        System.out.println(treeMap);

    }
}
