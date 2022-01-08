package gun35.proje3Solutions.Laptop;

import java.util.ArrayList;

public class Calculation {
    int price;

     /*
        Parametresi  ArrayList<String> olan  getRam(); methodunu oluşturun
        Eğer ram 32 gb ise price 300 ekle
        Eğer ram 16 gb ise price 200 ekle
        Eğer ram 8 gb ise price 100 ekle
        Eğer ram 4 gb ise price 50 ekle
        return  price  olmalı.
     */

    public int getRam(ArrayList<String> list){
        switch (list.get(2).toLowerCase()){
            case "32 gb":
                price+=300;
                break;
            case "16 gb":
                price+=200;
                break;
            case "8 gb":
                price+=100;
                break;
            case "4 gb":
                price+=50;
                break;
        }
        return price;
    }



      /*
        Parametresi  ArrayList<String> olan  getCPU(); methodunu oluşturun
        Eğer CPU i3 ise price 200 ekle
        Eğer CPU i5 ise price 300 ekle
        Eğer CPU i7 ise price 500 ekle
        return  price  olmalı
     */

    public int getCPU(ArrayList<String> list){
        switch (list.get(3).toLowerCase()){
            case "i3":
                price+=200;
                break;
            case "i5":
                price+=300;
                break;
            case "i7":
                price+=500;
                break;
        }
        return price;
    }



     /*
        Parametresi  ArrayList<String> olan getColor(); methodunu oluşturun
        return türü int olmalı
        Eğer Color Red ise ise price 400 ekle
        Eğer Color Orange ise price 300 ekle
        Eğer Color Silver ise price 200 ekle
        Eğer Color Black ise price 150 ekle
        return  price  olmalı
     */

    public int getColor(ArrayList<String> list){
        switch (list.get(4).toLowerCase()){
            case "red":
                price+=400;
                break;
            case "orange":
                price+=300;
                break;
            case "silver":
                price+=200;
                break;
            case "black":
                price+=150;
                break;
        }
        return price;
    }




    /*
        Parametresi  ArrayList<String> olan getSize(); methodunu oluşturun
        return türü int olmalı
        Eğer Size "Mini" içeriyorsa price 100 ekle
        Eğer Size "Middle" içeriyorsa price 200 ekle
        Eğer Size "Max" içeriyorsa price 300 ekle
        return  price  olmalı
    */
    public int getSize(ArrayList<String> list){
        String kasa = list.get(1);

        if (kasa.toLowerCase().contains("mini"))
                price+=100;
        else if (kasa.toLowerCase().contains("middle"))
                price+=200;
        else if (kasa.toLowerCase().contains("max"))
                price+=300;
        return price;
    }


}
