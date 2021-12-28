package gun30Ment.gun302;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.TreeSet;

public class _051Map {
    public static void main(String[] args) {
        /**
         * elemanlari 0-20 arasinda olan 100 elemanli bir arrayList olusturun
         * bu arraylistlerin elemanlarini hangi sayidan, kac tane var seklinde map"da kazdedin
         * [1,1,2,3,4,5,3,4]
         * {1=2, 2=1, 3=2, 4=2, 5=1}
         */
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> list = getArrayList(0, 20, 100);
        System.out.println(list);
        TreeSet<Integer> set = new TreeSet<>(list);
        System.out.println(set);

        for (Integer num : set) {
            // num[0,1...] harici elemanlari silersek listede eleman kalmaz
            // bu nedenler list degil gecici list1 tanimladik. her döngüde icine list tekrar atiliyor
            ArrayList<Integer> list1 = new ArrayList<>(list);
            list1.removeIf(n -> n!=num);
            map.put(num, list1.size());
        }
        System.out.println(map);
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
