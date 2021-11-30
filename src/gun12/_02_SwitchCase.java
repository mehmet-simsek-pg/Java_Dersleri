package gun12;

import java.util.Scanner;

public class _02_SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bugün haftanin hangi günü?");
        String day = scanner.nextLine();

        switch (day) {
            case "Pazartesi":
                System.out.println("1. gün");
                break;
            case "Sali":
                System.out.println("2. gün");
                break;
            case "Carsamba":
                System.out.println("3. gün");
                break;
            case "Persembe":
                System.out.println("4. gün");
                break;
            case "Cuma":
                System.out.println("5. gün");
                break;
            case "Cumartesi":
                System.out.println("6. gün");
                break;
            case "Pazar":
                System.out.println("7. gün");
                break;
            default:
                System.out.println("Gecersiz gün ismi");
        }
    }
}
