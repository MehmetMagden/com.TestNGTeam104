package tests.day13_softAssertion;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_SoftAssert {


    // go to the amazon
    // verify that you are in the amazon webpage
    // search for Nutella
    // Verify that result text has Nutella Keyword
    // search for Java
    // Verify that there are more than 1000 results

    @Test
    public void test01() {
        // go to the amazon
        Driver.getDriver().get("https://www.amazon.com");

        // verify that you are in the amazon webpage
        SoftAssert softAssert = new SoftAssert();

        String expecterURLWord = "Ramazon";
        String actualURL = Driver.getDriver().getCurrentUrl();

        softAssert.assertTrue(actualURL.contains(expecterURLWord), "Url test Failed");


        // search for Nutella

        AmazonPage amazonPage = new AmazonPage();

        amazonPage.amazonSearchBox.sendKeys("Nutella" + Keys.ENTER);

        // Verify that result text has Nutella Keyword
        String expectedResultWord = "Kutella";
        String actualResultText = amazonPage.amazonResultElement.getText();

        softAssert.assertTrue(actualResultText.contains(expectedResultWord), "Nutella Test Failed");

        // search for Java
        amazonPage.amazonSearchBox.clear();
        amazonPage.amazonSearchBox.sendKeys("Java" + Keys.ENTER);

        // Verify that there are more than 1000 results
        String javaResultTextSTR = amazonPage.amazonResultElement.getText();
        //1-48 of over 6,000 results for "Java"

        String[] arr = javaResultTextSTR.split(" ");
        String javaResulsNumberSTR = arr[3]; // 6,000 as str

        String numberStrNoCamma = javaResulsNumberSTR.replaceAll("\\W", "");
        int expectedjavaResultNumber = 1000;
        int actualjavaResultNumber = Integer.parseInt(numberStrNoCamma); // 6000 as int

        softAssert.assertTrue(actualjavaResultNumber > expectedjavaResultNumber, "Result number test failed");

        //ReusableMethods.wait(10);

        softAssert.assertAll();
        Driver.close();

    }


}
