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


        // constructor kullanimi
        PublicClass1 p1 = new PublicClass1();

        // default constructorlara package disindan ulasilamaz
        //PublicClass1 p2 = new PublicClass1(2);

        // private constructorlara class disindan ulasilamaz
        //PublicClass1 p3 = new PublicClass1(2, 3, 4);
    }
}
