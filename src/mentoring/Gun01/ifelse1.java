package mentoring.Gun01;

public class ifelse1 {
    public static void main(String[] args) {
        int sayi=(int) (Math.random()*10);
        //int sayi = 5;
        System.out.println(sayi);
//        if (sayi>0){
//            System.out.println("1. kisim calisti");
//        }
//
//        if (sayi>3){
//            System.out.println("2. kisim calisti");
//        }
//
//        if (sayi>7){
//            System.out.println("3. kisim calisti");
//        }
        if (sayi < 3) {
            System.out.println("1. kisim calisti");
        } else if (sayi < 6) {
            System.out.println("2. kisim calisti");
        } else if (sayi < 9) {
            System.out.println("3. kisim calisti");
        }else {
            System.out.println("hic biri uymadi");
        }

    }
}
