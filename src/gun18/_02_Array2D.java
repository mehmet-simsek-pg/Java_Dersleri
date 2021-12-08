package gun18;

public class _02_Array2D {
    public static void main(String[] args) {

        int[][] nums = {{25,34},{22,11},{4,6}}; // bi önceki classtaki ile ayni

        int[][] nums2 = {{2},{23,45},{34,22,56}};
        // düzensiz dizi ve ya tablo

        for (int satir = 0; satir < nums2.length; satir++) {
            for (int sütun = 0; sütun < nums2[satir].length; sütun++) {
                System.out.print(nums2[satir][sütun]+" ");
            }
            System.out.println();
        }
    }
}
