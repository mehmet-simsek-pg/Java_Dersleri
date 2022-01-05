package gun33.task2;

public class Banka {
    int id;
    String subeAdi;
    int kasaBakiyesi = 0;

    public Banka(int id, String subeAdi) {
        this.id = id;
        this.subeAdi = subeAdi;
    }

    public Banka(int id, String subeAdi, int kasaBakiyesi) {
        this(id, subeAdi);  // constructor cagir ilk satirda olmali
        if (kasaBakiyesi>0)
            this.kasaBakiyesi = kasaBakiyesi;
    }

    public boolean paraYatir(int yatirilacakPara){
        if (yatirilacakPara>0) {
            kasaBakiyesi += yatirilacakPara;
            return true;
        }else
            return false;
    }

    public boolean paraCek(int cekilecekPara){
        if (kasaBakiyesi >= cekilecekPara) {
            kasaBakiyesi -= cekilecekPara;
            return true;
        }else
            return false;

    }

    public int getBakiye(){
        return kasaBakiyesi;
    }

    @Override
    public String toString() {
        return "Banka : " + subeAdi + ", Kasa Bakiyesi = " + kasaBakiyesi;
    }
}
