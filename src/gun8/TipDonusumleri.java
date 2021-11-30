package gun8;

public class TipDonusumleri {
    public static void main(String[] args) {

        String str = "1234";
        int intDeger = Integer.parseInt(str);
        // String ifadeyi(sadece sayisal degeri ve bosluk gibi baska karakter olmamasi gerekiyor) integer a cevir
        System.out.println(intDeger);
        double doubleDeger = Double.parseDouble(str);
        // String ifadeyi(sadece sayisal degeri ve bosluk gibi baska karakter olmamasi gerekiyor) double a cevir
        System.out.println(doubleDeger);

        double doubleDegisken = 12;
        int intDegisken = (int) doubleDegisken;
        float f = (float) doubleDegisken;
        // büyük degeri kücük degere atamak icin
        // esitligin sag tarafina kucuk degiskenin tipini parantez icinde yazmak lazim
        //double>float>long>int>short>byte

        int i = 1234;
        String strInt = String.valueOf(i);
        // integer bir degiskeni string degiskene cevirir
        System.out.println(strInt);
        double d = 1234.5;
        String strDouble = String.valueOf(d);
        // double bir degiskeni string degiskene cevirir
        System.out.println(strDouble);

    }
}
