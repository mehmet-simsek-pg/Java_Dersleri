package mentoring.Gun04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList01 {

//    int[] array=new int[6];
//    ArrayList<Integer> list = new ArrayList<>();
//    ArrayList<Integer> list = new ArrayList<>(3);
//    ArrayList<Integer> list1= new ArrayList(Arrays.asList(array));
//    ArrayList<Integer> list2= new ArrayList<>(list1);
//    ArrayList<Integer> list3= new ArrayList<>(List.of(2,5,7,8,4,5));

    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>(5);
        List<Integer> list3=new ArrayList<>();

        list1.add(3);
        list1.add(8);
        list1.add(2);
        List<Integer> list4=new ArrayList<>(list1);

        int[] array=new int[6];
        ArrayList<Integer> list5=new ArrayList(Arrays.asList(array));
        ArrayList<String> list6=new ArrayList<>(List.of("Ahmet","Mehmet","Kirmizi"));

       int boyut= list1.size();

       boolean varmi= list1.contains(10);
       Integer deger= list1.get(1);

       list1.add(2,6);
       list1.addAll(list3);
       boolean bosmu=list1.isEmpty();
       list1.clear();
       list1.indexOf(3);
       list1.remove(0);
       list1.removeAll(list4);
       list1.set(0,25);
    }
}
