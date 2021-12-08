package gun18;

import java.util.Scanner;

public class _04_Array2D {
    public static void main(String[] args) {
        /*
        ögrencilerin vize ve final notlarini girebilecegi
        bir program yazin. Kac ögrenci olacagini da alin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac ogrenci?");
        int ogrSayisi = scanner.nextInt();

        int[][] notlarTablosu = new int[ogrSayisi][2];
        // vize final notu girilecegi icin sütun sayisi 2
        // ama kac ogrenci olacagini bilmedigimiz icin ogrSayisi dedik satir icin

        for (int satir = 0; satir <notlarTablosu.length ; satir++) {
            for (int sütun = 0; sütun < notlarTablosu[satir].length; sütun++) {
                //kac ogrenci olursa olsun toplamda 2 sütun var vize ve final
                // 0. sütun vize notlari, 1. sütun final notlari
                // if kosulu ile vize ve final notlari girmeyi sagladik
                if (sütun==0){
                    System.out.println((satir+1)+". ogrenci "+"vize notu");
                    notlarTablosu[satir][sütun] = scanner.nextInt();
                }else {
                    System.out.println((satir+1)+". ogrenci "+"final notu");
                    notlarTablosu[satir][sütun] = scanner.nextInt();
                }
            }
        }

        // yukarida tabloyu doldurduk bu nested loop ile istedigimiz sekilde notlari yazdirdik
        //(satir+1) olmasinin nedeni indis 0 dan basladigi icin 1. ogrenci yazsin diye yaptik
        for (int satir = 0; satir <notlarTablosu.length ; satir++) {
            for (int sütun = 0; sütun < notlarTablosu[satir].length; sütun++) {
                if (sütun==0){
                    System.out.println((satir+1)+". ogrenci "+"vize notu="+ notlarTablosu[satir][sütun] );
                }else {
                    System.out.println((satir+1)+". ogrenci "+"final notu="+notlarTablosu[satir][sütun]);
                }
            }
        }
    }
}
