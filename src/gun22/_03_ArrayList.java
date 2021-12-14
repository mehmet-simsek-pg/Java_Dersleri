package gun22;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> isimler = new ArrayList<>(Arrays.asList("Mehmet","Abdullah","Cihat"));
        // Listeye direkt veri eklemenin 1.yolu Arrays.asList() tir.
        System.out.println("isimler = " + isimler);

        // 2. yol
        ArrayList<String> dersler = new ArrayList<>(){
            {
                add("Matematik");
                add("Türkce");
                add("Fizik");
            }
        };

        isimler.addAll(dersler); // dersler listesini isimler listesine ekler
        System.out.println("isimler = " + isimler);

        isimler.removeAll(dersler); // dersler listesini isimler listesinden siler
        System.out.println("isimler = " + isimler);

        if (isimler.contains("Mehmet")) // contains() metodu listenin tamamini kontrol edebilir
            System.out.println("Mehmet liste icinde var");
        else
            System.out.println("Listede mehmet yok");

       
        
        
        
        
        
        
        
    }
}
