package gun20;

import java.util.Scanner;

public class _03_MethodsReturnType {
    public static void main(String[] args) {

        /*
        Kullanicidan 5 tane sehir, 5 tane isim ve 5 tane meyve girmesini
        isteyin. Bunlardan kac tanesinde e harfi oldugunu bulun.
                 */


        int meyve = kacTanesindeEVar("meyve girin");
        int isim = kacTanesindeEVar("isim girin");
        int sehir = kacTanesindeEVar("sehir girin");

        System.out.println("meyve = " + meyve);
        System.out.println("isim = " + isim);
        System.out.println("sehir = " + sehir);


    }
    public static int kacTanesindeEVar(String str){

        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];

        int kacTanesindeE = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(str);
            array[i] = scanner.nextLine();
            if (array[i].contains("e")){
                kacTanesindeE++;
            }
        }
        return kacTanesindeE;
    }

}
