package tests.day12_TestNgFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C04_HardAssert {

    /*
    There are two different type of assertion in TestNG
    The first one has same methods like the JUnit
    It will stop working at first failed test
    It is called Hard Assert




     */


    @Test
    public void test01(){

        Assert.assertTrue(6>4);
        System.out.println("after first assert");
        Assert.assertFalse(8<4);
        System.out.println("after second assert");
        Assert.assertTrue(8<17);
        System.out.println("after third assert");
        Assert.assertEquals(6,6);



    }
}
