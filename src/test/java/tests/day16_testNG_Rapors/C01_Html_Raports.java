package tests.day16_testNG_Rapors;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_Html_Raports extends TestBaseRapor {

    // go to the amazon website
    // search for Nutella
    // test that results have nutella


    @Test
    public void test01() {

        extentTest = extentReports.createTest("Amazon Nutella Test","When we search for Nutella, Results shuld have Nutella");

        // go to the amazon website
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        extentTest.info("User reached the Amazon Homepage");

        // search for Nutella
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys("Java" + Keys.ENTER);
        extentTest.info("User searched for Nutella on Amazon");

        // test that results have nutella
        String expectedWord = "Nutella";
        String actualResultText = amazonPage.amazonResultElement.getText();
        extentTest.info("System saved the results");

        Assert.assertTrue(actualResultText.contains(expectedWord));
        extentTest.pass("tested that results have Nutella");

    }

}
