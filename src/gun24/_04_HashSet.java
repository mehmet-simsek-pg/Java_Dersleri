package gun24;

import java.util.Arrays;
import java.util.HashSet;

public class _04_HashSet {
    public static void main(String[] args) {

        HashSet<Integer> hashSet1 = new HashSet<>(Arrays.asList(3,4,5));

        HashSet<Integer> hashSet2 = new HashSet<>(Arrays.asList(5,6,7,8));

        // bu iki hash seti birletirme
        HashSet<Integer> birlesikSet = new HashSet<>();
        birlesikSet.addAll(hashSet1); // önce 1. seti ekledi
        birlesikSet.addAll(hashSet2); // sonra 2. seti ekledi
        System.out.println("birlesikSet = " + birlesikSet);

        // bu iki hash setin farkini bulalim
        HashSet<Integer> farkSet = new HashSet<>(hashSet1); // farkSet.addAll(hashSet1)
        farkSet.removeAll(hashSet2); // farkSet degiskenine hashSet1 i eklemistik üst satirda
        System.out.println("farkSet = " + farkSet);
        //ya da  hashSet1.removeAll(hashSet2); ama bunu yaptigimiz zaman hashSet1 icindeki 5 artik kaldirilir

        //ortak elemanlari bulma
        HashSet<Integer> ortakSet = new HashSet<>(hashSet1);
        ortakSet.retainAll(hashSet2);
        System.out.println("ortakSet = " + ortakSet);

    }
}
