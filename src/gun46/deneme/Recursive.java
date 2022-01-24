package gun46.deneme;


public class Recursive {

    public static void main(String[] args) {

        System.out.println(carp(5));
    }



    // recursive functions
    public static int carp(int n){
        if (n==1)
            return 1;
        else
            return n*carp(n-1);
    }
}
