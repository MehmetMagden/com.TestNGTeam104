package tests.day16_testNG_Rapors;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProviderNegativeLoginTest {
    @DataProvider
    public static Object[][] negativeLoginTestDatas() {

        /*

        DDT : TestNG by using dataProvider

         */

        Object [][] arr ={{"A11","A12345"},{"B12","B12345"},{"C13","C12345"},{"D14","D12345"},{"E15","E12345"}};


        return arr;
    }

    // go to the Qualitydemy
    // Use given userNanems and passwords
    // test that if you can login

    // username    Password
    // A11          A12345
    // B12          B12345
    // C13          C12345
    // D14          D12345
    // E15          E12345


    @Test (dataProvider = "negativeLoginTestDatas")
    public void negativeLoginTest(String userEmail,String userPassword){

        Driver.getDriver().get(ConfigReader.getProperty("qdURL"));

        QdPage qdPage = new QdPage();

        qdPage.homePageloginButton.click();
        qdPage.loginUserEmailTextBox.sendKeys(userEmail);
        qdPage.passwordTextBox.sendKeys(userPassword);
        qdPage.loginLoginButton.click();

        Assert.assertTrue(qdPage.loginUserEmailTextBox.isDisplayed());

    }


}
