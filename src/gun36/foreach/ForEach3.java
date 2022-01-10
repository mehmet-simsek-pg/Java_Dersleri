package gun36.foreach;

import java.util.HashMap;
import java.util.Map;

public class ForEach3 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        System.out.println("------------------");

        map.forEach((k, v) -> System.out.println(k + ", " + v));

    }
}
