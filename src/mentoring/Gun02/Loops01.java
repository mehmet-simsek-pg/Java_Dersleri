package mentoring.Gun02;

import java.util.ArrayList;
import java.util.List;

public class Loops01 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList(List.of(1,2,3,4,5));
//        for (int i = 0; i <list.size() ; i=i+3) {
////            kod blogu
//            System.out.println(i);
//        }
//
//
//        for (Integer eleman: list){
//            System.out.println(eleman);
//        }
//
        int count=0;
        while (count<0){

            System.out.println(list.get(count));
            count++;
        }
//
        do {
            System.out.println(list.get(count));
            count++;
        }while (count<1);



    }
}
