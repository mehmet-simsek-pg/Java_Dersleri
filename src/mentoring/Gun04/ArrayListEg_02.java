package mentoring.Gun04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEg_02 {

//    Suppose A, B, C are lists of integers.
//    The numbers in list A appear in ascending order
//    while the numbers in list B appear in descending order.
//    Write a user defined method in Java to produce third list C
//    by merging list A and B in ascending order.
//    Use A, B and C as arguments in the method.

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList(List.of(5, 9, 1, 0, 4, 8, 10));
        ArrayList<Integer> B = new ArrayList(List.of(12,5,10,7,3,6));

        Collections.sort(A);
        B=tersSirala(B);

        System.out.println(A);
        System.out.println(B);

        ArrayList<Integer> C=birlestirVeSirala(A,B);
        System.out.println(C);
    }
    public static ArrayList<Integer> tersSirala(ArrayList<Integer> list){
        ArrayList<Integer> D= new ArrayList<>();
        Collections.sort(list);
        for (int i = list.size()-1; i >=0 ; i--) {
            D.add(list.get(i));
        }
        return D;
    }

    public static ArrayList<Integer> birlestirVeSirala(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> D= new ArrayList<>();
        D.addAll(list1);
        D.addAll(list2);
        Collections.sort(D);
        return D;
    }

}
