package gun30Ment.gun302;

import java.util.ArrayList;
import java.util.Arrays;

public class _01ArrayList2D {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[][] arr2 = {{1, 2}, {4, 5, 6}};

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);

        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        ArrayList<Integer> l3 = new ArrayList<>(Arrays.asList(100, 200));

        list2.add(l1);
        list2.add(l2);
        list2.add(l3);

        for (ArrayList<Integer> list : list2) {
            for (Integer integer : list) {
                System.out.printf("%-10d", integer);
            }
            System.out.println();
        }

        System.out.println("---------------------------");
        l2.forEach(n -> System.out.println(n));
        l2.forEach(System.out::println);

        l2.forEach(n ->
                {
                    int m = n * n;
                    System.out.print(m + ", ");
                });     // lambda yöntemi

        System.out.println();

        l2.forEach(_01ArrayList2D::yaz);            // method gösterimi

        l2.forEach(n -> yaz(n));

        System.out.println("--------------------------------------");
        l2.forEach(n ->
        {
            System.out.print(n + " : ");
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        });
    }

    public static void yaz(int n) {
        System.out.println(n);
    }
}
