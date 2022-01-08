package gun34.enum1;

public class Main {
    static int num;

    public static void main(String[] args) {
        String ay1 = "Ocak"; // "OCAK", "ocak "
        Aylar ay2 = Aylar.OCAK;

        System.out.println(ay1);
        System.out.println(ay2);
        ay2 = Aylar.HAZIRAN;
        System.out.println(ay2);

        ay2 = Aylar.SUBAT;
        switch (ay2){
            case OCAK:
                System.out.println("Ocak ayindayiz");
                break;
            case SUBAT:
                System.out.println("Subat ayindayiz");
                break;
            default:
                System.out.println("Ay bilinmiyor");
        }
        System.out.println(ay2.toString().toLowerCase());

    }
}
