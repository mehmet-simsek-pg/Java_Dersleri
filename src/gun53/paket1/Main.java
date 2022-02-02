package gun53.paket1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        int a = 3;
        String str = "Java";

        int[] arr = new int[100];
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        HashMap<Integer, String> map = new HashMap<>();


        yaz();
        Ogrenci.okul = "Java okulu";

        // bir class"dan nesne olusturmak icin new anahtari kullanilir
        Ogrenci ogrenci1 = new Ogrenci();
        Ogrenci ogrenci2 = new Ogrenci();
        ogrenci1.isim = "Ali";
        ogrenci2.isim = "Veli";
        ogrenci1.ogrenciAdi();
        ogrenci2.ogrenciAdi();
        Ogrenci.okulIsmi();
        System.out.println(ogrenci1.okul);
        System.out.println(ogrenci2.okul);

        ogrenci1 = null;
        //System.out.println(ogrenci1.isim);  // ogrenci1 null oldugu icin isim de kalmamistir
        System.out.println(" - " + ogrenci1.okul);
        // normali statiklere Class ismi ile ulasilir
        System.out.println(Ogrenci.okul);
    }

    public static void yaz(){
        System.out.println("java");
    }

    public void yaz1(){
        System.out.println("java");
    }

}
