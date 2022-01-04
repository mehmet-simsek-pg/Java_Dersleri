package gun32.paket.constructor;

public class Main {
    public static void main(String[] args) {
        // veri atama 1
        Student s1 = new Student();
        s1.id = 1;
        s1.number = 100;
        s1.name = "Ali";
        s1.surname = "Yalcin";
        s1.classroom = 6;


        // veri atama 2, method kullanarak
        Student s2 = new Student();
        s2.setStudent(2, 101, "Hasan", "Kaya", 6);


        //System.out.println("Id : " + s1.id + "\nNumara: " + s1.number);
        System.out.println(s1);  // s1.toString() anlamina geliyor
        System.out.println(s2);
    }
}
