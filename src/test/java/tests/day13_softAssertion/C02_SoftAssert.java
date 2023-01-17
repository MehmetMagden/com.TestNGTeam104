package tests.day13_softAssertion;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationExercisePage;
import utilities.Driver;

public class C02_SoftAssert {

    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    //3. Verify that home page is visible successfully
    //4. Click on 'Signup / Login' button
    //5. Verify 'New User Signup!' is visible
    //6. Enter name and email address
    //7. Click 'Signup' button
    //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
    //9. Fill details: Title, Name, Email, Password, Date of birth
    //10. Select checkbox 'Sign up for our newsletter!'
    //11. Select checkbox 'Receive special offers from our partners!'
    //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    //13. Click 'Create Account button'
    //14. Verify that 'ACCOUNT CREATED!' is visible
    //15. Click 'Continue' button
    //16. Verify that 'Logged in as username' is visible
    //17. Click 'Delete Account' button
    //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

    @Test
    public void test01() {

        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");

        //3. Verify that home page is visible successfully

        SoftAssert softAssert = new SoftAssert();

        String expectedURLWord = "automationexercise";
        String actualURL = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualURL.contains(expectedURLWord));

        //4. Click on 'Signup / Login' button
        AutomationExercisePage autoPage = new AutomationExercisePage();
        autoPage.signUpLoginButtonElement.click();

        //5. Verify 'New User Signup!' is visible
        softAssert.assertTrue(autoPage.newUserSignUpText.isDisplayed());

        //6. Enter name and email address
        autoPage.newUserSignUpNameTextBox.sendKeys("hasanaaa");
        autoPage.newUserEmailTextBox.sendKeys("asdf11dddd@gmail.com");

        //7. Click 'Signup' button
        autoPage.newUserSignUpButton.click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        softAssert.assertTrue(autoPage.enterAccountInformationText.isDisplayed());

        //9. Fill details: Title, Name, Email, Password, Date of birth
        //10. Select checkbox 'Sign up for our newsletter!'
        //11. Select checkbox 'Receive special offers from our partners!'
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        //13. Click 'Create Account button'
        autoPage.genderRadioButton.click();

        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());

        actions.
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys("asdfqwer1.").
                sendKeys(Keys.TAB).
                sendKeys("11").
                sendKeys(Keys.TAB).
                sendKeys("1").
                sendKeys(Keys.TAB).
                sendKeys("1999").
                sendKeys(Keys.TAB).
                sendKeys(Keys.SPACE).
                sendKeys(Keys.TAB).
                sendKeys(Keys.SPACE).
                sendKeys(Keys.TAB).
                sendKeys("Hasan").
                sendKeys(Keys.TAB).
                sendKeys("Keykubat").
                sendKeys(Keys.TAB).
                sendKeys(faker.company().name()).  // we did it by using faker class
                sendKeys(Keys.TAB).
                sendKeys("bagcilar sk no 13").
                sendKeys(Keys.TAB).
                sendKeys("Best way ap.").  //
                sendKeys(Keys.TAB).
                sendKeys("Canada").
                sendKeys(Keys.TAB).
                sendKeys("BC").
                sendKeys(Keys.TAB).
                sendKeys("Burnaby").
                sendKeys(Keys.TAB).
                sendKeys("53100").
                sendKeys(Keys.TAB).
                sendKeys("+9034534534534").perform();

        autoPage.registerCreateButton.click();

        //14. Verify that 'ACCOUNT CREATED!' is visible

        softAssert.assertTrue(autoPage.accountCreatedText.isDisplayed());

        //15. Click 'Continue' button
        autoPage.continueButton.click();

        //16. Verify that 'Logged in as username' is visible

        softAssert.assertTrue(autoPage.loggedTextInfo.isDisplayed());

        //17. Click 'Delete Account' button

        //autoPage.deleteAccountButton.click();
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

        //softAssert.assertTrue(autoPage.accountdeletedText.isDisplayed());
        //autoPage.lastContinueButton.click();

        softAssert.assertAll();

        Driver.closeDriver();

    }
}
