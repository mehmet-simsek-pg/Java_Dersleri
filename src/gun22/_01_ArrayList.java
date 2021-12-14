package gun22;

import java.util.ArrayList;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {

        int[] intDizi = new int[5]; // kac tane eleman tutacagini vermek zorunlu
        // arraylist kac tane eleman tutacagini belirtmemize gerek yok

        ArrayList<Integer> integerArrayList=new ArrayList<>();
        // integer tipinde veri tutar


        ArrayList<String> stringArrayList = new ArrayList<>();
        // String tipinde veri tutar
        ArrayList<Boolean> booleanArrayList = new ArrayList<>();
        // boolean tipinde veri tutar
        ArrayList<Double>doubleArrayList = new ArrayList<>();
        // double tipinde veri tutar

        // Ders kaydedecek bir liste olusturun.
        ArrayList<String> dersler = new ArrayList<>();

        // listeye eleman ekleme
        dersler.add("Matematik"); // 0. indis
        dersler.add("Türkce");
        dersler.add("Almanca");
        dersler.add("Fizik"); // 3. indis
        // List lere ekleme yaparken hep en sona ekler

        System.out.println("dersler = " + dersler); // Listlerde Arrays.toString() metoduna gerek yok.

        dersler.add(3,"Ingilizce"); // Direkt indexe ekleme
        System.out.println("3. indexe Ingilizce eklendikten sonra dersler = " + dersler);// [Matematik, Türkce, Almanca, Ingilizce, Fizik]

        String trDersi = dersler.get(1); // Liste icerisindeki elemani index degeri ile cekme
        System.out.println("trDersi = " + trDersi);

        dersler.set(4,"Kimya"); // Liste icerisindeki bir indexteki veriyi degistirmek icin kullanilir.
        System.out.println("kimya fizik yerine eklendikten sonra dersler = " + dersler);

        int uzunluk = dersler.size(); // Listenin uzunlugunu verir. Yani eleman sayisini verir.
        System.out.println("uzunluk = " + uzunluk);

        boolean listBosMu = dersler.isEmpty(); // Listenin bos olup olmadigini kontrol eder
        System.out.println("listBosMu = " + listBosMu);

        dersler.remove("Almanca"); // Belirtilen degeri listeden siler
        System.out.println("almanca silindikten sonra dersler = " + dersler);

        dersler.remove(1); // index e veri silme
        System.out.println("1. indexteki veri silindikten sonra dersler = " + dersler);

        int index = dersler.indexOf("Kimya"); // Verilen degerinin index ini bulmaya yarar
        System.out.println("index = " + index);

        // for döngüsü ile ekrana yazdirma
        for (int i = 0; i < dersler.size(); i++) {
            System.out.print(dersler.get(i)+" ");
        }

        Collections.fill(dersler,"Mat");
        System.out.println("dersler = " + dersler);
        dersler.clear(); // Listedeki tüm verileri siler
        // ArrayList<String> dersler = new ArrayList<>(); bu hale getir
        System.out.println("dersler = " + dersler);


    }
}
