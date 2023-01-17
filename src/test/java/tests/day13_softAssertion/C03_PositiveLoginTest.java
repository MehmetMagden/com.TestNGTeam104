package tests.day13_softAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.Driver;

public class C03_PositiveLoginTest {

    @Test
    public void test01(){



        // verify that you con login http://automationexercise.com
        AutomationExercisePage autoPage = new AutomationExercisePage();

        // go to the http://automationexercise.com
        Driver.getDriver().get("http://automationexercise/.com");

        // click on signUp button
        autoPage.signUpLoginButtonElement.click();

        // enter the email
        autoPage.loginEmailTextBox.sendKeys("asdf11dddd@gmail.com");

        // enter the password
        autoPage.loginPasswordTextBox.sendKeys("asdfqwer1.");

        // click on login button
        autoPage.loginloginButton.click();

        // verify that you are logged
        Assert.assertTrue(autoPage.loggedTextInfo.isDisplayed());

        Driver.closeDriver();

    }
}
