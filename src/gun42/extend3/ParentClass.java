package gun42.extend3;

public class ParentClass {


    static int a = 5;
    static {
        System.out.println("ParentClass static initializer" + a);
    }

    int i;
    {
        System.out.println("ParentClass instance initializer" + i);
    }

    public ParentClass(){
        System.out.println("ParentClass constructor");
    }

}
