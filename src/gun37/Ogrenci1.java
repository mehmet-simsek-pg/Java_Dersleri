package gun37;

public class Ogrenci1 {

    String name;
    static int count;


    public Ogrenci1(String name) {
        this.name = name;
        count++;
    }

    public static void main(String[] args) {

        Ogrenci1 o1 = new Ogrenci1("Ali1");
        Ogrenci1 o2 = new Ogrenci1("Ali2");
        Ogrenci1 o3 = new Ogrenci1("Ali3");
        Ogrenci1 o4 = new Ogrenci1("Ali4");

        System.out.println(o1.name + " : " + o1.ogrenciSayisi());
        Ogrenci1.count = 100;
        System.out.println(o1.name + " : " + o1.ogrenciSayisi());

        System.out.println(ogrenciSayisiStatic());
    }

    // nesnenin methodu, static olana ulasabilir
    int ogrenciSayisi(){
        //return count;  // ayni class isinde classIsmi yazmaya gerek yoktur
        return Ogrenci1.count;  // staticlere classIsmi.degisken  seklinde ulasilir
    }

    static int ogrenciSayisiStatic(){
        return count;   // ayni class isinde classIsmi yazmaya gerek yoktur
    }

}
