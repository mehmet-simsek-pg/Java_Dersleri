package gun32.paket.constructor3;

public class Main {
    public static void main(String[] args) {

        Sirket s1 = new Sirket("Istanbul-1");
        Sirket s2 = new Sirket("Istanbul-2", "AS2");
        Sirket s3 = new Sirket("Istanbul-3", "AS3", "Bakirköy 3");
        Sirket s4 = new Sirket("Istanbul-4", "AS4", "Kadiköy 4", 1001);
        Sirket s5 = new Sirket("3");
        new Sirket();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
