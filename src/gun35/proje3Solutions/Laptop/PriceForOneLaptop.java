package gun35.proje3Solutions.Laptop;

import java.util.ArrayList;

public class PriceForOneLaptop {

    /*
        int getPrice(int laptopID);  methodu veriliyor.
        Bu method, Data class dan AllData methodunu çağıracaktir.
        Bu Methodun Calculation class taki tüm methodları çağırması, price alması ve
        totalAmount return etmesi gerekir.
     */

    Calculation c = new Calculation();

    public int getPrice(int laptopID){
        ArrayList<String> data = new Data().AllData(laptopID);
        c.getRam(data);
        c.getCPU(data);
        c.getColor(data);
        c.getSize(data);
        return c.price;
    }





     /*

        int getDiscount(int amount , int discount);  methodu veriliyor.
        amount'dan (miktar), discount(indirim, % olarak) kadar indirim yapın.
        indirilmiş fiyatı return edin
        Örnek:
        amount = 100 ve discount = 20 ise
        20% indirimden sonra sonuç 80 olmalı
     */

    public int getDiscount(int amount , int discount){

        return (int)(amount*(1 - (double)discount/100));
    }






}
