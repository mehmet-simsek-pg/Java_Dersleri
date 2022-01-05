package gun33.task2;

public class Main {
    /*
    Bir banka class'ı tanımlayınız. Veri kontrollerini ilgili yerlerde yapınız.
    1.	3 adet field ekleyiniz. (id, subeAdi, kasaBakiyesi)
    2.	initialize için 2 adet constructor kullanın.
	3.	paraYatir(int yatirilacakPara); methodu ile bankaya para yatırın.
	4.	paraCek();	methodu ile bankaya para çekin.
	    getBakiye()
    5.	Banka bilgilerini ekrana yazdıracak metodu oluşturun.
        (Şube : Xbank, bakiye : xxx.xx TL)(toString)
	6.	main'de 2 tane banka oluşturup para yatırma ve çekme işlemleri yapın
	7.	olusturdugunuz iki banka arasinda para transferi yapin. (Çözüm düşüneniz nedir)
     */

    public static void main(String[] args) {
        Banka b1 = new Banka(1, "A", 1000);
        Banka b2 = new Banka(2, "B");
        Banka b3 = new Banka(3, "C", -1000);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        /*
        b2.paraYatir(500);
        b3.paraYatir(300);
        b1.paraCek(400);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println("-------------------");
        paraTransferEt(b1, b3, 200);
        paraTransferEt(b3, b2, 50);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

         */

        paraTransferEt(b1, b2, 100);
        System.out.println(b1);
        System.out.println(b2);
        paraTransferEt(b1, b2, 100000);
        System.out.println(b1);
        System.out.println(b2);
    }

    public static void paraTransferEt(Banka odeyecekBanka, Banka alacakBanka, int havaleMiktari){
        if (odeyecekBanka.paraCek(havaleMiktari))
            alacakBanka.paraYatir(havaleMiktari);
        /*
        if (odeyecekBanka.getBakiye()>havaleMiktari)
            alacakBanka.paraYatir(havaleMiktari);
         */
    }
}
