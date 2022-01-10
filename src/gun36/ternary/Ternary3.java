package gun36.ternary;

import java.util.Scanner;

public class Ternary3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        String sonuc = (num1>num2) ? num1 + ">" + num2 : num1 + "<"+ num2;
        System.out.println(sonuc);

        System.out.println( (num1>num2) ? num1 + ">" + num2 : num1 + "<"+ num2 );

        System.out.println(max(3, 6));
    }

    public static int max(int a, int b){
        return (a>b) ? a : b;
    }


}
