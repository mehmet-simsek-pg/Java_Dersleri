package gun21;

import java.util.Scanner;

public class _01_MethodExample {
    public static void main(String[] args) {
        /*
         Okulda calisan bir ögretmen icin,
        ögrencilerin vize ve final notlarini girebilecegi
        ve kac ögrenci girmek istedigini alan
        bir metot ve sonuclari yazdiran ayri bir metot daha yazin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac ögrencinin notunu girmak istiyorsunuz?");
        int ogrSayisi = scanner.nextInt();
        int [][]notlar= notGirisi(ogrSayisi);
        notYazdir(notlar); // ya da notYazdir(notGirisi(ogrSayisi));

    }
    public static int[][] notGirisi(int kacOgr){
        Scanner scanner = new Scanner(System.in);

        int[][]notlar = new int[kacOgr][2];

        for (int i = 0; i < notlar.length; i++) {
            for (int j = 0; j < notlar[i].length; j++) {
                if (j==0){
                    System.out.println("Vize sonucu girin");
                    notlar[i][j] = scanner.nextInt();
                }
                else {
                    System.out.println("Final sonucu girin");
                    notlar[i][j] = scanner.nextInt();
                }
            }
        }
        return notlar;
    }
    public static void notYazdir(int[][]notlar){

        for (int i = 0; i < notlar.length; i++) {
            for (int j = 0; j < notlar[i].length; j++) {
                if (j==0){
                    System.out.println("Vize="+notlar[i][j]);
                }
                else {
                    System.out.println("Final="+notlar[i][j]);
                }
            }
        }
    }

}
