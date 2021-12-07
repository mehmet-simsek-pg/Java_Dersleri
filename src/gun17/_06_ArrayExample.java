package gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _06_ArrayExample {
    public static void main(String[] args) {

        /*
        Kullanicidan 5 tane sayi alin ve en büyük sayiyi ekrana yazdirin
         */

        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("sayi girin");
            nums[i]= scanner.nextInt();
        }

        Arrays.sort(nums); // bunun yerine for döngüsü ve if sarti ile en büyük sayiyi buluyorduk
        // sort() metodu bunu tek satirda bizim yerimize yapti. Diziyi kucukten büyüge siraladi

        int enb = nums[nums.length-1]; // dizinin indis degerleri 0 dan baslar
        // uzunluk saymaya ise 1 den baslar. Bu nedenle burada dizinin son elemani nums[4] tür
        // dizinin length ise 5 oldugu icin nums.length-1 yaptik

        System.out.println("enb = " + enb);

    }
}
