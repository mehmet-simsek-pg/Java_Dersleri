package mentoring.Gun06;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("BMW",5);
        map.put("MERCEDES",4);
        map.put("TOYOTA",6);
        map.put("HONDA",7);

        System.out.println("map.keySet() = " + map.keySet());
        System.out.println("map.values() = " + map.values());
        System.out.println("map.size() = " + map.size());
        System.out.println("map = " + map);
        System.out.println("map.get() = " + map.get("TOYOTA"));
        map.replace("BMW",5,9);
        System.out.println("map.get(\"BMW\") = " + map.get("BMW"));
        map.replace("BMW",2);
        System.out.println("map.get(\"BMW\") = " + map.get("BMW"));
        map.remove("HONDA");
        System.out.println("map = " + map);
    }
}
