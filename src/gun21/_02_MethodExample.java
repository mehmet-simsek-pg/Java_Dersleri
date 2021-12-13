package gun21;

public class _02_MethodExample {
    public static void main(String[] args) {
        /*
        Faktoriyel hesaplayan bir metot yazin.
        5! -> 5*4*3*2*1 = 120
         */

        faktoriyelHesapla(12);
        faktoriyelHesapla(3);
        faktoriyelHesapla(9);

    }
    public static void faktoriyelHesapla(int num){

        double faktoriyel = 1;
        for (int i = 1; i <= num; i++) {
            faktoriyel*=i;
        }
        System.out.println("faktoriyel = " + faktoriyel);
    }
}
