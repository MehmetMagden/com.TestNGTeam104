package tests.day16_testNG_Rapors;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_DataProvider {


    @DataProvider
    public static Object[][] AmazonSearchWords() {

        /*
        To provide data for a test method we can use dataProvider after @Test notation.
        and with DataProvider notation we will create a method which will provide the data.

        only rule you need to follow is creating a two dimensional array
        and return it

         */

        Object[][] arr= {{"Nutella"},{"Java"},{"Apple"},{"Samsung"},{"Bottle"}};


        return arr;
    }

    @Test (dataProvider = "AmazonSearchWords")
    public void searchTest(String keyWordToSearch){

        Driver.getDriver().get("https://www.amazon.com");

        AmazonPage amazonPage = new AmazonPage();

        amazonPage.amazonSearchBox.sendKeys(keyWordToSearch+ Keys.ENTER);

        String actualRestultText = amazonPage.amazonResultElement.getText();

        Assert.assertTrue(actualRestultText.contains(keyWordToSearch));

        //Driver.closeDriver();





    }




}
