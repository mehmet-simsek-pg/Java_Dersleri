package gun30Ment.gun301;

import java.util.ArrayList;
import java.util.Arrays;

public class _02Printf {

    public static void main(String[] args) {
        int i = 10;
        double d = 1.237567;
        String s = "java";
        System.out.println(i);

        // %d : int     %f  double, float   %s : string
        System.out.printf("Bugün %d lira kazandim\n", i);
        System.out.printf("%s%d Bugün %f lira kazandim\n", s, i, d);

        System.out.printf("%10s%d %f\n", s, i, d);
        System.out.printf("%-10s%d %f\n", s, i, d);
        System.out.printf("%-10s%d %.2f\n", s, i, d);


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        for (Integer ii : list) {
            System.out.printf("%-5s", ii);
        }

    }
}
