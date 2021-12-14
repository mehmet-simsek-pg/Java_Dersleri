package gun22;

import java.util.ArrayList;
import java.util.Collections;

public class _02_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(44);
        list.add(78);
        list.add(76);

        System.out.println("list in ilk hali= " + list);

        // Diziler icin Arrays.sort() metodu yerine listler icin bu kullanilir
        Collections.sort(list);
        System.out.println("list e düzenlendikten sonra = " + list);

        Collections.reverse(list);
        System.out.println("list yi tersten yazdirma = " + list);

        System.out.println("list max deger = " + Collections.max(list));
        System.out.println("list min deger= " + Collections.min(list));

        Collections.fill(list,3); // listedeki tüm verilerin yerine yazdigimiz veriyi ekler
        System.out.println("list = " + list);

        Collections.replaceAll(list,3,45); // Liste icindeki eski verinin yerine yeni veriyi ekler
        System.out.println("list = " + list);
    }
}
