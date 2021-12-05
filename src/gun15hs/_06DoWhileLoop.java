package gun15hs;

public class _06DoWhileLoop {

    public static void main(String[] args) {

        int i = 10;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("------------");
        i = 10;
        do {
            System.out.println(i);
            i++;
        }while (i < 5);


        System.out.println(i);

    }
}