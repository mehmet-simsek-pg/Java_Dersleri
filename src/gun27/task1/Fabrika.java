package gun27.task1;

public class Fabrika {
    public static void main(String[] args) {

        Otomobil otomobil1 = new Otomobil(); // 1 tane otomobil1 olusturmus oldum
        // new Otomobil() otomobil1 nesnesi üretir

        // bu otomobilin ozelliklerini belirledim
        otomobil1.renk = "Yesil";
        otomobil1.motorHacmi = 2000;
        otomobil1.kacKapi = 4;
        otomobil1.marka = "BMW";
        otomobil1.modelYili = 2021;

        otomobil1.arabaMarkaVeModel(otomobil1.marka,otomobil1.modelYili);
        System.out.println("otomobil1.renk = " + otomobil1.renk);
        System.out.println("otomobil1.modelYili = " + otomobil1.modelYili);

        System.out.println(otomobil1.marka+" "+otomobil1.renk+" "
                +otomobil1.motorHacmi+" "+otomobil1.kacKapi
                +" "+otomobil1.modelYili);

        //bu parametreler yerine örnegin String marka="mercedes"
        // ve int yil = 2000; yazabiliriz.
        //otomobil1.arabaMarkaVeModel(marka , yil);
        // ya da otomobil1.arabaMarkaVeModel("opel" , 2010);

        otomobil1.markaModelVeRenk(otomobil1.marka,otomobil1.modelYili,otomobil1.renk);

        Otomobil otomobil2 = new Otomobil();

        otomobil2.marka = "Mercedes";
        otomobil2.renk = "gri";
        otomobil2.modelYili = 2010;
        otomobil2.kacKapi = 5;
        otomobil2.motorHacmi = 1200;

        Otobus otobus = new Otobus();

        otobus.marka = "Mercedes";
        otobus.modelYili = 2022;
        otobus.renk = "mavi";
        otobus.motorHacmi = 5000;

        System.out.println("otobus.marka = " + otobus.marka);


    }
}
