package gun39.TryCatch;

public class TryCatch2 {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        // yapacagim islemlerde hata üretebilecek bir islem varsa
        // bu kisim olusabilecek hatayi yakalamak icin try catch icine alinir

        try {
            System.out.println(a/b);
            // bu kisimda hata cikarsa otomatik olarak catct bölümüne atlanir
        }catch (Exception e){
            System.out.println("Bir sayi sifira bölünmez ");
        }
        System.out.println("ilk try catch");

        try {
            System.out.println(a/b);
            // bu kisimda hata cikarsa otomatik olarak catct bölümüne atlanir
        }catch (Exception e){
            e.printStackTrace(); // hatayi yazdirip programi sonlandirir
        }
        System.out.println("ikinci try catch");


    }
}
