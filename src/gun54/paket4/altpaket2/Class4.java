package gun54.paket4.altpaket2;

import gun54.paket4.altpaket1.Class1;
import gun54.paket4.altpaket1.Class2;

public class Class4 {
    private int class4Private;
    int class4Default;
    protected int class4Protected;
    public int class4Public;

    public static void main(String[] args) {
        Class1 c = new Class1();
        c.setClass1Private(0);  // private ulasamadim, setter"i ile ulastim
        //c.class1Default = 1;  // ayni package"da olmadiklari icin görülmedi
        //c.class1Protected = 2; // ayni package"da olmadiklari ya da extend edilmedigi icin görülmedi
        c.class1Public = 3;

    }
}
