package mentoring.Gun05;

import java.util.Arrays;
import java.util.TreeSet;

public class SetsEg01 {

    // Given a string, print out all of the unique characters and the number of times it appeared in the string.
    // Example abdcbacdbaacd
    // Output 4a3b3c3d

    public static void main(String[] args) {
        String str="abfdcbaecdbaeafcfdfe";
        String[] array=str.split("");
        TreeSet<String> set=new TreeSet<>(Arrays.asList(array));
        int count=0;
        StringBuilder sonuc= new StringBuilder();
        for (String elemanSet: set){
            for (String elemanArray : array) {
                if (elemanArray.equals(elemanSet)){
                    count++;
                }
            }
            sonuc.append(count).append(elemanSet);
            count=0;
        }
        System.out.println("sonuc = " + sonuc);
    }
}
