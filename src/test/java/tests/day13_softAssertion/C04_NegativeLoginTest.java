package tests.day13_softAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.Driver;

public class C04_NegativeLoginTest {

    AutomationExercisePage autoPage ;

    @Test(groups = "reg2")
    public void test01(){

        autoPage = new AutomationExercisePage();
        Driver.getDriver().get("http://automationexercise.com");
        autoPage.signUpLoginButtonElement.click();
        autoPage.loginEmailTextBox.sendKeys("qwerrewr@gmail.com");
        autoPage.loginPasswordTextBox.sendKeys("asdfqwer1.");
        autoPage.loginloginButton.click();

        Assert.assertTrue(autoPage.invalidLoginInfoText.isDisplayed());
        //Driver.getDriver().close();
        Driver.closeDriver();


    }

    @Test
    public void test02(){
        autoPage = new AutomationExercisePage();

        Driver.getDriver().get("http://automationexercise.com");
        autoPage.signUpLoginButtonElement.click();
        autoPage.loginEmailTextBox.sendKeys("asdf11dddd@gmail.com");
        autoPage.loginPasswordTextBox.sendKeys("asdfqwer1.sdfsdf");
        autoPage.loginloginButton.click();

        Assert.assertTrue(autoPage.invalidLoginInfoText.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void test03(){
        autoPage = new AutomationExercisePage();

        Driver.getDriver().get("http://automationexercise.com");
        autoPage.signUpLoginButtonElement.click();
        autoPage.loginEmailTextBox.sendKeys("asdf1asdfasdf1dddd@gmail.com");
        autoPage.loginPasswordTextBox.sendKeys("asdfqwer1.sdfsdf");
        autoPage.loginloginButton.click();

        Assert.assertTrue(autoPage.invalidLoginInfoText.isDisplayed());
        Driver.closeDriver();

    }

}
