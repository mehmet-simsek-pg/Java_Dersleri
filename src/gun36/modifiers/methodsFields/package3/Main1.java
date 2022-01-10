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


        // constructor kullanimi
        PublicClass1 p1 = new PublicClass1();
        PublicClass1 p2 = new PublicClass1(2);
        //PublicClass1 p3 = new PublicClass1(2, 3, 4);
        // bu constructor private oldugu icin class disindan ulasilamadi

    }
}
