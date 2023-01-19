package tests.day14_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_NegativeLoginTest {


    // Create 3 test method
    // wrong email valid password
    //V email , W password
    // w email, w password

    QdPage qdPage;

    @Test
    public void wrongEmailTest(){

        ReusableMethods.wait(3);

        qdPage= new QdPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdURL"));
        qdPage.homePageloginButton.click();
        qdPage.loginUserEmailTextBox.sendKeys(ConfigReader.getProperty("qdInvalidUserImail"));
        qdPage.passwordTextBox.sendKeys(ConfigReader.getProperty("qdValidUserPassword"));
        qdPage.loginLoginButton.click();

        Assert.assertTrue(qdPage.loginUserEmailTextBox.isDisplayed());

        Driver.closeDriver();

    }

    @Test(groups = "smoke")
    public void wrongPasswordTest(){

        qdPage = new QdPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdURL"));
        qdPage.homePageloginButton.click();
        qdPage.loginUserEmailTextBox.sendKeys(ConfigReader.getProperty("qdValidUserEmail"));
        qdPage.passwordTextBox.sendKeys(ConfigReader.getProperty("qdInvalidUsarPassword"));
        qdPage.loginLoginButton.click();

        Assert.assertTrue(qdPage.loginUserEmailTextBox.isDisplayed());

        Driver.closeDriver();

    }

    @Test(groups = {"reg1","reg2"})
    public void wrongPasswordAndEmailTest(){

        qdPage = new QdPage();

        Driver.getDriver().get(ConfigReader.getProperty("qdURL"));
        qdPage.homePageloginButton.click();
        qdPage.loginUserEmailTextBox.sendKeys(ConfigReader.getProperty("qdInvalidUserImail"));
        qdPage.passwordTextBox.sendKeys(ConfigReader.getProperty("qdInvalidUsarPassword"));
        qdPage.loginLoginButton.click();

        Assert.assertTrue(qdPage.loginUserEmailTextBox.isDisplayed());

        Driver.closeDriver();

    }


}
