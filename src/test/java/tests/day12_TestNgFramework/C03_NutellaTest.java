package tests.day12_TestNgFramework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_NutellaTest {


    @Test(groups = {"reg1","reg2","smoke"})
    public void test01() {

        ReusableMethods.wait(2);


        // go to the amazon webpage
        Driver.getDriver().get("https://www.amazon.com");

        // search nutella

        AmazonPage amazonPage = new AmazonPage();

        amazonPage.amazonSearchBox.sendKeys("Nutella" + Keys.ENTER);

        //**** instead of locating them we called the webelement from amazonPage class by creating an object from AmazonPage
        //Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella" + Keys.ENTER);

        //test that results have nutella
        String expectedWord = "Nutella";

        String actualText = amazonPage.amazonResultElement.getText();
        //String actualText = Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();

        Assert.assertTrue(actualText.contains(expectedWord));

        Driver.closeDriver();

    }
}
