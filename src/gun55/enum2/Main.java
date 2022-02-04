package gun55.enum2;

public class Main {

    public static void main(String[] args) {
        Book sef = Book.SEFILLER;
        Book1 sef1 = Book1.SEFILLER;

        Book sb = Book.SB;

        sef.kitapBilgisi();
        sef1.kitapBilgisi();
        sb.kitapBilgisi();

        for (Book value : Book.values()) {
            System.out.println(value);
        }

        Book.valueOf("SB").kitapBilgisi();


    }
}
