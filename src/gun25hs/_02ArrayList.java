package gun25hs;

import java.util.ArrayList;
import java.util.Scanner;

public class _02ArrayList {

    public static void main(String[] args) {

        ArrayList list1;
        ArrayList<Integer> list2;               //  int  -> wrapper class  Integer
        ArrayList<Double> list3;        //[1.3, 2.5, 6.7]

        ArrayList<Scanner> list4;       //[sc1, sc2, ]     Scanner sc1 = new Scanner(System.in);

        ArrayList<_02ArrayList> list5;
        _02ArrayList l1 = new _02ArrayList();
        _02ArrayList l2 = new _02ArrayList();


        //##########################

        ArrayList<Integer> list10 = new ArrayList<>();
        list10.add(1);
        list10.add(2);
        list10.add(1,3);
        System.out.println(list10);     //toString();






    }
}
