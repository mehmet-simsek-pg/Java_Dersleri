package gun41;

public class _04UncheckedException {

    /*
        Unchecked Exception -> Compiler"in kontrol etmedigi exceptionlardir
        Checked Exception   -> Compiler"in kontrol ettigi exceptionlardir
     */

    public static void main(String[] args) {

        int a = 5;
        int b = 0;
        System.out.println(a/b);
        // unchecked exception, programci dikkat etmeli

    }



    public int num(){
        return 1;
        //System.out.println("asdasdasd");  // compile hatasi verir
    }


    /*
        1.  Compile hatasi  -> kodlar calistirilmadan comüilerin verdigi hatalardir
            ; eksik, return"den sonra kod satirivar, tanimlanmamis degisken var

        2.  Runtime hatasi  -> Program calistirildiktan sonra cikan hatalar
            program calisir sonrasinda, sayi/0, hatali veri girisi,....


        Ayrica (Runtime"da olusan)

        1.  Checked Exceptions     -> Kompiler"in kontrol ettigi ve hata üretebilecek islemler
        2.  Unchecked Exceptions   -> Kompiler"in kontrol edemedigi islemler




     */
}
