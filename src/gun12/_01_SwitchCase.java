package gun12;

import java.util.Scanner;

public class _01_SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bugün haftanin kacinci günü?");
        int day = scanner.nextInt();

        switch (day) {
            case 1: //1. case anlami tasimiyor
                System.out.println("Bugün pazartesi");
                break; // programin burada sonlanmasini saglar
            //break sadece switch-case e ait bir komut degil.
            case 2:
                System.out.println("Bugün sali");
                break;
            case 3:
                System.out.println("Bugün carsamba");
                break;
            case 4:
                System.out.println("Bugün persembe");
                break;
            case 5:
                System.out.println("Bugün cuma");
                break;
            case 6:
                System.out.println("Bugün cumartesi");
                break;
            case 7:
                System.out.println("Bugün pazar");
                break;
            default:
                System.out.println("Gecersiz tarih");

        }
    }
}
