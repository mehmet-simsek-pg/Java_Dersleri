package gun20hs;

import java.util.Arrays;

public class _08Methodlar {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(getArray(10, 20)));
        System.out.println(topla(10, 20));  // a=10, b=20

    }


    public static int topla(int a, int b){  // topla(20, 10)
        return a+b;
    }

    public static int carp(int a, int b){  // carp(10, 20)
        return a*b;
    }

    public static int[] getArray(int a, int b){
        int tpl = topla(b, a);  // topla(20, 10);
        int crp = carp(a, b);   // carp(10, 20);
        return new int[]{topla(a, b), crp};
    }

}
