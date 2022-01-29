package mentoring.Gun03;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {

        int[] liste=new int[3];
        liste[0]=7;
        liste[1]=10;
        System.out.println(Arrays.toString(liste));

        String[] dizi=new String[2];
        dizi[0]="Cicek";
        System.out.println(Arrays.toString(dizi));

        int[] dizi1={1,5,3,8,6,9,0};
        //dizi1[7]=8;
        System.out.println(Arrays.toString(dizi1));
        dizi1[2]=8;
        System.out.println(Arrays.toString(dizi1));
        Arrays.sort(dizi1);
        System.out.println(Arrays.toString(dizi1));
        System.out.println(Arrays.binarySearch(dizi1,10));
        Arrays.fill(dizi1,7);
        System.out.println(Arrays.toString(dizi1));

        int[][] tablo={{1,2,3}, {78,34,71}, {1,56,90}};
        int[][] tablo1=new int[2][3];
        tablo1[0][0]=3;
        tablo1[0][1]=5;
        tablo1[0][2]=8;
        tablo1[1][0]=9;
        tablo1[1][1]=1;
        tablo1[1][2]=4;

        System.out.println(tablo1[1][2]);

        for (int satir=0; satir<2; satir++){
            for (int sutun=0; sutun<3; sutun++){
                System.out.print(tablo1[satir][sutun]+" ");
            }
            System.out.println();
        }



    }
}
