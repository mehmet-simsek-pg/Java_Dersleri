package gun20hs;

public class _10Varargs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        // varargs'da arr veri kabul eder
        System.out.println(topla1(arr));
        System.out.println(topla2(arr));

        // var args virgülle ayrilmis verileri kabul eder,
        // array kabul etmez
        System.out.println(topla1(1,2,3,4,5));
        System.out.println(topla2(new int[]{1,2,3,4,5}));

        // var args'da veri girme zorunlulugu yoktur
        // array'de zorunludur
        System.out.println(topla1());
        //System.out.println(topla2());
    }


    // parametre varargs
    public static int topla1(int...n){
        int t = 0;
        for (int i : n) {
            t += i;
        }
        return t;
    }

    // parametre array
    public static int topla2(int[] n){
        int t = 0;
        for (int i : n) {
            t += i;
        }
        return t;
    }
}
