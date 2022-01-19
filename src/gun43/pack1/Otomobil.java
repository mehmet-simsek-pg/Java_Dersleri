package gun43.pack1;

public class Otomobil extends Arac{

    public void method1(){
        protectedVar = "1";
        publicVar = "2";
        defaultVar = "3";
        //privateVar = "1"; // ->     ulasilamaz
        protectedMethod();
        protectedMethod();
        defaultMethod();
        setPrivateVar("1"); //  privateVar"a setter ile ulasiyorum.
                            // dogrudan degil, Arac class"inin methodu ile ulasiyorum
                            // dogrudan ulasma yetkim yok
    }

    public static void main(String[] args) {
        Otomobil o = new Otomobil();
        o.publicVar = "1";
        o.protectedVar = "2"; // ayni class"da create edildigi icin protedted"i görddü
        o.defaultVar = "3";
        //o.privateVar = "3";  -> ulasilamaz
        o.publicMethod();
        o.protectedMethod();
        o.defaultMethod();

    }

}
