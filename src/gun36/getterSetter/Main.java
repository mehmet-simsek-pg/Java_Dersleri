package gun36.getterSetter;

public class Main {
    public static void main(String[] args) {

        Banka b = new Banka(1, "A", 1000);
        System.out.println(b.getSubeNo());
        System.out.println(b.getBakiye());
        b.paraYatir(-100);
        b.paraCek(20000);
        b.paraCek(100);
        System.out.println(b.getBakiye());

    }
}
