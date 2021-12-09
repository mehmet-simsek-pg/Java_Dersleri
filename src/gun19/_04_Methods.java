package gun19;

public class _04_Methods {
    public static void main(String[] args) {
        /*
        6 elemanli bir sayi dizisi olusturun ve bu dizideki tek ve cift eleman
        sayisini bulan bir metot yazin.
         */
        int[] array = {23,44,45,67,12,67};
        tekMiCiftMi(array);
    }
    public static void tekMiCiftMi(int[]array){
        int tekSayiAdedi = 0;
        int ciftSayiAdedi = 0;

        for (int sayi : array) {
            if (sayi % 2 == 1) {
                tekSayiAdedi++;
            } else {
                ciftSayiAdedi++;
            }
        }
        System.out.println("tekSayiAdedi = " + tekSayiAdedi);
        System.out.println("ciftSayiAdedi = " + ciftSayiAdedi);
    }

}
