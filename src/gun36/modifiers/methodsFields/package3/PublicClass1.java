package gun36.modifiers.methodsFields.package3;

public class PublicClass1 {
    // fields, Attributes
    public int publicField;     // class"a ulasilinca her yerden ulasilabilir
    int defaultField;           // ayni package icinden ulasilabilir
    private int privateField;   // sadece class icinden ulasilabilir

    //consructor
    // public consructor
    public PublicClass1() {

    }

    // default consructor
    PublicClass1(int publicField) {
        this.publicField = publicField;
    }

    // private consructor
    private PublicClass1(int publicField, int defaultField, int privateField) {
        this.publicField = publicField;
        this.defaultField = defaultField;
        this.privateField = privateField;
    }

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

        // constructor kullanimi
        PublicClass1 p1 = new PublicClass1();
        PublicClass1 p2 = new PublicClass1(2);
        PublicClass1 p3 = new PublicClass1(2, 3, 4);
    }











}
