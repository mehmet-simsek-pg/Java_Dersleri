package gun33.task1;

public class MyMath {

    public static double getMax(double x, double y){
        return Math.max(x, y);
    }

    public static double getMax(double x, double y, double z){
        return Math.max(Math.max(x, y), z);
        //double d = Math.max(x, y);
        //return Math.max(d, z);
    }

    public static double getMin(double x, double y){
        return Math.min(x, y);
    }

    public static double getMin(double x, double y, double z){
        return Math.min(Math.min(x, y), z);
        //double d = Math.min(x, y);
        //return Math.min(d, z);
    }

    public static double getMutlak(double x){
        return Math.abs(x);
        /*
        if (x<0)
            return -x;
        else
            return x;
         */
    }

    public static double getUs(double x, double y){
        return Math.pow(x, y);
    }

    public static double getKarekok(double x){
        return Math.sqrt(x);
    }

    public static double getToplam(double...args){
        double toplam = 0;
        for (double x : args) {
            toplam += x;
        }
        return toplam;
    }

    public static double getCarpim(double...args){
        double carpim = 1;
        for (double x : args) {
            carpim *= x;
        }
        return carpim;
    }
}
