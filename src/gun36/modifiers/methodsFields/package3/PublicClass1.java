package gun36.modifiers.methodsFields.package3;

public class PublicClass1 {
    // fields, Attributes
    public int publicField;     // class"a ulasilinca her yerden ulasilabilir
    int defaultField;           // ayni package icinden ulasilabilir
    private int privateField;   // sadece class icinden ulasilabilir




    // methodlar
    // class"a ulasan herkes tarafindan görülür
    public void publicMethod(){

    }

    // package icinden ulasilabilir
    void defaultMethod(){

    }

    // sadece class icinden ulasilabilir
    private void privateMethod(){

    }





    public static void main(String[] args) {
        PublicClass1 p = new PublicClass1();
        p.defaultField = 2;
        p.publicField = 5;
        p.privateField = 10;    // ayni class"da oldugu icin ulasilabilir


        p.publicMethod();
        p.defaultMethod();
        p.privateMethod();
    }











}
