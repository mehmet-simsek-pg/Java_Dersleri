package gun55.interface1;

public class Main extends ParentClass implements Interface1, Interface2{


    @Override
    public void islem() {
        System.out.println(name + " islem");
    }

    @Override
    public void islemInterface2(int num) {
        System.out.println("Interface 2, " + num);
    }


    public static void main(String[] args) {
        Main m0 = new Main();
        ParentClass m1 = new Main();
        Interface1 m2 = new Main();
        Interface2 m3 = new Main();

    }
}
