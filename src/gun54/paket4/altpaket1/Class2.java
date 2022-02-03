package gun54.paket4.altpaket1;

// final classlar extend edilemezler
public final class Class2 {
    private int class2Private;
    int class2Default;
    protected int class2Protected;
    public int class2Public;


    public static void main(String[] args) {
        Class1 c = new Class1();
        c.setClass1Private(0);  // private ulasamadim, setter"i ile ulastim
        c.class1Default = 1;
        c.class1Protected = 2;
        c.class1Public = 3;

    }


}
