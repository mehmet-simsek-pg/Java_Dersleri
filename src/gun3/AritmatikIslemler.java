package gun3;

public class AritmatikIslemler {
    public static void main(String[] args) {
        //1.) Evde 3 kg elma var. Pazardan 2 kg elma daha aldim. Toplamda ne kadar elmam var?

        int evElma = 2;
        int pazarElma = 3;
       // System.out.println("toplam elma: "+ (evElma+pazarElma));

        //2.) Bir ev aldiniz. Fiyati 200000 TL.
        // Aylik 1200 lira taksit ödeyeceksiniz. Toplam kac ay taksit ödersiniz?

        double evFiyati = 200000;
        double taksitMiktari = 1200;

        double taksitSayisi = evFiyati / taksitMiktari;

        //System.out.println("Toplam taksit sayisi= "+taksitSayisi);

        //3.) Bir partiye davet edildiniz. Parti evinde 20 sise kola var.
        //Sizde 12 sise kola daha götürdünüz. Ama siz gidene kadar 3 sise kola icilmis.
        //Evde toplam kac sise kola var?

        int evdekiKolaMik = 20;
        int bendekiKolaMik = 12;
        int icilenKolaMik = 3;

        int toplamKolaMik = evdekiKolaMik+bendekiKolaMik-icilenKolaMik;

        //System.out.println("Toplam kola miktari = "+toplamKolaMik);

        //4.) Bir köyde 300 hane yasamaktadir. Yazin 50 hane koyden sehre tasinmistir.
        // Ayni yaz koye akraba ziyaretine 110 kisi gelmistir. Koyun toplam miktari ne kadardir?
        //Koyun önceki miktari su an ki miktarindan fayla midir?

        int baslangic = 300;
        int tasinan = 50;
        int tatileGelenler = 110;

        int güncelMik = baslangic-tasinan+tatileGelenler;
        System.out.println("Köydeki toplam miktar = "+güncelMik);

        boolean sonDurum = baslangic>güncelMik;
        System.out.println(sonDurum);


    }
}
