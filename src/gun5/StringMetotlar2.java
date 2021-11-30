package gun5;

import java.util.Scanner;

public class StringMetotlar2 {
    public static void main(String[] args) {
        // Bugün hava
        // cok guzel

        String cumle = "Bugün hava";
        String tamCumle = cumle.concat(" cok güzel");
        System.out.println(tamCumle);

        System.out.println(tamCumle.indexOf("gü"));

        // Bir 5 kelimelik bir cümle yazin ve bu cümle icerisinde
        // ki son kelimeyi yazdirin.

        String cumle2 = "Yarin hafta sonu tatil geldi";
        int cumleBaslangic = cumle2.indexOf("g");
        int cumleSonu = cumle2.length();
        System.out.println(cumle2.substring(cumleBaslangic,cumleSonu));
        System.out.println(cumle2.substring(cumleBaslangic));

    }
}
