package gun20;

public class _01_MethodsReturnType {
    public static void main(String[] args) {
        /*
        2 sayinin toplamini bulan method yazin.
         */

        int toplam = toplamReturn(34,45);
        int parametresizToplam = toplamReturnParametresiz();

        System.out.println("parametresizToplam = " + parametresizToplam);
        System.out.println("toplam = " + toplam);
    }
    public static void toplam(){ // parametresiz metot
        int sayi1 = 34;
        int sayi2 = 45;
        int toplam = sayi1+sayi2;
    }
    public static void toplamBul(int sayi1, int sayi2){ // parametreli metot
        int toplam = sayi1+sayi2;
        System.out.println("toplam = " + toplam);
    }
    public static int toplamReturn(int sayi1, int sayi2){ // return type
        // void karsiligi olmayan bir deger demek
        int toplam = sayi1+sayi2;
        return toplam;
    }
    public static int toplamReturnParametresiz(){
        int sayi1 = 45;
        int sayi2 = 56;
        int toplam = sayi1+sayi2;
        return toplam;
    }

}
