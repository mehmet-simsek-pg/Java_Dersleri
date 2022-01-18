package gun42.extend3;

public class Main {
    static {
        System.out.println("Main static initializer");
    }

    public static void main(String[] args) {
        System.out.println("Main Basladi");
        ChildClass c = new ChildClass();
        System.out.println("Main Bitti");
    }
}
