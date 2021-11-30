package gun11;

public class _01_JavaRandom {
    public static void main(String[] args) {

        double randomSayi1 = Math.random();
        // 0-1 arasindaki rastgele bir sayi üretir. 1 dahil degil

        System.out.println("randomSayi1 = " + randomSayi1);

        int randomSayi2 = (int)(Math.random()*10); //(0,1)
        //0 ile 10 arasinda random bir sayi olusturur. 10 dahil degil
        System.out.println("randomSayi2 = " + randomSayi2);

        int min =3;
        int max =7;
        int randomSayi3 = (int) (Math.random()*((max-min)+1))+min;
        System.out.println("randomSayi3 = " + randomSayi3);
        /*
        maximum ve minimum sayilari verip o aralikta random sayi olusturmak
        icin bu formul kullanilir. Bu kisimda baslangic ve bitis degeri de dahildir

        min -> 0*(...)+min => 3
        max -> (0,99*(5))+min => 7
         */



    }
}
