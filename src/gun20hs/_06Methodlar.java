package gun20hs;

import java.util.Scanner;

public class _06Methodlar {


    public static void main(String[] args) {

        // girilen bir sayinin karesini veren method yazin
        // methodlara disaridan veriler parametre ile aktarilir

        System.out.println(karesi(2));
        int k = karesi(5);
        System.out.println(k);
    }

    public static int karesi(int n){
        return n*n;
    }



}
