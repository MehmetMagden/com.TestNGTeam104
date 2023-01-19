package tests.day17_CrossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.TestBaseCross;

public class C01_AmazonNutellaSearch extends TestBaseCross {

    @Test
    public void test01(){

        // Go to the amazon homepage
        driver.get(ConfigReader.getProperty("amazonURL"));

        // Search for Nutella
        WebElement amazonSearchTextBox = driver.findElement(By.id("twotabsearchtextbox"));
        amazonSearchTextBox.sendKeys("Nutella"+ Keys.ENTER);

        // Test that restuls have Nutella
        WebElement amazonResultsTextElement =
                driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String expectedResultKeyWord ="Nutella";
        String actualResultText= amazonResultsTextElement.getText();

        Assert.assertTrue(actualResultText.contains(expectedResultKeyWord));




    }



}
