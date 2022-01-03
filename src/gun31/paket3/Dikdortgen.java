package gun31.paket3;

public class Dikdortgen {
    double x;   // genislik
    double y;   // yukseklik

    // bu statik method Dikdörtgen nesnesi olusturup return ediyor
    public static Dikdortgen getDikdortgen(double taban, double boy){
        Dikdortgen d = new Dikdortgen();
        d.tanimla(taban, boy);
        return d;
    }

    public void tanimla(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getCevre(){
        return 2*(x + y);
    }

    public double getAlan(){
        return x * y;
    }

}
