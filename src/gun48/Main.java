package gun48;

public class Main {
    public static void main(String[] args) {
        Insan i1 = new Insan("Ali");
        Insan i2 = new Insan("Veli");
        Insan i3 = new Insan("Hasan");
        Insan i4 = new Insan("Hüseyin");
        Insan i5 = new Insan("Hüseyin");


        i1.arkadasEkle(i2);
        i1.arkadasEkle(i5);
        i3.arkadasEkle(i4);

        i1.sohbetEt(i3);
        i1.sohbetEt(i2);
        i1.sohbetEt(i5);

        i1.neYapiyorsun();
        i2.neYapiyorsun();
        i3.neYapiyorsun();
        i4.neYapiyorsun();
        i5.neYapiyorsun();

        i3.sohbetiKes();
        i1.sohbetiKes();
        i1.neYapiyorsun();
        i2.neYapiyorsun();

        sohbetEdin(i1, i2);
    }


    public static void sohbetEdin(Insan insan1, Insan insan2){
        if (insan1.arkadaslar.contains(insan2)) {
            insan1.sohbetEt(insan2);
        }
    }
}
