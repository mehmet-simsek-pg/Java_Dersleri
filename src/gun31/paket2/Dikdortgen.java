package gun31.paket2;

public class Dikdortgen {
    //double x;
    //double y;
    Boyut boyut; //= new Boyut();        // (x, y)

    public void tanimla(double x, double y){
        // boyut create edilmemistir
        boyut = new Boyut();
        boyut.x = x;
        boyut.y = y;
    }

    public void tanimla(Boyut boyut){
        // boyut disarida tanimlanmistir
        this.boyut = boyut;
    }

    public double getCevre(){
        return 2*(boyut.x+ boyut.y);
    }

    public double getAlan(){
        return boyut.x * boyut.y;
    }
}
