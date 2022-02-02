package gun53.paket5;

public class Ogrenci {
    String isim;
    int numara;
    Ogrenci arkadas;

    public Ogrenci(String isim, int numara) {
        this.isim = isim;
        this.numara = numara;
    }

    public void arkadasAta(Ogrenci arkadas){
        this.arkadas = arkadas;
        if (arkadas.arkadas != this)
            arkadas.arkadasAta(this);
    }

    public void arkadasSil(){
        this.arkadas = null;
    }


    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", numara=" + numara +
                ", arkadas=" + arkadas.isim +
                '}';
    }
}
