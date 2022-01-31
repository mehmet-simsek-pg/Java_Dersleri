package mentoring.Gun03;

import java.util.Arrays;

public class ArraysEg04 {
    public static void main(String[] args) {
//        Asagidaki Arrayi 0 - 20 arasindaki sayilarla random doldurup kac tanesinin cift sayi oldugunu bulunuz

        int[][] array = new int[3][5];
        array[0] =new int[3];
        array[1] =new int[8];
        array[2] =new int[6];
        int sayi=0;
        for (int satir = 0; satir < array.length; satir++) {
            for (int sutun = 0; sutun < array[satir].length; sutun++) {
                sayi=(int)(Math.random()*20);
                array[satir][sutun]=sayi;
            }
        }

        int count=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
                if (array[i][j]%2==0){
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("count = " + count);


    }
}
