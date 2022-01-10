package gun36.modifiers.classes.package2;

//import gun36.modifiers.package1.DefaultClass;
import gun36.modifiers.classes.package1.PublicClass;

public class Main2 {
    public static void main(String[] args) {
        // public oldugu icin her yerden ulasilir
        PublicClass p = new PublicClass();

        // DefaultClass"a ulasilamaz. Default modifier"i oldugu ve farkli pakette oldugu icin
        //DefaultClass d = new DefaultClass();

    }
}

class A{

}

/* class private modifier almaz
private class B{

}

 */
