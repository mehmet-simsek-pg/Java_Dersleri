package gun54.paket4.altpaket2;


import gun54.paket4.altpaket1.Class1;

public class Class3 extends Class1 {

    private int class3Private;
    int class3Default;
    protected int class3Protected;
    public int class3Public;


    public static void main(String[] args) {
        Class3 c = new Class3();
        c.setClass1Private(0);  // private ulasamadim, setter"i ile ulastim
        //c.class1Default = 1;  // ayni package"da olmadiklari icin görülmedi
        c.class1Protected = 2;
        c.class1Public = 3;



        Class1 c1 = new Class1();
        c1.setClass1Private(0);  // private ulasamadim, setter"i ile ulastim
        //c.class1Default = 1;  // ayni package"da olmadiklari icin görülmedi
        //c1.class1Protected = 2;
        c1.class1Public = 3;

    }


}
