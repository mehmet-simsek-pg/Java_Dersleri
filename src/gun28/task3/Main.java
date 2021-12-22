package gun28.task3;

public class Main {
    public static void main(String[] args) {
        Arac a1 = new Arac();
        Arac.sayi++;
        a1.marka = "Audi";
        a1.yil = 2020;
        a1.sayi1++;
        //a1.sayi++;

        Arac a2 = new Arac();
        Arac.sayi++;
        a2.marka = "BMW";
        a2.yil = 2015;
        a2.sayi1++;

        System.out.println("Üretilen arac sayisi : " + Arac.sayi);
        System.out.println(a1.marka + ", " + a1.sayi1);
        System.out.println(a2.marka + ", " + a2.sayi1);
        a1.calis();
        a1.kornaBas(a2.marka);
        a1.stopEt();

        a2.calis();
        a2.kornaBas("Audi");
        a2.stopEt();
        System.out.println("-----------------");
        Main.yaz(a1);   //  Class ismi ile statik methoda ulasma
        yaz(a2);        // Ayni class icinde olmasi nedeni ile Main"i belirtmeye gerek yok

    }

    // static method class"a aittir. ulasim yetkisine göre class ismi herkes ulasabilir
    public static void yaz(Arac arac){
        System.out.println(arac.marka + "-" + arac.yil + " geldi");
    }

    // statik olmayan, nesneye aittir. Main class"indan new ile olusturulan nesnenin methodudur.
    public void yaz1(Arac arac){
        System.out.println(arac.marka + "-" + arac.yil + " geldi");
    }

}


class Arac {
    String marka;
    int yil;
    static int sayi;
    int sayi1;

    public void calis(){
        System.out.println(marka +", " + yil + ", calistim");

    }

    public void kornaBas(String isim){
        System.out.println("Selam " + isim + ", ben " + marka +", " + yil + ", korna bastim");
    }

    public void stopEt(){
        System.out.println(marka +", " + yil + ", stop ettim");
    }
}