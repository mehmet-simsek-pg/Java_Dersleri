package gun36.foreach;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEach4 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,7,8,12,35));

        list.removeIf(n -> n % 2 == 0 || n % 5 == 0);
        System.out.println(list);

    }
}
