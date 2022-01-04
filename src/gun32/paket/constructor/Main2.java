package gun32.paket.constructor;

public class Main2 {

    public static void main(String[] args) {

        Student s1 = new Student(3, 102, "Kemal", "Deniz", 7);

        Student s2 = new Student(4, 103, "Hasan", "Kula");
        s2.classroom = 6;

        Student s3 = new Student();

        s3.setStudent(5, 104, "Ali", "Ali", 7);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(Student.count);
    }
}
