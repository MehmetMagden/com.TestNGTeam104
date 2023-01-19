package tests.day17_CrossBrowserTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseCross;

public class C02_WiseQuarterTest extends TestBaseCross {


    @Test
    public void test01(){
        // Go to the WiseQuarter
        driver.get("https://www.wisequarter.com");

        // Test that you reached WiseQuarter
        String actualUrl = driver.getCurrentUrl();
        String expectedUrlWord = "wisequarter";

        Assert.assertTrue(actualUrl.contains(expectedUrlWord));

    }





}
