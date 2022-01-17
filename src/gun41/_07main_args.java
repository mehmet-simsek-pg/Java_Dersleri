package gun41;

public class _07main_args {

    public static void main(String[] args) {

        int i = 0;
        int j = 1;
        for (String arg : args) {
            System.out.println(++i + ", " + j++ + " : " + arg);
        }

        System.out.println("-----------");


        int a = 1, b = 1;

        System.out.println(a++ + " , " + ++b);
        System.out.println(a + " , " + b);



        /*
            i++ : önce i ile ilgili islemi yap sonra degerini artir
            ++i : önce i"nin degeri artir sonra i ile ilgili islemi yap


         */

    }

}
