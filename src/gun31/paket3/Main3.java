package gun31.paket3;

public class Main3 {
    // Dikdörtgenini alanini ve cevresini hesaplayacagiz
    // ama burada new kullanilmayacak

    public static void main(String[] args) {

        //var d1 = Dikdortgen.getDikdortgen(2, 3);  // tek satirda tanimlama ve atama olursa var ifadesi kullanilabilir
        Dikdortgen d1 = Dikdortgen.getDikdortgen(2, 3);
        System.out.println(d1.getAlan());
        System.out.println(d1.getCevre());

        System.out.println("----------");

        // Burada olusturulan nesne daha sonra kullanilmayacagi icin bir deiskene atilmadi
        // nesne create edildi ve altindaki method cagrildi.
        System.out.println(Dikdortgen.getDikdortgen(5, 7).getAlan());

    }



}
