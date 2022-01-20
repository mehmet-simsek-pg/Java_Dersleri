package gun44.task1;

public class Main {

    public static void main(String[] args) {
        Cember c = new Cember(3);
        Daire d = new Daire(4);

        System.out.printf("Cemberin cevresi %.2f birimdir.\n", c.cevreHesapla());
        //System.out.println(c.alanHesapla());
        System.out.printf("Dairenin cevresi %.2f birimdir.\n",d.cevreHesapla());
        System.out.printf("Dairenin alani %.2f birim karedir.\n",d.alanHesapla());

        System.out.println("---------------------------");

        Dikdortgen d1 = new Dikdortgen(3, 5);
        Kare k1 = new Kare(4);

        System.out.printf("Dikdörtgenin cevresi %.2f birimdir.\n", d1.cevreHesapla());
        System.out.printf("Dikdörtgenin alani %.2f birimdir.\n", d1.alanHesapla());

        System.out.printf("Karenin cevresi %.2f birimdir.\n", k1.cevreHesapla());
        System.out.printf("Karenin alani %.2f birimdir.\n", k1.alanHesapla());
        System.out.println(d1);
        System.out.println(k1.toString());

    }
}
