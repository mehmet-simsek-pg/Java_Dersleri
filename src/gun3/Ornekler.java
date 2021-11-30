package gun3;

public class Ornekler {

    public static void main(String[] args) {

        int num = 5;
        boolean deger = false;

        //Bir günde kac saat vardir. Bunu tanimlayiniz ve bunu ekrana yazdirin.

        int günSaat = 24; //camel case kurali
/*
        System.out.print("Bir günde " + günSaat + " saat vardir.");

        System.out.print("Bir günde kac saat vardir: ");
        System.out.println(günSaat);

        System.out.println("Bir gunde 24 saat vardir");
        System.out.println("Bir gunde " + 24 + " saat vardir");

        //Dolar kurunu ekrana yazdirin. (9.5)

        double dolarKuru = 9.5;

        System.out.println("Dolar kuru: " + dolarKuru);
*/
        int sayi1 = 15;
        int sayi2 = 25;

        int toplam = sayi1 + sayi2;

        System.out.println("toplam= " + toplam);

        //45 ve 135 i toplayip ekrana yazdirin.

        int sayi3 = 45;
        int sayi4 = 135;

        int toplam2 = sayi3 + sayi4;
        System.out.println("toplam = "+toplam2);

        System.out.println("toplam= "+(sayi3+sayi4));

        System.out.println(sayi3+sayi4);

        int cikarma = sayi3 - sayi4;
        System.out.println("Cikarma sonucu= "+cikarma);

        System.out.println(1-3);

        System.out.println((-45)-(-135));

        int carpma = sayi3 * sayi4;
        System.out.println("carpma= "+carpma);

        double sayi5 = 45.0;
        double sayi6 = 135.0;

        double bolme = sayi5 / sayi6;
        System.out.println("bolme= "+bolme);

        int bolme2 = sayi4/sayi3;
        System.out.println(bolme2);

        System.out.println("sonuc= "+(12*24+45-12/10));

        int num1 = 12;
        int num2 = 6;
        boolean result = num1<num2;

        System.out.println(result);
    }

}
