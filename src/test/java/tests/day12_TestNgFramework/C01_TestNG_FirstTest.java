package tests.day12_TestNgFramework;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_TestNG_FirstTest {

    /*

    normaly in TestNG test cases will be excecuted accordint to the letters

    The hightest priority will be the lowest number

    If two different test cases have same priority, the order will follow the letters

    if no priority is mentioned, it will be 0 as default


     */


    @Test(priority = 6)
    public void firstTest(){
        System.out.println("First Test was here");
    }

    @Test
    public void secondTest(){
        System.out.println("Second Test was here");
    }

    @Test(priority = 6)
    public void thirdTest(){
        System.out.println("Third Test was here");
    }




}
