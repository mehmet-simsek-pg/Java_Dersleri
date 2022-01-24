package gun46;

public class abstract3 {

    public static void main(String[] args) {

        ABC abc = new ABC() {
            @Override
            void yaz() {
                System.out.println("overreided abstract method");
            }

        };

        abc.yaz();


    }

}

abstract class ABC{
    int var;
    abstract void yaz();
}
