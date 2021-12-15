package gun23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class _01_ArrayList2D {
    public static void main(String[] args) {

        int num = 5; // num degiskeni 1 tane sayi tutabilir
        int[] numArray = new int[5]; // numArray degiskeni 5 tane sayi tutabilir.
        int[][] nums = new int[5][5]; // 5x5 den 25 tane sayi tutabilir.

        ArrayList<Integer> list = new ArrayList<>(); // sinir olmadan istedigim kadar sayi tutabilir

        ArrayList<ArrayList<Integer>> notlarTablosu = new ArrayList<>();
        // listin listi denir. Her bir indexte bir liste tutar.
        // 2D diziyle ayni mantikta calisir. Farklari -> toplamda ne kadar veri tutacagini
        // belirtmeye gerek yoktur. Tanimlama yaparken de tek veya 2 boyutlu olma durumunu
        // esitligin sol tarafinda belirtiriz. Esitligin sag tarafi her zaman new ArrayList<>() olarak yazilir.

        String[] dersler = new String[3];
        dersler[0] = "Matematik";
        dersler[1] = "Almanca";
        dersler[2] = "Fizik";

        ArrayList<Integer> matNotlar = new ArrayList<>(); // tek boyutlu bir liste
        matNotlar.add(90);
        matNotlar.add(89);
        matNotlar.add(99);

        ArrayList<Integer> almancaNotlar = new ArrayList<>(); //tek boyutlu bir liste
        almancaNotlar.add(66);
        almancaNotlar.add(78);
        almancaNotlar.add(89);

        ArrayList<Integer> fizikNotlar = new ArrayList<>(); // tek boyutlu bir liste
        fizikNotlar.add(67);
        fizikNotlar.add(89);
        fizikNotlar.add(90);

        notlarTablosu.add(matNotlar);
        notlarTablosu.add(almancaNotlar);
        notlarTablosu.add(fizikNotlar);

        // tek bir listeyi yazdirma
        for (int i = 0; i < matNotlar.size(); i++) {
            System.out.print(matNotlar.get(i)+" ");
        }
        System.out.println("*************");
        // tüm notlari yazdirma

        for (int i = 0; i < notlarTablosu.size(); i++) {
            System.out.println(dersler[i]); // String dizi
            for (int j = 0; j < notlarTablosu.get(i).size(); j++) {
                System.out.println((i+1)+". satirdaki"+(j+1)+". not="+notlarTablosu.get(i).get(j)); // satir sütun mantigi dizilerdeki gibi
            }
        }

        /*
        Kullanicinin girecegi ders no suna göre ekrana o dersin notlarini yazdiran
        bir program yazin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ders no'lari= 0-Mat, 1-Almanca, 2-Fizik");
        int dersNo = scanner.nextInt();
        dersNotu(notlarTablosu,dersNo);

        // kullanicinin istedigi dersin ortalamasini bulan programi yazin
        ortalamaBul(notlarTablosu,dersNo);

        //tüm derslerin ortalamasini bulan programi yazin.
        tümDerslerinOrtalamasi(notlarTablosu);

    }
   public static void dersNotu(ArrayList<ArrayList<Integer>>list,int dersNo){
       System.out.println(list.get(dersNo));
    }
    public static void ortalamaBul(ArrayList<ArrayList<Integer>>list,int dersNo){
        int toplam = 0;

        for (int i = 0; i < list.get(dersNo).size(); i++) {
            toplam+=list.get(dersNo).get(i); // dersNo satiri ifade eder, i ise o satirin sütunlarini
        }
        int ortalama = toplam/list.get(dersNo).size(); // list.get(dersNo).size() -> o satirda kac sayi oldugunu bulur
        System.out.println("ortalama = " + ortalama);
    }
    public static void tümDerslerinOrtalamasi(ArrayList<ArrayList<Integer>>list){

        int toplam = 0;
        int notSayisi = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                toplam+= list.get(i).get(j);
                notSayisi++; // tablo icindeki toplam not sayisini bulmak icin yaptik
            }
        }
        int tümDerslerOrt = toplam/notSayisi;
        System.out.println("tümDerslerOrt = " + tümDerslerOrt);
    }
}
