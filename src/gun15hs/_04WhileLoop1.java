package gun15hs;

public class _04WhileLoop1 {

    public static void main(String[] args) {
        //iterable
        /*
            infinite loop
            while (true){

            }
        */
        int i = 0;
        int j = 0;
        while (i < 5){
            System.out.println(++i + " , " + j++ + " , " + (++i * ++j));
        }
        /*                  i               j               EKRAN CIKTISI
                Basta       0               0
                1.Tur       1               1                1           0
                1.Tur       2               2                1           0      4
                2 tur       3               3                3           2
                2 tur       4               4                3           2      16
                3 tur       5               5                5           4
                3 tur       6               6                5           4      36

            ++i  -->   önce i"yi bir artir sonra isleme sokar
            i++  -->   önce i"yi isleme sokar sonra bir artirir


         */

    }
}
