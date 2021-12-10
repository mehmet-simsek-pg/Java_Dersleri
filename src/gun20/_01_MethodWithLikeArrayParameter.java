package gun20;

public class _01_MethodWithLikeArrayParameter {
    public static void main(String[] args) {

        //Toplama metodu yazin, ama kac sayi olacagi bilinmiyor.
        toplama(23,22,45,56);
        toplama(21,22);
        toplama(45,56,78,89,32,34,45,56,78,89);

    }
    public static void toplama(int...sayilar){
        // int...sayilar => dizi mantiginda calisir. Kac tane verdigimizin bir
        // önemi yok 2 veya 100 sayi icinde ayni isi yapar.

        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];
        }
        System.out.println("toplam = " + toplam);
    }
}
