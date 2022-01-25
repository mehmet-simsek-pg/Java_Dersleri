package gun47.ornek2;

interface IVehicle {
    // abstract method
    String drive();

    // gövdesi olan interface methodlaridir. Birden fazla olabilir
    // buradaki default ulasimi saglayan modifier degil.
    // Interface methodunun gövdeli sekilde yazilmasini saglayan identifierdir
    default void defaultMethod() {
        System.out.println("interface default method");
    }

    // ayni classlarda oldugu gibi interfacelerde de static method yazilabilir.
    // aynen class static methodlari gibi cagrilir.
    static void autoPilot() {
        System.out.println("interface static method");
    }


}
