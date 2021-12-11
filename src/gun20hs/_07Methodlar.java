package gun20hs;

import java.util.Arrays;
import java.util.Scanner;

public class _07Methodlar {

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("2 int girin");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(topla(m, n));
        */
        int[] retArr = arrayYap(5);
        System.out.println(Arrays.toString(retArr));


        System.out.println(Arrays.toString(arrayYap(5)));
    }

    public static int topla(int n, int m){
        return n+m;
    }

    public static int[] arrayYap(int num){
        Scanner sc = new Scanner(System.in);
        System.out.println("int girin");
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }


}
