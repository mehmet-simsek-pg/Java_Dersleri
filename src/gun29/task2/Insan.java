package gun29.task2;

import java.util.ArrayList;

public class Insan {
    static int count;       // class var

    String adi;             // instance var
    int yasi;               // instance var
    ArrayList<String> akrabalari = new ArrayList<>();   // instance var

    public void veriAta(String adi, int yasi){
        this.adi = adi;
        this.yasi = yasi;
        count++;              // Insan class"inin count statik degiskenini 1 artirdim
                                    // Ayni class icinde ise Insan.count++; yerine count++; yazilabilir
    }

    public void akrabaAta(String...akrabaIsimleri){    // ...  varargs -> array
        /*
        for (int i = 0; i < akrabaIsimleri.length; i++) {
            akrabalari.add(akrabaIsimleri[i]);
        }
        */
        for (String s : akrabaIsimleri) {
            akrabalari.add(s);
        }
    }

    public void adiniSoyle(){
        System.out.println(adi);
    }

    public void akrabalariniSoyle(){
        System.out.println(akrabalari);     // [ali, veli]
    }

}
