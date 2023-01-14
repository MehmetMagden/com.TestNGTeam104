package tests.day12_TestNgFramework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C05_SoftAssert {



    @Test
    public void test01(){

        // to use softAssert we need to create an object from the class

        SoftAssert softAssert = new SoftAssert();

        // then use this object to code test cases

        softAssert.assertEquals(6,6);
        System.out.println(" after first assertion");

        softAssert.assertTrue(5>3);
        System.out.println(" after second assertion");

        softAssert.assertFalse(3<1);
        System.out.println(" after Third assertion");



        softAssert.assertAll();

        System.out.println("After all assertions");

    }



}
