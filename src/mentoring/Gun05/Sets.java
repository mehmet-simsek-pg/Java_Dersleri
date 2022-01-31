package mentoring.Gun05;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        int[] array=new int[3];
        array[0]=5;
        array[1]=4;
        array[2]=5;

        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>(List.of(4,7,2,7,9,7,4,5));
        HashSet<Integer> set3=new HashSet(Arrays.asList(3,7,4,8,9));
        for (Integer k: set2){
            System.out.print(k+" ");
        }
        System.out.println("------");

        LinkedHashSet<Integer> set4=new LinkedHashSet<>();

        set4.add(4);
        set4.add(2);
        set4.add(9);
        set4.add(6);
        set4.add(3);
        System.out.println("set4 = " + set4);

        TreeSet<Integer> set5= new TreeSet<>(set4);
        System.out.println("set5 = " + set5);

        Set<String> set6=new LinkedHashSet<>();
    }
}
