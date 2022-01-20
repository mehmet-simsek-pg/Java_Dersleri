package gun44.interface1;

public interface IInterface {
    // interface"in tüm fieldlari public static final"dir
    String isim = "Java";   //


    //interface"in methodlari abstracttir. Gövdesi yoktur. Ve public dirler
    void yaz();

    // java 8 ile gelen özellik, sadece default methodlarin gövdesi yazilir
    // gövdesi oldugu icin tekrar tanimlanmak zorunda degil, ama kullanilabilir
    default void defaultMethod(){
        System.out.println("Interface default method");
    }

    default void defaultMethod1(){
        System.out.println("Interface default method");
    }
}

/*
    interfaceler
        extend edilmezler, implement edilirler
        nesne olusturulamaz, new Olmazlar
        fieldlari public static final"dir
        methodlari public ve gövdesi yoktur.
 */