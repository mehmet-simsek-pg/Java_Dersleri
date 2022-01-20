package gun44.interface1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ornek1 {

    final String name = ""; // final fieldlar burada, initializer"da ya da constructor"da initialize edilmelidir

    public static void main(String[] args) {

        IInterface c1 = new Class1();
        IInterface c2 = new Class2();

        // Interface"den nesne olusturulmaz ancak burada bir nesne olusturma simulasyonu var
        // bu durum hic kullanilmaz.
        IInterface i = new IInterface() {
            @Override
            public void yaz() {
                System.out.println("");
            }
        };



    }
}
