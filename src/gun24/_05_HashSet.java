package gun24;

import java.util.Arrays;
import java.util.HashSet;

public class _05_HashSet {
    public static void main(String[] args) {
        /*
        0-10 arasi random sayilarla 10 elemanli bir hashSeti doldurun
         */

        HashSet<Integer> randomSet = new HashSet<>();

        while (randomSet.size()<10){

            int num = (int) (Math.random()*10);
            randomSet.add(num);
        }
        System.out.println("randomSet = " + randomSet);

        //olusturdugumuz bu seti bir diziye atalim.

        Integer[] array = new Integer[randomSet.size()];

        // 1. yol
        int index = 0;
        for (Integer num: randomSet){
            array[index] = num; // HashSet icinden gelen her bir numarayi
            // arrayin bir index ine atiyor
            index++;
        }
        System.out.println("array = " + Arrays.toString(array));

        // 2. yol
        Integer[] array2 = randomSet.toArray(new Integer[randomSet.size()]);
        // toArray() metodu burda hashSet i arraye cevirip arrayin icine atti
        // split() metodu gibi düsünebiliriz

        System.out.println("array2 = "+Arrays.toString(array2));



    }
}
