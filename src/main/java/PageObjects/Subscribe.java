package PageObjects;

import Utilities.XLUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Subscribe extends BaseMethods {
    public Subscribe(WebDriver rdriver) {
        super(rdriver);
    }
    @FindBy(xpath = "//input[@id='mce-EMAIL']")
    WebElement tbxEmailAddress;

    @FindBy(xpath = "//input[@id='mce-FNAME']")
    WebElement tbxFirstName;

    @FindBy(xpath = "//input[@id='mce-LNAME']")
    WebElement tbxLastName;

    @FindBy(xpath = "//input[@id='mce-COMPANY']")
    WebElement tbxCompanyName;

    @FindBy(xpath = "//input[@id='mce-POSITION']")
    WebElement tbxPosition;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement btnSubscribe;

    @FindBy(xpath = "//div[contains(text(),'most')]")
    WebElement lblSuccessfullySubscribed;

    public void enterEmailAddress(String email){
        typeInto(tbxEmailAddress,email);
    }
    public void enterFirstName(String fname){
        typeInto(tbxFirstName,fname);
    }
    public void enterLastName(String lname){
        typeInto(tbxLastName,lname);
    }
    public void enterCompanyName(String cname){
        typeInto(tbxCompanyName,cname);
    }
    public void enterPosition(String position){
        typeInto(tbxPosition,position);
    }
    public void clickOnSubscribe(){
        clickOn(btnSubscribe);
    }
    public void verifyEmailSubscribedSuccessfully(){
        isElementDisplayed(lblSuccessfullySubscribed);
    }


}
