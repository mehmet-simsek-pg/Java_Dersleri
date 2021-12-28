package gun30Ment.gun302;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class _04Map {

    public static void main(String[] args) {
        /*
        HashMap<String, ArrayList<Integer>> map = new HashMap<>(){{
            put("bir", getArrayList(10, 20, 4));
            put("iki", getArrayList(50, 100, 10));
            put("uc", getArrayList(10, 100, 7));

        }};
         */

        HashMap<String, ArrayList<Integer>> map = new HashMap<>();

        ArrayList<Integer> l1 = getArrayList(10, 50, 7);
        ArrayList<Integer> l2 = getArrayList(10, 100, 10);
        ArrayList<Integer> l3 = getArrayList(50, 100, 5);


        map.put("bir", l1);
        map.put("iki", l2);
        map.put("uc", l3);


        System.out.println(map);
        System.out.println("------------------------------");
        for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

        System.out.println("---------------------");
        for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()){
            int toplam = 0;
            int sayi = 0;

            System.out.printf("%-10s", entry.getKey());
            for (Integer integer : entry.getValue()) {
                toplam += integer;
                sayi++;
                System.out.printf("%-5d ", integer);
            }
            System.out.printf("%5.2f\n", ((double)toplam/sayi));

        }
    }

    public static ArrayList<Integer> getArrayList(int min, int max, int n){
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            list.add(r.nextInt(min, max));
        }
        return list;
    }
}
