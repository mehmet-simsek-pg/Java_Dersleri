package gun25.proje1Solutions;

import java.util.Arrays;
import java.util.Scanner;

public class BenzerleriSil {

    /*
        Kullanıcının 1er bosluk ile gireceği belirsiz sayıdaki integer değerleri nextLine(); ile okutun.
        girilen bu metndeki sayılardan benzer olanlardan yalnız birisi olacak şekilde bir int array'e atın
        ve bu arrayi sıralı bir şekilde ekrana yazdırın.

        Örnek:  input:  1 2 1 5 3 1 4 4 2 2 3 3 3 4 4 4 5 5 5 (enter)
                output: [1, 2, 3, 4, 5]   seklinde olmali

    */
    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.trim().split(" ");
        int[] intArray = new int[strArr.length];
        int intArraIndex = 0;
        for (String s : strArr) {
            int val = Integer.parseInt(s);
            if (!varmi(intArray, val)){
                intArray[intArraIndex++] = val;
            }
        }
        int[] intArrayNew = new int[intArraIndex];
        for (int i = 0; i < intArraIndex; i++) {
            intArrayNew[i] = intArray[i];
        }
        Arrays.sort(intArrayNew);
        System.out.println(Arrays.toString(intArrayNew));


    }


    public static boolean varmi(int[] arr, int n){
        for (int i : arr) {
            if (i==n) return true;
        }
        return false;
    }
}
