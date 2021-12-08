package gun18;

public class _01_Array2D {
    public static void main(String[] args) {

        int[][] nums = new int[3][2]; //birinci [] satir uzunlugu icin
                                        //ikinci [] sütun uzunlugu icin

        nums[0][0]=25;
        nums[0][1]=34;

        nums[1][0]=22;
        nums[1][1]=11;

        nums[2][0]=4;
        nums[2][1]=6;

        // nums.length => satir uzunlugunu verir
        // nums[i].length => sütun uzunlugu verir

        for (int satir = 0; satir < nums.length; satir++) {
            for (int sütun = 0; sütun < nums[satir].length; sütun++) {
                // nums[satir].length o an ki satirda kac sütun olduguna bakar
                System.out.print(nums[satir][sütun]+" ");
            }
            System.out.println();
        }
    }
}
