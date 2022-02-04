package gun55.ornek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int para;

        Banka1 b1;
        Scanner sc = new Scanner(System.in);
        para = sc.nextInt();
        if (para>0) {
            b1 = new Banka1("b1", BankaTuru.KATILIM, para, "Istanbul", 0.12);
            b1.paraYatir(100);
            b1.paraCek(10);
            b1.faizEkle();
            b1.bankaBilgisi();
            System.out.println(b1.kasaToplami());
        } else
            System.out.println("Tanimlanamaz");

        Banka1 b2 = new Banka1("b2", BankaTuru.TICARI, 100, "Istanbul", 0.09);

        Banka2 bb1 = new Banka2("bb2", BankaTuru.TICARI, 100, 10, 0.1);



    }
}
