package gun24;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {

        int num = 1 ; // num degiskeni bir tane veri tutabilir
        int[] nums = new int[5]; // nums degiskeni 5 tane veri tutabiliyor
        int[][] numsArray = new int[5][5]; // numsArray degiskeni 25 tane veri tutabiliyor

        ArrayList<Integer> list = new ArrayList<>(); // list degiskeni istedigim veri tutabiliyor

        HashSet<Integer> hashSet = new HashSet<>();
        // list lerden tek farki tekrar eden veri tutmaz

        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(5);
        hashSet.add(3); // tekrar eden veri oldugu icin eklemez

        System.out.println("hashSet = " + hashSet);

    }
}
