package gun35.proje3Solutions;

import gun35.proje3Solutions.Laptop.PriceForOneLaptop;
import org.junit.Assert;
import org.junit.Test;

public class TestLaptop {


    @Test
    public void test1() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();
        int num = p1.getPrice(1100000);

        int expected = 850;
        Assert.assertEquals("sonuç " + expected + " olmalı ama sizin sonuç " + num, expected, num);
    }

    @Test
    public void test2() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();
        int num = p1.getPrice(1100001);

        int expected = 750;
        Assert.assertEquals("sonuç " + expected + " olmalı ama sizin sonuç " + num, expected, num);
    }


    @Test
    public void test3() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();
        int num = p1.getPrice(1100002);

        int expected = 1100;
        Assert.assertEquals("sonuç " + expected + " olmalı ama sizin sonuç " + num, expected, num);
    }


    @Test
    public void test4() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();
        int num = p1.getPrice(1100003);
        int num2 = p1.getPrice(1100004);
        int total = num + num2;

        total = p1.getDiscount(total, 20);
        int expected = 3240;
        Assert.assertEquals("sonuç " + expected + " olmalı ama sizin sonuç " + total, expected, total);
    }


    @Test
    public void test5() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();
        int num = p1.getPrice(1100006);
        int num2 = p1.getPrice(1100007);
        int total = num + num2;

        total = p1.getDiscount(total, 10);

        int expected = 2520;
        Assert.assertEquals("sonuç " + expected + " olmalı ama sizin sonuç " + total, expected, total);
    }


    @Test
    public void test6() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();
        int num = p1.getPrice(1100005);
        int num2 = p1.getPrice(1100008);
        int total = num + num2;

        total = p1.getDiscount(total, 10);

        int expected = 2700;
        Assert.assertEquals("sonuç " + expected + " olmalı ama sizin sonuç " + total, expected, total);
    }


}
