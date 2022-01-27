package gun49.ornek1;


public class Main {


    public static void main(String[] args) {
        Insan ali = new Insan("Ali", true);
        Insan veli = new Insan("Veli", false);
        Arac kepce = new Arac("Kepce");
        Arac kamyon = new Arac("Kamyon");

        ali.aracBin(kepce);
        ali.sur();
        ali.aracIn();
        ali.dur();
        ali.aracIn();

        ali.aracBin(kamyon);
        System.out.println(ali);
        veli.AA(kamyon);
        System.out.println(ali);


    }


}
