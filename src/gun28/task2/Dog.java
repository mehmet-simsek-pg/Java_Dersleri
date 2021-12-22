package gun28.task2;

public class Dog {
    // instance vars, new ile olusturulanlar
    String name;
    String cins;
    int yas;

    // class vars, bir tanedir, nesnede olusturulmazlar
    static int count;

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "lassi";
        d1.cins = "doberman";
        d1.yas = 3;
        d1.havla();

        Dog d2 = new Dog();
        d2.name = "joe";
        d2.cins = "kangal";
        d2.yas = 4;
        d2.havla();
        System.out.println("------------------");
        yaz("str");
        yaz(d1.yas);
        yaz(d1);
        yaz(d2);



    }


    // Dog türünden olusturulan nesneye ait
    public void havla(){
        System.out.println("ben " + name + ", havladim");
    }

    public static void yaz(Dog dog){
        System.out.println(dog.name);
    }

    public static void yaz(String str){
        System.out.println(str);
    }

    public static void yaz(int i){
        System.out.println(i);
    }

}
