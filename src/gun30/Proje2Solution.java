package gun30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Proje2Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList<Integer>> list = new HashMap<>();

        int islem;
        do {
            islem = menu();
            switch (islem){
                case 1:
                    String name = ogrenciKayit();
                    list.put(name, new ArrayList<Integer>());
                    break;
                case 2:
                    System.out.println(list);
                    System.out.print("Ogrencinin Adini ve Soyadini Giriniz : ");
                    String ogrenciAdi = sc.nextLine();
                    if (list.containsKey(ogrenciAdi)) {
                        System.out.println(ogrenciAdi + "'nin Notlarini giriniz : ");
                        ogrenciNotGirisi(ogrenciAdi, list);
                    }else {
                        System.out.println("Aranan Ogrenci Bulunamadi");
                    }
                    break;
                case 3:
                    listeleNotlar(list);
                    break;
                default:

            }
        }while (islem != 0);
    }


    public static int menu(){
        Scanner sc = new Scanner(System.in);
        int islem;
        System.out.println("Yapilacak islemin sira numarasini secin:");
        System.out.println("1 : Yeni Ögrenci Kayit");
        System.out.println("2 : Not Girisi");
        System.out.println("3 : Ögrenci Notlari ");
        System.out.println("4 : Not Ortalamalari ");
        System.out.println("0 : Cikis ");
        System.out.print("Seciminiz : ");
        islem = sc.nextInt();
        System.out.println("--------------------------------");
        return islem;
    }

    public static String ogrenciKayit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ögrencinin adi soyadi : ");
        String name = sc.nextLine();
        return isimDuzenle(name);
    }

    public static String isimDuzenle(String name){
        String nameTemp = name.trim().replaceAll("[ ]+ ", " ");
        String[] nameArr = nameTemp.split(" ");
        String tempStr = "";
        for (String s : nameArr) {
            tempStr += s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase() + " ";
        }
        return tempStr.trim();
    }

    public static void ogrenciNotGirisi(String ogrenciAdi, HashMap<String, ArrayList<Integer>> list){
        ArrayList<Integer> notlar = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num;
        while (true){
            num = sc.nextInt();
            if (num>=0 && num<=100)
                notlar.add(num);
            else{
                list.put(ogrenciAdi, notlar);
                break;
            }
        }
    }

    public static void listeleNotlar(HashMap<String, ArrayList<Integer>> list){
        System.out.println("Ögrenci Notlari");
        for (Map.Entry<String, ArrayList<Integer>> entry : list.entrySet()) {
            System.out.printf("%-20s", entry.getKey());
            for (Integer integer : entry.getValue()) {
                System.out.print(integer + "\t");
            }
            System.out.println();
        }
    }

    public static void listeleOrtalamalar(HashMap<String, ArrayList<Integer>> list){
        System.out.println("Not Ortalamalari");
        for (Map.Entry<String, ArrayList<Integer>> entry : list.entrySet()) {
            System.out.printf("%-20s", entry.getKey());
            double ort = 0;
            for (Integer integer : entry.getValue())
                ort += integer;
            System.out.printf("%.2f", ort/entry.getValue().size());
        }

    }

}
