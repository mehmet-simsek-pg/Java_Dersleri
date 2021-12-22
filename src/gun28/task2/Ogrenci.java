package gun28.task2;

//  class isimleri nesne isimleri gibidir, Elma, Kitap, Araba
//  Büyük harfle baslar, camelStyle yazim türü ile yazilir

public class Ogrenci {
    // ögrenci bilgileri vardir
    // fields, attributes
    String name;            // instance variable, nesne variable
    int number;


    // static tanimlanmayan tüm variable ve methodlar nesneye aittir

    // behaviour, davranis
    // Kucukharfle baslar, camelstyle, hareket iceren filler kullanilir
    public void konus(){
        System.out.println("konusuyorum");
    }

    public void adiniSoyle(){
        System.out.println("adim:" + name + ", numaram:" + number);
    }
}
