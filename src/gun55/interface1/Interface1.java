package gun55.interface1;

public interface Interface1 {
    // fieldlar public static final
    String name = "1";

    // interface"in methodlari abstractdir
    void islem();

    default void islem2(){
        System.out.println("default islem 2");
    }

    default void islem3(){
        System.out.println("default islem 3");
    }

}
