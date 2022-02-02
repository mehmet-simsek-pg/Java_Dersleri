package gun53.paket6;

public class Main {
    /*
        Bir arac nesnesi
            isim
            yolcuKapasitesi
            yolcular

            yolcuListesi

        ve insan nesnesi olusutun.
            isim

        Araca insan binip insin
     */

    public static void main(String[] args) {

        Arac dolmus = new Arac("Dolmus", 3);
        Insan y1 = new Insan("A");
        Insan y2 = new Insan("B");
        Insan y3 = new Insan("C");
        Insan y4 = new Insan("D");
        Insan y5 = new Insan("E");

        dolmus.yolcuBindir(y1);
        dolmus.yolcuBindir(y2);
        y3.aracaBin(dolmus);
        dolmus.yolcuBindir(y4);
        dolmus.yolcuListesi();
        dolmus.yolcuIndir(y5);
        dolmus.yolcuIndir(y3);
        dolmus.yolcuListesi();
        System.out.println(dolmus);








    }
}
