package gun4;

public class Ornekler {
    public static void main(String[] args) {

        //1.) Aylik geliriniz 6000 liradir. Ev kirasi 1000 lira, faturalar 1000 liradir.
        // Bu ay ayriyeten ikramiye olarak bir maas daha aldiniz.
        // Tatil icin kenara 2000 lira ayirdiniz. Market ve kiyafet icin ise toplamda 1000
        //lira daha harcadiniz. Ay sonunda elinizde ne kadar para kalmistir?

        int aylikGelir = 6000;
        int evKirasi = 1000;
        int faturalar = 1000;
        int ikramiye = aylikGelir;
        int marketVeKiyafetParasi = 1000;
        int tatilParasi = 2000;

        // int aylikGelir,evKirasi,faturalar,ikramiye,marketParasi,kiyafetParasi,tatilParasi;

        int aySonu = aylikGelir*2-evKirasi-faturalar-marketVeKiyafetParasi-tatilParasi;

        System.out.println("aySonu = " + aySonu);






    }
}
