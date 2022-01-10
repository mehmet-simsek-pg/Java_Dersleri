package gun36.modifiers.methodsFields.package3;

public class Main1 {
    public static void main(String[] args) {

        PublicClass1 p = new PublicClass1();
        p.publicField = 2;
        p.defaultField = 5;

        // farkli class"da oldugu icin privateField"a ulasilamaz
        //p.privateField = 10;


        p.publicMethod();
        p.defaultMethod();
        //p.privateMethod(); // private oldugu icin class disindan ulasilamaz

    }
}
