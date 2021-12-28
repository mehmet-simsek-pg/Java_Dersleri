package gun30Ment.gun301;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class _05Set {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,8,12,1234,800,56,1));
        LinkedHashSet<Integer> set2  = new LinkedHashSet<>(list);

        // iterator, sayan
        Iterator<Integer> it = set2.iterator();

        System.out.println(set2);
        while (it.hasNext()) {
            Integer a = it.next();
            if (a % 2 == 0)
                it.remove();
            //System.out.print(it.next() + ", ");

        }
        System.out.println();
        System.out.println(set2);

        Iterator<Integer> it2 = set2.iterator();
        System.out.println(it2.next());
        System.out.println(it2.next());
        System.out.println(it2.next());
        System.out.println(it2.next());
        //System.out.println(it2.next());   // hata verir, cünkü suan set1"in 4 elemani var

        Iterator<Integer> itList = list.iterator();
        while (itList.hasNext())
            System.out.println(itList.next());

    }
}
