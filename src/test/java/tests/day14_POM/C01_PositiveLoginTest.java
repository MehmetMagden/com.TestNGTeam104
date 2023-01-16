package tests.day14_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_PositiveLoginTest {

    @Test
    public void test01(){
        QdPage qdPage = new QdPage();

        Driver.getDriver().get(ConfigReader.getProperty("qdURL"));


      qdPage.homePageloginButton.click();
      qdPage.loginUserEmailTextBox.sendKeys(ConfigReader.getProperty("qdValidUserEmail"));
      qdPage.passwordTextBox.sendKeys(ConfigReader.getProperty("qdValidUserPassword"));
      qdPage.loginLoginButton.click();

        Assert.assertTrue(qdPage.loginMyCoursesButton.isDisplayed());

        Driver.close();



    }




}
