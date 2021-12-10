package gun20;

import java.util.Scanner;

public class _02_MethodsReturnType {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane meyve girmesini isteyin.
        Bu meyvelerden kac tanesinde e harfi oldugunu bulan bir metot yazin.
         */

        Scanner scanner = new Scanner(System.in);
        String[] meyveler = new String[5];
        for (int i = 0; i < meyveler.length; i++) {
            System.out.println("meyve ismi");
            meyveler[i] = scanner.nextLine();
        }
        int kacTaneMeyvedeEVar = kacTanesindeEVar(meyveler);
        System.out.println("kacTaneMeyvedeEVar = " + kacTaneMeyvedeEVar);
    }
    public static int kacTanesindeEVar(String[]array){

        int eMiktari = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("e")){
                eMiktari++;
            }
        }
        return eMiktari;
    }
}
