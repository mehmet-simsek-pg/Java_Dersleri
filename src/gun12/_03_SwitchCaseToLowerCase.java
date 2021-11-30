package gun12;

import java.util.Scanner;

public class _03_SwitchCaseToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bugün haftanin hangi günü?");
        String dayGirilen = scanner.nextLine();
        String day = dayGirilen.toLowerCase();

        switch (day) {
            case "pazartesi":
                System.out.println("1. gün");
                break;
            case "sali":
                System.out.println("2. gün");
                break;
            case "carsamba":
                System.out.println("3. gün");
                break;
            case "persembe":
                System.out.println("4. gün");
                break;
            case "cuma":
                System.out.println("5. gün");
                break;
            case "cumartesi":
                System.out.println("6. gün");
                break;
            case "pazar":
                System.out.println("7. gün");
                break;
            default:
                System.out.println("Gecersiz gün ismi");
        }
    }
}
