package gun40.proje4.TestPackage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Test2 {


    @Before
    public void before(){
        System.out.println("before");
    }

    @After
    public void after(){
        System.out.println("after");
    }

    @Test
    public void test01(){

        int actual = topla(2,3);

        int expected = 2;

        Assert.assertEquals("Beklenen sonuc " + expected + ", sizin sonuc " + actual, expected, actual);

    }

    @Test
    public void test02(){

        int actual = topla(3,3);

        int expected = 1;

        Assert.assertEquals("Beklenen sonuc " + expected + ", sizin sonuc " + actual, expected, actual);

    }

    public int topla(int a, int b){
        if (a>b)
            return 1;
        else if (a<b)
            return 2;
        return 0;
    }
}
