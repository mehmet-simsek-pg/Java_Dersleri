package gun41;

public class _03TryCatchFinally {

    public static void main(String[] args) {


        System.out.println("try öncesi");
        try {
            //hata üretebilecek kodlar
            System.out.println("try");
            int a = 4/0;
            System.out.println("hata sonrasi");
        }catch (Exception e){
            // üretilen hatalarin yakanma yeri
            System.out.println("catch");
        }finally {
            // her halükarda isletilen bölüm
            // try-catch icicn kod bütünlügü icin
            System.out.println("finally");
        }

        System.out.println("try-catch sonrasi");
    }

}

