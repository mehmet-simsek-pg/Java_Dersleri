package gun18;

public class _05_Array2D {
    public static void main(String[] args) {

        /*
        {{"15$","56€","33$"},{"67$","78€"},{"100€"}}
        bu sekilde bir fiyat tablonuz var. dolar olanlari 3 ile,
        euro olan fiyatlari 5 ile carpip toplam fiyati bulun.
         */

        String[][] fiyatlar =  {{"15$","56€","33$"},{"67$","78€"},{"100€"}};
        // toplamda 3 satir var 1. satirda 3 sütun
        // 2. satirda 2 sütun. 3. satirda 1 sütun

        int toplam = 0; // toplam degiskeni disarida oldugu icin if else icerisindeki islemlerin toplam sonucunu alir
        String fiyat = "";

        for (int i = 0; i < fiyatlar.length; i++) {
            for (int j = 0; j < fiyatlar[i].length; j++) {

                if (fiyatlar[i][j].contains("$")){
                    fiyat=fiyatlar[i][j].replaceAll("\\$","");
                    toplam+=Integer.parseInt(fiyat)*3;
                }else {
                    fiyat=fiyatlar[i][j].replaceAll("€","");
                    toplam+=Integer.parseInt(fiyat)*5;
                }
            }
        }
        System.out.println("toplam = " + toplam);


    }
}
