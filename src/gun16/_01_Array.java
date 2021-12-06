package gun16;

public class _01_Array {
    public static void main(String[] args) {

        int intDeger = 35;

        int[] intArray = new int[5]; // 1. tanimlama sekli
        int[] array = {1,4,45,56,78}; // 2. tanimlama sekli

        // 5 tane sayi int deger tutabilir. sayiyi degistirip tutabilecegi
        // sayiyi artirip azaltabilirim. Negatif sayi yazilmaz.
        // 0 1 2 3 4 -> indis numaralari

        intArray[0] = 3;
        intArray[2] = 5;
        intArray[4] = -25;

        for (int i = 0; i < intArray.length; i++) {
            // 1 ve 3.  indislere atama yapilmadi. Dizi int oldugu icin default
            // sifir degeri atandi.
            System.out.println(intArray[i]);
        }
    }
}
