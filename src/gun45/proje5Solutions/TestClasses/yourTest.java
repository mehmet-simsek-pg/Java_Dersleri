package gun45.proje5Solutions.TestClasses;

import gun45.proje5Solutions.bankAccount.Users;
import org.junit.Assert;
import org.junit.Test;

public class yourTest {

    /*
        Create a Test for method in the Users randomNumberCreader

        Check all possible options
     */

    /*
         Users içindeki randomNumberCreader methodu için Test oluştur

        Tüm olası seçenekleri kontrol edin
     */


    @Test
    public void Test1(){
        int actual = Users.randomNumberCreader();

        Assert.assertTrue("Yanlis Sayi Ürettiniz"
                , actual>=10000000 && actual< 99999999);

    }




    /*
          Users içindeki checkAge için Test oluştur

        Tüm olası seçenekleri kontrol edin

     */


    @Test
    public void TestCheckAge1(){

        String actual = Users.checkAge("25/07/2002");
        String expected = "You should be at least 18 years old to get a credit card.";

        Assert.assertTrue("Olmasi gereken sonuc:\"" + expected + "\" sizin sonuc:\""+ actual + "\"", expected == actual);

    }

    @Test
    public void TestCheckAge2(){

        String actual = Users.checkAge("23/07/2002");
        String expected = "You can get a credit card";


        Assert.assertTrue("Olmasi gereken sonuc:\"" + expected + "\" sizin sonuc:\""+ actual + "\"", expected == actual);


    }

}
