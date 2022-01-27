package gun49.ornek2;


public class Main {


    public static void main(String[] args) {
        Insan ali = new Insan("Ali", true);
        Insan veli = new Insan("Veli", false);
        Arac kepce = new Arac("Kepce");
        Arac kamyon = new Arac("Kamyon");

        new Insan("Ali", true).aracBin(kepce).sur().aracIn().dur().aracIn();
        /*
        ali.aracBin(kepce);
        ali.sur();
        ali.aracIn();
        ali.dur();
        ali.aracIn();

         */


        System.out.println(ali);


    }


}
