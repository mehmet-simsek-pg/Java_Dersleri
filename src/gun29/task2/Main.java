package gun29.task2;

public class Main {

    public static void main(String[] args) {
        Insan i1 = new Insan();
        i1.veriAta("Ali", 25);
        i1.akrabaAta("Veli", "Ahmet", "Hasan", "Ayse");

        Insan i2 = new Insan();
        i2.veriAta("Hasan", 35);
        i2.akrabaAta("Fatma", "Mehmet", "Ali");

        i1.adiniSoyle();
        i1.akrabalariniSoyle();
        i2.adiniSoyle();
        i2.akrabalariniSoyle();

        insanSayisi();


    }

    public static void insanSayisi(){
        System.out.println(Insan.count);
    }
}
