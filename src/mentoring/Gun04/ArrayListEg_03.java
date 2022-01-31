package mentoring.Gun04;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEg_03 {
//    Write a program to do following operation
//    on two dimensional list A of size m x n.
//    You should use user-defined methods
//    which accept 2-D list A,
//    and its size m and n as arguments.
//    The options are:
//
//    To input elements into matrix of size m x n
//    To display elements of matrix of size m x n
//    Sum of all elements of matrix of size m x n
//    To display row-wise sum of matrix of size m x n
//    To display column-wise sum of matrix of size m x n

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matrix in satir sayisini girin= ");
        int satirSayisi = scanner.nextInt();

        System.out.print("Matrix in sutun sayisini girin= ");
        int sutunSayisi = scanner.nextInt();

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        randomElemanEkle(matrix, satirSayisi, sutunSayisi);
        yazdir(matrix);
        int elemanlarinToplami = tumunuTopla(matrix);
        System.out.println("elemanlarinToplami = " + elemanlarinToplami);
        satirTopla(matrix);
        sutunTopla(matrix);
    }

    public static void randomElemanEkle(ArrayList<ArrayList<Integer>> list, int m, int n) {
        for (int satir = 0; satir < m; satir++) {
            ArrayList<Integer> satirList = new ArrayList<>();
            for (int sutun = 0; sutun < n; sutun++) {
                int eleman = (int) (Math.random() * 100);
                satirList.add(eleman);
            }
            list.add(satirList);
        }
    }

    public static void yazdir(ArrayList<ArrayList<Integer>> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static int tumunuTopla(ArrayList<ArrayList<Integer>> list) {
        int toplam = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                toplam += list.get(i).get(j);
            }
        }
        return toplam;
    }

    public static void satirTopla(ArrayList<ArrayList<Integer>> list) {
        int toplam = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                toplam += list.get(i).get(j);
            }
            System.out.println(i + 1 + ". satirin toplami = " + toplam);
            toplam = 0;
        }
    }

    public static void sutunTopla(ArrayList<ArrayList<Integer>> list) {
        int toplam = 0;
        for (int i = 0; i < list.get(0).size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                toplam += list.get(j).get(i);
            }
            System.out.println(i+1+". sutun toplami = " + toplam);
            toplam=0;
        }
    }
}

