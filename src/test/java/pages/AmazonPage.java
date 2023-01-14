package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    /*
    If you are working in a company, most of time you will be working in same website
    And this means you will be using same webelements a lot of time

    instead of locating them again and again, by creating a class just like this one
    we will locate them only once, then we will call them when we need.
     */



    public AmazonPage (){
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(id="twotabsearchtextbox")
    public WebElement amazonSearchBox;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement amazonResultElement;

}
