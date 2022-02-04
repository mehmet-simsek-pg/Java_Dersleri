package gun55.abstract1;


public abstract class AbstractClass {

    int a = 3;

    public abstract void ekranaYaz(String str);

    public void islemYap(int n){
        System.out.println(n*n);
    }
}

/*
    gövdesi olmayan methodlara abstract method denir.
    Sadece isim ve parametre tanimlamalari olur
    Bir class"in en az 1 methodu abstract ise class abstract classdir
 */