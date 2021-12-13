package gun21;

public class _03_MethodExample {
    public static void main(String[] args) {
        /*
         Bir ögrencinin isminin girildigi ve notlarinin ortalamasini bulan bir metot yazin.
         (Kac not aldigi belli degil)
         */

        ortalamaBul("mehmet",66,77,88,99,100);
        ortalamaBul("abdullah",77,88,99,80,89);
        ortalamaBul("harun",90,67,90,78);
    }
    public static void ortalamaBul(String name, int...notlar){

        int toplamNot = 0;
        for (int i = 0; i < notlar.length; i++) {
            toplamNot+=notlar[i];
        }
        int ortalama = toplamNot/notlar.length;
        System.out.println("Ögrenci "+name+" sinavlardan ortalama "+ortalama+" sonucunu almistir.");
    }
}
