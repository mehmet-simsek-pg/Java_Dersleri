package gun38.enum1;

public class Main {

    public static void main(String[] args) {

        Aylar ay = Aylar.AGUSTOS;

        System.out.println(ay);
        System.out.println(ay.name());
        System.out.println(ay.ordinal());

        switch (ay){
            case OCAK: System.out.println(31); break;
            case SUBAT: System.out.println(28); break;
            case MART: System.out.println(31); break;
            case NISAN: System.out.println(30); break;
            case MAYIS: System.out.println(31); break;
            case HAZIRAN: System.out.println(30); break;
            case TEMMUZ: System.out.println(31); break;
            case AGUSTOS: System.out.println(31); break;
            case EYLUL: System.out.println(30); break;
            case EKIM: System.out.println(31); break;
            case KASIM: System.out.println(30); break;
            case ARALIK: System.out.println(31); break;

        }

    }
}
