package gun12;

public class _01_WhileLoop {
    public static void main(String[] args) {
        // Ekrana 3 kere Hello World yazdirin.

        int count = 0;

        while (count<3){ // Parantezler icerisindeki sart saglandigi sürece calisir
            System.out.println("Hello World");
            count++; // count = count + 1; || count+=1;
            // count++ yazmazsak 0<3 durumu hic degismeyecegi icin
            // sonsuz defa Hello World yazar
        }
        /*
        count = 0
        0<3
         System.out.println("Hello World");
         count = 1

         1<3
          System.out.println("Hello World");
          count =2

          2<3
           System.out.println("Hello World");
           count = 3

           3<3 degil döngü bitti

         */

    }
}
