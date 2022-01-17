package gun41;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02MultiCatch {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("1. Sayiyi girin : ");
            int a = sc.nextInt();

            System.out.print("2. Sayiyi girin : ");
            int b = sc.nextInt();

            System.out.println(a + "/" + b + " = " + (a / b));

        }catch (ArithmeticException e){
            System.out.println("Sayi sifira bölünmez");

        }catch (InputMismatchException e){
            System.out.println("Sayi girmeniz lazim");

        }catch (Exception e){       // genel olan bu exception en sonda yer almalidir.
            e.printStackTrace();

        }

    }
}
