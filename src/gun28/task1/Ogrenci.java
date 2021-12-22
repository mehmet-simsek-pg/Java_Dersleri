package gun28.task1;

public class Ogrenci {

    static String name;
    static int intNum;

    public static void main(String[] args) {
        int j;      // local variable, initialize edilmeli
        j = 2;
        int i = 10;
        i *=5;

        System.out.println(i + ", " + j);
        System.out.println(name + ", " + intNum);
        System.out.println(carp(3, 4));

    }

    public static int carp(int a, int b){
        name = "java";
        return a*b;
    }

}
