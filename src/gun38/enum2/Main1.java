package gun38.enum2;

import java.util.ArrayList;

public class Main1 {

    public static void main(String[] args) {
        for (Aylar aylar : Aylar.values()){
            System.out.print(aylar.name() + ", ");
        }
        System.out.println();
        System.out.println("-------------------");
        Aylar[] arr = Aylar.values();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].name() + ", ");
        }

        System.out.println("-----------------------------");

        ArrayList<String> listofGunler = new ArrayList<>(){{
            for (Gunler value : Gunler.values()) {
                add(value.name());
            }

        }};

        String str = "pazar".trim().toUpperCase();
        if (listofGunler.contains(str))
            System.out.println(Gunler.valueOf(str).ordinal()+1);
        else
            System.out.println(str + " seklinde bir Gunler enumi yoktur");


        System.out.println("----------------------");
        boolean varMi = false;
        for (Gunler value : Gunler.values()) {
            if (str.equals(value.name())){
                varMi = true;
                break;
            }
        }
        if (varMi)
            System.out.println(Gunler.valueOf(str).ordinal()+1);
        else
            System.out.println(str + " seklinde bir Gunler enumi yoktur");
    }


    enum Gunler{
        PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESI, PAZAR;
    }

}

