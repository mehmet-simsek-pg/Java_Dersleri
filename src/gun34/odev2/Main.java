package gun34.odev2;

public class Main {
    public static void main(String[] args) {
        Isci ali = new Isci("Ali");
        Isci veli = new Isci("Veli");
        Isci hasan = new Isci("Hasan");

        // // grup class'i olusturup gruplari bu sekilde atayabiliriz
        //Grup grup1 = new Grup(ali, veli);
        //System.out.println(grup1);


        ali.setGrupArkadasi(veli);
        veli.setGrupArkadasi(hasan);

        Isyeri isyeri = new Isyeri("Isyeri 1");
        isyeri.setCalisan(ali, veli);
        System.out.println(isyeri);
        //System.out.println(ali);
        //System.out.println(veli);
        //System.out.println(hasan);

        System.out.println(veli.adi);
        System.out.println(veli.grupArkadasi.adi);
        System.out.println(veli.grupArkadasi.grupArkadasi.adi);
        System.out.println(veli.grupArkadasi.grupArkadasi.grupArkadasi.adi);
    }



    //

    /**
     * is yerine static method ile atama bu sekilde yapilabilir
     * bu sekilde statik kullanim yerine isYeri nesnesi icinde yazilabilir
     * @param isyeri    isci atanacak isyeri
     * @param i1        calisan olacak 1. isci
     * @param i2        calisan olacak 2. isci
     */
    public static void isciAta(Isyeri isyeri, Isci i1, Isci i2){
        isyeri.setCalisan(i1);
        isyeri.setCalisan(i2);
    }
}
