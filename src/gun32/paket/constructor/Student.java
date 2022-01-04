package gun32.paket.constructor;

public class Student {
    int id;
    int number;
    String name;
    String surname;
    int classroom;
    static int count;

    // constructer : class ismi ile ayni isimde ve return"u olmayan özel metholardir
    // nesne olusturuldugunda otomatik olarak calisir
    // constructor create edilmese de java bos bir constructor create eder ve calistirir
    // amac nesne olusturuldugunda calistirmak istenilen ya da initialize icin kullanilir
    public Student(){
        count++;
    }

    // over load constructor
    public Student(int id, int number, String name, String surname, int classroom){
        System.out.println("consructor calisti");
        this.id = id;
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.classroom = classroom;
        count++;
    }

    // over load constructor
    public Student(int id, int number, String name, String surname) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.surname = surname;
        count++;
    }


    public void setStudent(int id, int number, String name, String surname, int classroom){
        this.id = id;
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.classroom = classroom;
    }


    // bu method nesneyi yazdirmak istedigimizde ekrana yazdirilcak bildileri return eder
    @Override
    public String toString() {
        return "Ögrenci Bilgileri:" +
                "\nid : " + id +
                "\nnumber : " + number +
                "\nname : " + name +
                "\nsurname : " + surname +
                "\nclassroom : " + classroom;
    }
}
