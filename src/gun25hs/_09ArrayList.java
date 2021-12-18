package gun25hs;

import gun1.IsimYazdirma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _09ArrayList {

    public static void main(String[] args) {

        ArrayList< ArrayList<Integer> > list = new ArrayList<>();
        //int[][]

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(11,21,31));
        ArrayList<Integer> l3 = new ArrayList<>(Arrays.asList(21,22,23));
        list.add(l1);
        list.add(l2);
        list.add(l3);
        System.out.println(list);
        System.out.println(list.size());


        for (ArrayList<Integer> integers : list) {
            for (Integer integer : integers) {
                System.out.println(integer);
            }
        }

        int[] a;
        String[] b;
        Scanner[] c;
        Integer[] d;
        Double[] e;
        IsimYazdirma[] f = new IsimYazdirma[100];




    }
}
