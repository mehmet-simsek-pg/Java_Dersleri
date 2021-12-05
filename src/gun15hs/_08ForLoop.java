package gun15hs;

public class _08ForLoop {

    public static void main(String[] args) {

        // döngü sayisi biliniyor ise for kullanilir

        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int i = 0;
        for (; i < 5;) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // infinite loop
        for (;;) {
            System.out.print("*");
            if (i++>50)
                break;
        }
    }
}