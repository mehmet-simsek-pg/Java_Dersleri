package gun53.paket6;

public class Insan {
    String isim;

    public Insan(String isim) {
        this.isim = isim;
    }

    public void aracaBin(Arac arac){
        if (arac.mevcutYolcu<arac.yolcuKapasitesi) {
            arac.yolcular.add(this);
            arac.mevcutYolcu++;
            System.out.println(isim + " araca bindim");
        }else
            System.out.println("Arac dolu nasil bineyim");

    }

    @Override
    public String toString() {
        return isim;
    }
}
