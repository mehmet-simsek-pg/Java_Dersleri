package gun54.paket4.altpaket1;

public class Class1 {

    private int class1Private;
    int class1Default;
    protected int class1Protected;
    public int class1Public;



    private void class1PrivateMethod(){}
    void class1DefaultMethod(){}
    protected void class1ProtectedMethod(){}
    public void class1PublicMethod(){}

    public void test(){
        class1Private = 0;
        class1Default = 1;
        class1Protected = 2;
        class1Public = 3;
    }

    public static void main(String[] args) {
        Class1 c = new Class1();
        c.class1Private = 0;
        c.class1Default = 1;
        c.class1Protected = 2;
        c.class1Public = 3;
    }

    public int getClass1Private() {
        return class1Private;
    }

    public void setClass1Private(int class1Private) {
        if (class1Private>0)
            this.class1Private = class1Private;
    }

    // final methodlar Override edilemezler
    final public void finalMethod(){

    }
}
