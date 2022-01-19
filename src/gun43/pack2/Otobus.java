package gun43.pack2;

import gun43.pack1.Arac;

public class Otobus extends Arac {

    public void method(){
        protectedVar = "1"; // farkli packageda olsa da Arac classini extend ettigi icin görür
        publicVar = "2";
        //defaultVar = "3";
        //privateVar = "1"; // ->     ulasilamaz
        protectedMethod();
        protectedMethod();
        //defaultMethod();  // farkli package
        setPrivateVar("1"); //  privateVar"a setter ile ulasiyorum.
        // dogrudan degil, Arac class"inin methodu ile ulasiyorum
        // dogrudan ulasma yetkim yok
    }
}
