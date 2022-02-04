package gun55.enum1;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        Enum1 e;

        driver1("Chrome");
        driver2(Enum1.CHROME);

    }

    public static void driver1(String driver){
        switch (driver){
            case "chrome":
                System.out.println("Chrome");
                break;
            case "firefox":
                System.out.println("Forefox");
            default:
                System.out.println("Bilinmeyen");
        }
    }

    public static void driver2(Enum1 driver){
        switch (driver){
            case CHROME:
                System.out.println("Chrome");
                break;
            case FIREFOX:
                System.out.println("Firefox");
                break;
            default:
                System.out.println("Bilinmeyen");
        }
    }
}
