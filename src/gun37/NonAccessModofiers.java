package gun37;

public class NonAccessModofiers {

    /*
        Access modifiers -> ulasim ile ilgili
        Non-Acces Modifoiers -> fonksiyonellikle ilgili

        static, final, abstract (daha sonra islenecek)

     */

    int a;          // nesne elemanlari, her nesne icin farkli
    static int b;   // class elemanlari

    public static void main(String[] args) {
        b = 1;
        //a = 2;  // a nesnenin elemanidir
        NonAccessModofiers n1 = new NonAccessModofiers();
        n1.a = 10;
        NonAccessModofiers n2 = new NonAccessModofiers();
        n2.a = 20;
        NonAccessModofiers n3 = new NonAccessModofiers();
        n3.a = 30;

    }

    public static void classMethod(NonAccessModofiers n){
        System.out.println(n.a);
    }

    public void method(){
        a = 1;
        b = 10;
    }


}
