package gun36.modifiers.classes.package1;

public class Main1 {

    public static void main(String[] args) {

        // public oldugu icin her yerden ulasilir
        PublicClass p = new PublicClass();

        // default oldugu icin ayni package"dan ulasilir
        // Main1 ve DefaultClass ayni package"da
        DefaultClass d = new DefaultClass();

    }
}
