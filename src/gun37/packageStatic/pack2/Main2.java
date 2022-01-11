package gun37.packageStatic.pack2;

import gun37.packageStatic.pack1.Banka;

public class Main2 {
    public static void main(String[] args) {

        Banka b1 = new Banka();
        //b1.sube = "A";   // farkli package de oldugu icin default field ulasilamaz
        b1.sehir = "AA";

        //Banka.count = 2;  // count default oldugu icin buradan ulasilamaz
        Banka.ulke = "AAA";

    }
}
