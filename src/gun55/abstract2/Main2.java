package gun55.abstract2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        // polymorphism

        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new LinkedList<>();


        Driver chrome = new Chrome("Chrome");
        Driver firefox = new Firefox("Firefox");

        Chrome chrome1 = new Chrome("chrome");
        //methodA(chrome);  //hata verir methodA, Chrome classindan deisken istiyor,
                            // gönderilen chrome -> Driver class"i tanimli
        methodA(chrome1);

        methodC(firefox);   //  medhodC -> Driver class"indan kabul ettigi icin
                            // Hem Driver hem de child class türlerini kabul ediyor
        methodC(chrome);
        methodC(chrome1);


    }

    public static void methodA(Chrome driver){
        System.out.println(driver.getDriver());
    }

    public static void methodB(Firefox driver){
        System.out.println(driver.getDriver());
    }

    public static void methodC(Driver driver){
        System.out.println(driver.getDriver());
    }
}
