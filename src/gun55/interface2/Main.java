package gun55.interface2;

import org.junit.Test;

public class Main {

    @Test
    public void test01(){
        Driver chrome = new Chrome();
        chrome.getDriver();
        yazDriver(chrome);
    }


    @Test
    public void test02(){
        Driver firefox = new Firefox();
        firefox.getDriver();
        yazDriver(firefox);
    }

    @Test
    public void test03(){
        Driver opera = new Opera();
        opera.getDriver();
        yazDriver(opera);
    }

    public static void yazDriver(Driver driver){
        driver.getDriver();
    }

}
