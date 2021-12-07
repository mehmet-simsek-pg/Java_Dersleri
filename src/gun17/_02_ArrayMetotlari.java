package gun17;

import java.util.Arrays;

public class _02_ArrayMetotlari {
    public static void main(String[] args) {

        /*
        5 elamanli bir int dizi olusturun ve ekrana yazdirin.
         */

        int[] nums = {23,34,45,56,67};

        //1. yöntem
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        //2. yöntem
        System.out.println(Arrays.toString(nums));
        // diziyi ekrana yazdirmanin ikinci yolu
    }
}
