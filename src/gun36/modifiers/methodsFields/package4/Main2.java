package gun36.modifiers.methodsFields.package4;

import gun36.modifiers.methodsFields.package3.PublicClass1;

public class Main2 {

    public static void main(String[] args) {
        PublicClass1 p = new PublicClass1();
        p.publicField = 2;

        // farkli package"da oldugu icin defaultField"a ulasilamaz
        //p.defaultField = 5;

        // farkli class"da oldugu icin privateField"a ulasilamaz
        //p.privateField = 10;

        p.publicMethod();
        //p.defaultMethod();  // farkli package"de oldugu icin default methoda ulasilamaz
        //p.privateMethod()   // sadece class icicnden ulasilabilir
    }
}
