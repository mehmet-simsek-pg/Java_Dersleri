package gun20;

public class _02_Methods {
    public static void main(String[] args) {

        /*
        iki sayinin toplamini ekrana yazdiran bir metot yazin.
         */
        toplamBul(23,4567);

    }

    public static void toplamBul(int sayi1,int sayi2){
        int toplam = sayi1+sayi2;
        System.out.println("toplam = " + toplam);
    }
}
