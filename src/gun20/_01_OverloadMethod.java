package gun20;


public class _01_OverloadMethod {
    public static void main(String[] args) {
        /*
        öyle bir toplama metodu yazin ki kullanici 2,3 ve 4 sayinin toplamini bu metotla yapabilsin.
         */

        toplama(23,34);
        toplama(45,56,67);
        toplama(22,11,34,45);

        /*
        ayni isimde ayni isi yapan ama parametre sayisi farkli olan metotlara
        overload metot denir.
         */
    }
    public static void toplama(int sayi1,int sayi2){
        int toplam = sayi1+sayi2;
        System.out.println("toplam = " + toplam);
    }
    public static void toplama(int sayi1, int sayi2, int sayi3){
        int toplam = sayi1+sayi2+sayi3;
        System.out.println("toplam = " + toplam);
    }
    public static void toplama(int sayi1, int sayi2, int sayi3,int sayi4){
        int toplam = sayi1+sayi2+sayi3+sayi4;
        System.out.println("toplam = " + toplam);
    }
}
