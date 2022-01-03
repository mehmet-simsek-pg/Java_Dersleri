package gun31.paket4;

public class IslemReturnObject {

    double val;


    // bu method return.this ile bu classdan olusturulan ilgili nesneyi return eder.
    // this = bu class"in nesnesidir
    public IslemReturnObject set(double val){
        this.val = val;
        return this;
    }

    public IslemReturnObject topla(double x){
        val += x;
        return this;
    }

    public IslemReturnObject cikar(double x){
        val -= x;
        return this;
    }

    public void yaz(){
        System.out.println("sonuc = " + val);
    }

    /*
        Ödev
        Bu class"a
        carpma, bolme, mod, power, karekök,
        convertToInt,
        Math.floor, Math.ceil, Math.round

     */

}
