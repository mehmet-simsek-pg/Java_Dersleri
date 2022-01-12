package gun38.enum3;

import java.util.Scanner;

public class Main2 {

    // class icinde tanimlanmis enum
    enum Gunler1{
        PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESI, PAZAR;
    }

    public static void main(String[] args) {
        // kullanicidan gun adi girmasini isteyin.
        // girdigi günün Günler enum"indaki ordinal degerini yazin.

        Gunler1 gun1 = Gunler1.CARSAMBA;
        Gunler gun = Gunler.PAZAR;

        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine().trim().toUpperCase();

        method(val);








    }

    public static void method(String val){
        System.out.println(Gunler.valueOf(val).ordinal()+1);
    }

}

enum Gunler{
    PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESI, PAZAR;
}
