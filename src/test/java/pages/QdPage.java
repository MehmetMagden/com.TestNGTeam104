package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QdPage {


    public QdPage (){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()='Log in']")
    public WebElement homePageloginButton;

    @FindBy (id = "login-email")
    public WebElement loginUserEmailTextBox;

    @FindBy(id ="login-password")
    public WebElement passwordTextBox;

    @FindBy (xpath = "//button[text()='Login']")
    public WebElement loginLoginButton;

    @FindBy (linkText = "My courses")
    public WebElement loginMyCoursesButton;




}
