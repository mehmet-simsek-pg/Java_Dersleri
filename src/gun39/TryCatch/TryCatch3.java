package gun39.TryCatch;

import java.io.IOException;
import java.util.ArrayList;

public class TryCatch3 {


    public static void main(String[] args) {
        String str = "Java";

        try{
            System.out.println(str.charAt(100));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(str.charAt(str.length()-1));
        }

        try{
            System.out.println(str.charAt(100));
        }catch (RuntimeException e){
            System.out.println(str.charAt(str.length()-1));
        }

        try{
            System.out.println(str.charAt(100));
        }catch (Exception e){
            System.out.println(str.charAt(str.length()-1));
        }

        try{
            System.out.println(str.charAt(100));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(str.charAt(str.length()-1));
        }


    }
}
