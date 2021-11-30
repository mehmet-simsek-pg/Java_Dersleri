package gun4;

public class _01_String {
    public static void main(String[] args) {
       // System.out.println("Bugün hava cok güzel");

        String mesaj = "Bugün hava cok güzel";
        //System.out.println(mesaj);

        String str = "Adem";
       // System.out.println(str);

        //Aysenin toplamda 10000 lirasi vardir. Ayse 5000 lira ile tatil yapmistir.
        // Kalan parasi ile de hisse senedi almistir. Ama aysenin toplamda 3000 lira
        // bankaya borcu vardir. Ayse bu parayi odemek icin arkadasindan 4000 lira borc alir.
        // Aysenin elinde kalan parayi yazdiriniz

        String mesaj1 = "Ayse'nin elinde toplam";
        String mesaj2 = "para kalmistir.";
        int toplamPara = 10000;
        int tatilParasi = 5000;
        int hisseSenedi = 5000;
        int bankaBorcu = 3000;
        int alinanBorc = 4000;
        int kalanPara = toplamPara-tatilParasi-hisseSenedi-bankaBorcu+alinanBorc;

        System.out.println(mesaj1+" "+kalanPara+" "+mesaj2);






    }
}
