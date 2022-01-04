package gun32.paket.constructor2;

public class Main {
    public static void main(String[] args) {

        Sirket s1 = new Sirket("Istanbul-1", "AS1");
        Sirket s2 = new Sirket("Istanbul-2", "AS2", "Bakirköy 5");
        Sirket s3 = new Sirket("Istanbul-2", "AS2", "Kadiköy 5", 1001);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
