package gun34.odev2;

public class Isci {
    String adi;
    Isci grupArkadasi;

    /**
     * isci olusturmak icin bos constructor bos isci olusturmak icin
     */
    public Isci() {
    }

    /**
     * Isci nesnesi olusturmak icin constructur
     * @param adi isim aliyor
     */
    public Isci(String adi) {
        this.adi = adi;
        grupArkadasi = new Isci();
    }

    /**
     * bu nesneye gönderilen isciyi bu nesne grup arkadasi olarak alacak ve
     * önce bu isci kendisinin önceki grup arkadasinin hanesinden silmeli
     * @param isci grup arkadasi olarak atanacak isci
     */
    public void setGrupArkadasi(Isci isci){
        this.grupArkadasi.grupArkadasi = null;
        this.grupArkadasi = isci;
        isci.grupArkadasi = this;
    }

    @Override
    public String toString() {
        String str = "Isci{adi=" + adi;
        if (grupArkadasi!= null){
            str += ", grupArkadasi=" + grupArkadasi.adi;
        }
        str+= "}";
        return str;
    }
}
