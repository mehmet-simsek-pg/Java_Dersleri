package gun15hs;

import java.util.Scanner;

public class _01SwitchCase1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int gun = sc.nextInt();

        if (gun==1)
            System.out.println("p.tesi");
        else if (gun == 2)
            System.out.println("sali");
        //.....

        if (gun>5)
            System.out.println("haftasonu");
        else
            System.out.println("haftaici");
        //.....

        int gun1 = (int)(Math.random()*7)+1;
        /*
            [0, 1)*10  = [0, 10) + 1 = [1, 11)
         */
        switch (gun1){
            case 1:
                System.out.println("p.tesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("c.tesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
        }


    }
}
