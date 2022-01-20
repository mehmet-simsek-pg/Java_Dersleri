package gun44.interface1;

// yalniz bir tane extend yapilir, birden fazla implement yapilabilir
public class Class1 extends ParentClass implements IInterface, IInterface2 {


    @Override
    public void yaz() {
        System.out.println("Class 1");
    }

    @Override
    public void yaz2() {
        System.out.println(isim);
    }

    public void method(){
        defaultMethod();
    }


    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.yaz();
        class1.yaz2();
        class1.defaultMethod();
    }
}
