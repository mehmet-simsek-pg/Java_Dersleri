package gun37.packageFinal.pack1;

public class Arac {


    // final son, nihai demektir. Bu deisken ayni isimle bir daha tanimlanamaz
    // final tanimli degiskenler ya ilk tanimlamada, ya constructor"da ya da initializer"da tanimlanmali
    // final degiskenler, nesne create edildiginde tanimlanmis olmasi gerekir
    // final olsa da degiskenin methodlari varsa kullanilabilir.

    int a;
    static int b;
    final int c = 1;    // final ilk tanimlamada initialize edildi
    final int d;        // final initializer"da initialize edildi
    final int e;        // final contructor"da initialize edildi
    //final int f;      // f degiskeni burada, initializer"da ya da constructor"da tanimlanmadigi icin


    {
        d = 1;
    }

    public Arac(int e) {
        this.e = e;
    }

    public void method(){
        // c = 2;  // bu satir hata verir, cünkü c final oldugu icin deger atanamaz
        //e = 10;  // bu satir hata verir, final e"nin degeri degistirilmeye calisildigi icin
    }

    public static void main(String[] args) {
        Arac arac = new Arac(50);

    }

    public final void m1(){}
    public final void m1(int a){}


    // final methodlar override edilemezler
    @Override
    public String toString() {
        return "Arac{" +
                "a=" + a +
                ", c=" + c +
                ", d=" + d +
                ", e=" + e +
                '}';
    }
}
