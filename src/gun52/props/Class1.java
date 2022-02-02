package gun52.props;

public class Class1 implements Cloneable{
    String name;

    public Class1(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Class1 c1 = new Class1("A");
        Class1 c2 = (Class1) c1.clone();
        Class1 c3 = c1;

        System.out.println(c1.name + ", " + c2.name + ", " + c3.name);
        c1.name = "B";
        System.out.println(c1.name + ", " + c2.name + ", " + c3.name);

    }

}
