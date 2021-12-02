package gun14;

public class _01_ForLoop {
    public static void main(String[] args) {

        int intDeger = 0;

        while (intDeger<10){
            System.out.println("i = " + intDeger);
            intDeger++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 10; i >0 ; i--) {
            System.out.println("i = " + i);
        }
        /*
        while döngüsü baslangic bitis degeri belli olmayan döngü icin kullanilir
        for döngüsü ise baslangi ve bitis degeri belli olan durumlar icin kullanilir
         */
    }
}
