package gun14;

public class _04_ForLoop {
    public static void main(String[] args) {
        /*
        Carpim tablosundaki 2 ler sütununu ekrana yazdirin.
        2x1=2
        2x2=4
        2x3=6
        2x4=8
        2x5=10
        2x6=12
        2x7=14
        2x8=16
        2x9=18
        2x10=20
         */

        for (int i = 1; i <= 10; i++) {
            System.out.println("2 x " + i + " = " + (i * 2));
        }
    }
}
