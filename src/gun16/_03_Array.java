package gun16;

import java.util.Scanner;

public class _03_Array {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alarak bu sayi uzunlugunda int bir dizi olusturun.
        Dizinin elemanlarini kullanicinin girecegi sayilarla doldurun.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac elemanli dizi olsun");
        int num = scanner.nextInt();

        int[] nums = new int[num];

        for (int i = 0; i < nums.length; i++) {
            // diziyi doldurmak icin olan döngü
            System.out.println("numara girin");
            nums[i]= scanner.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            // Diziyi yazdirmak icin gerekli döngü
            System.out.print(nums[i]+" ");
        }

    }
}
