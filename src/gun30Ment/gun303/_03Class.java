package gun30Ment.gun303;

public class _03Class {

    public static void main(String[] args) {
        Kus kus1 = new Kus();
        kus1.tanimla("Kus1", "Serce", "Toprak");

        Kus kus2 = new Kus();
        kus2.tanimla("Kus2", "Güvercin", "Beyaz");

        Kus kus3 = new Kus();
        kus3.tanimla("Kus3", "Kartal", "Siyah");

        kus1.uc();
        kus2.ot();
        kus3.in();


        System.out.println(Kus.count);

    }

}

class Kus {
    static int count;
    String name;
    String cinsi;
    String renk;

    // initializer, Nesne olusturunca, önce degiskenler okunur
    // hemen sonra initializer calistirilir
    {
        Kus.count++;
    }


    public void tanimla(String name, String cinsi, String renk){
        this.name = name;
        this.cinsi = cinsi;
        this.renk = renk;
    }

    int time;
    public void uc() {
        System.out.println("Ben " + name + " : uctum....");
    }

    public void in() {
        System.out.println("Ben " + name + " : indim.....");
    }

    public void ot() {
        System.out.println("Ben " + name + " : ccccccc.........");
    }

}
