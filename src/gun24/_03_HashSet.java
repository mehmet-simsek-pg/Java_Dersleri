package gun24;

import java.util.Arrays;
import java.util.HashSet;

public class _03_HashSet {
    public static void main(String[] args) {

        HashSet<Integer> hashSet1 = new HashSet<>(Arrays.asList(3,4,5));

        HashSet<Integer> hashSet2 = new HashSet<>(Arrays.asList(5,6,7,8));

        // bu iki hash seti birletiren bir metot yazalim
        System.out.println("birlestirilmis hali="+birlestir(hashSet1,hashSet2));

        // bu iki hash setin farkini bulalim
        System.out.println("Farklari="+fark(hashSet1,hashSet2));

        //ortak elemanlari bulan metot
        System.out.println("Ortak elemanlar="+ortakElemanlar(hashSet1,hashSet2));

    }
    public static HashSet<Integer> birlestir(HashSet<Integer> integerHashSet,HashSet<Integer> integerHashSet1){
        HashSet<Integer> birlesikSet = new HashSet<>();
        birlesikSet.addAll(integerHashSet); // önce 1. seti ekledi
        birlesikSet.addAll(integerHashSet1); // sonra 2. seti ekledi
        return birlesikSet;
    }

    public static HashSet<Integer> fark(HashSet<Integer> integers,HashSet<Integer> set){
        HashSet<Integer> farkSet = new HashSet<>(integers);
        farkSet.removeAll(set); // farkSet degiskenine hashSet1 i eklemistik üst satirda
        return farkSet;
    }
    public static HashSet<Integer> ortakElemanlar(HashSet<Integer> integers,HashSet<Integer> set){
        HashSet<Integer> ortakSet = new HashSet<>(integers);
        ortakSet.retainAll(set);
        return ortakSet;
    }
}
