package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {

    public AutomationExercisePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signUpLoginButtonElement;

    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement newUserSignUpText;

    @FindBy(xpath = "//*[@data-qa='signup-name']")
    public WebElement newUserSignUpNameTextBox;

    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement newUserEmailTextBox;

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement newUserSignUpButton;

    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement enterAccountInformationText;

    @FindBy(id="id_gender1")
    public WebElement genderRadioButton;

    @FindBy(xpath = "//*[@data-qa='create-account']")
    public WebElement registerCreateButton;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//*[@data-qa='continue-button']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedTextInfo;

    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "//*[text()='Account Deleted!']")
    public WebElement accountdeletedText;

    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement lastContinueButton;

    // we are trying to login

    @FindBy (xpath = "//*[@data-qa='login-email']")
    public WebElement loginEmailTextBox;

    @FindBy (xpath = "//*[@data-qa='login-password']")
    public WebElement loginPasswordTextBox;

    @FindBy (xpath = "//*[@data-qa='login-button']")
    public WebElement loginloginButton;

    @FindBy (xpath = "//*[text()='Your email or password is incorrect!']")
    public WebElement invalidLoginInfoText;




}
