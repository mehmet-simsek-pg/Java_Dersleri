package gun46.abstract1;

// methodlarindan biri abstrct olan class da abstract olarak belirlenmeli
// abstract classlardan interface'ler gibi nesne olusturulmaz
// abstract classlari extend eden classlar bu class'a ait abstract
// methodlari override etmeli.
// constructor olmaz
public abstract class AbstractClass {

    int a;

    abstract void abstractMethod();

    // normal methodlarda olabilir
    public void say(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(i + ", ");
        }
    }

}
