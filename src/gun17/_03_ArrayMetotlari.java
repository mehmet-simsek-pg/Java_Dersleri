package gun17;

import java.util.Arrays;

public class _03_ArrayMetotlari {
    public static void main(String[] args) {

        /*
        5 elamanli bir dizi olusturun ve elemanlari kucukten büyüge siralayin.
         */

        int[] nums ={23,34,12,7,88};

        System.out.println("sort() tan önce=> "+Arrays.toString(nums));

        Arrays.sort(nums);
        // sort() metodu dizinin elemanlari kücükten büyüge siralar.
        // bu kullanim sout icerisine yazilmaz

        System.out.println("sort() tan sonra=> "+Arrays.toString(nums));

        int result = nums[0]+23;
        System.out.println("result = " + result);

    }
}
