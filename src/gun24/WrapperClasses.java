package gun24;

public class WrapperClasses {
    public static void main(String[] args) {
        /*
        sayi ve ya true false gibi basit islemler icin degisken tanimlarken
        bunlari int, double, boolean gibi basit(primitive) tiplerini kullandik.
        Eger ki bu islemlerden daha fazlasina ihtiyac duyacaksak bu veri tiplerinin
        class halini yani bas harfleri büyük olacak sejilde kullaniriz.
        Bunlara wrapper class denir
         */

        int num = 5; // num degiskeni basit veri tutar.
        Integer buyukveri = 6;  // buyuk verinin kendine ait metotlari vardir.

        num=buyukveri; // kapsamliyi basite atmaya boxing denir
        buyukveri=num; // basiti kapsamliya atmaya unboxing denir.


        //ArrayList<int>nums = new ArrayList<int>(); yanlis bir kullanim
        // burada tutacagim sayilarla basit toplama cikarma gibi islemlerin
        // disinda islem yaptigim icin Integer olarak tanimlamam gerekir

        double d = 12.3;
        Double buyukD = 34.2;

        boolean b = true;
        Boolean buyukB = false;

        float f = 2.34F;
        Float buyukF = 3.12f;

    }
}
