package gun29.task3;

public class Main {
    public static void main(String[] args) {
        Insan i1 = new Insan();
        i1.veriAta("Ali", 20);

        Insan i2 = new Insan();
        i2.veriAta("Hasan", 50);

        Insan i3 = new Insan();
        i3.veriAta("Ayse", 45);

        Insan dede = new Insan();
        dede.veriAta("Dede", 80);

        //i1.babaAta(i2);
        i1.anneAta(i3);
        i2.babaAta(dede);

        i1.senKimsin();
        i1.babanKim();
        i1.annenKim();
        i1.baba.babanKim();
        i2.babanKim();

    }
}
