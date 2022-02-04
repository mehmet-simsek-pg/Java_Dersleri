package gun55.abstract1;




public class Class1 extends AbstractClass{

    public static void main(String[] args) {
        Class1 c = new Class1();
        c.ekranaYaz("Java");
    }

    @Override
    public void ekranaYaz(String str) {
        System.out.println("Class1 : " + str);
    }
}
