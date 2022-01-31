package mentoring.Gun03;



public class ArraysEg03 {
        // Write a program to check if elements of an array are
       // same or not it read from front or back

    public static void main(String[] args) {
        int[] array={1,2,3,2,1};
        int[] array2={1,2,3,3,2,16};
        esitMi(array);
        esitMi(array2);
//        Bu kismi methoda aldik
//        String esitmi= "evet";
//
//        for (int i = 0; i < array.length/2; i++) {
//            if (array[i]!=array[array.length-1-i]){
//               esitmi="hayir";
//                break;
//            }
//        }
//        System.out.println("esitmi = " + esitmi);
    }

    public static void esitMi(int[] dizi){
        String esitmi= "evet";
        for (int i = 0; i < dizi.length/2; i++) {
            if (dizi[i]!=dizi[dizi.length-1-i]){
                esitmi="hayir";
                break;
            }
        }
        System.out.println("esitmi = " + esitmi);
    }

}
