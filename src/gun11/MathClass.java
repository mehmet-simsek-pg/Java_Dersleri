package gun11;

public class MathClass {
    public static void main(String[] args) {

        int sayi1 = -15;
        int sayi2 = 4;

        System.out.println("sayi1 nin mutlak deger ="+ Math.abs(sayi1));
        System.out.println("sayi1 ve sayi2 den büyük olan="+ Math.max(sayi1,sayi2));
        System.out.println("sayi1 ve sayi2 den kücük olan="+ Math.min(sayi1,sayi2));
        System.out.println("sayi2 nin karekökü="+ Math.sqrt(sayi2));

        System.out.println("2,4 ve 8 arasindan en büyük olan"+Math.max(2,Math.max(4,8)));

        System.out.println("2. nin 3 üncü kuvveti"+ Math.pow(2,3));



    }
}
