package tests.day12_TestNgFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_DependsOnMethods {


    @Test(priority = 9)
    public void test01(){
        System.out.println("first test");
       // Assert.assertTrue(4>8);
    }

    @Test(dependsOnMethods ="test01" )
    public void test02(){
        System.out.println("Second Test");
    }

    @Test(dependsOnMethods ="test02" )
    public void test03(){
        System.out.println("Third Test");
    }


}
