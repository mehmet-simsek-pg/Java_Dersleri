package mentoring.Gun04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEg_01 {

    //    Write a Java program with following option
//    a. Accept elements of a list
//    b. Display elements of a list
//    c. Search the element within list given by user
//    d. Sort the list using sort method
//    Write methods for all options. The methods should be static and have one parameter name of the list.
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        String devammi="";
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Bir sayi girin");
        do {
            acceptElements(list, scanner.nextInt());
            System.out.println("Yeni sayi eklemek istermisiniz? E/H");
            devammi= scanner1.nextLine();
            if (devammi.equalsIgnoreCase("E")){
                System.out.println("Yeni sayiyi girin");
            }
        }while(devammi.equalsIgnoreCase("E"));
        yazdir(list);
        int index= varmi(list,6);
        System.out.println(index);
        sirala(list);
        System.out.println("list = " + list);

    }
    public static void acceptElements(ArrayList<Integer> list, Integer element){
        list.add(element);
    }

    public static void yazdir(ArrayList<Integer> list){
        System.out.println(list);
    }

    public static int varmi(ArrayList<Integer> list, Integer element){
        int index=-1;
        if (list.contains(element)){
            index=list.indexOf(element);
        }
        return index;
    }

    public static void sirala(ArrayList<Integer> list){
        Collections.sort(list);
    }
}
