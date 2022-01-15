package gun40.proje4.Settings;

import java.util.ArrayList;

public class Address {
    // bu field'i degistirmeyiniz
    private static ArrayList<String> cityList = new ArrayList<>();

    //bu method'u degistirmeyiniz
    public void SetCity() {
        cityList.add("New York");
        cityList.add("New Jersey");
        cityList.add("Ohio");
        cityList.add("Pennsylvania");
        cityList.add("Washington");
        cityList.add("Atlanta");
    }

    /*################################################################
        Üç tane  private  String variables oluştur
        Address1
        City
        ZipCode
     */
    //----------------------------------------------------------------------






    /*################################################################
    Address1  methodunu oluştur
    Return türü String
    Parameter  String(myAddress) olmalı

    private Address1 eşittir myAddress
     */
    //----------------------------------------------------------------------






    /*################################################################
        City methodunu olustur
        return türü String
        parameter  String(myCity) olmalı

        if cityList  myCity  içermiyorsa
        We are not able to ship to your location  return et

        Eger ilk condition false ise
        private City  myCity ye eşitle ve return et
     */
    //----------------------------------------------------------------------









    /*################################################################
        Zipcode methodunu oluşturun
        Return türü String
        Parameter  String(myZipcode) olmalı

        if myZipcode length 5 e eşit değilse
        Zip code length should be 5  return et

        Eger ilk condition false ise
        private ZipCode  myZipcode ye eşittir
    */
    //----------------------------------------------------------------------


}
