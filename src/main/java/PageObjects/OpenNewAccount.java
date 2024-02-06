package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class OpenNewAccount {
    WebDriver ldriver;
    static String newAccount;

    public OpenNewAccount(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//a[@class='action create primary']")
    WebElement btnOpenNewAccount;

    @FindBy(xpath = "//input[@id='firstname']")
    WebElement tbxFirstName;

    @FindBy(xpath = "//input[@id='lastname']")
    WebElement tbxLastName;

    @FindBy(xpath = "//input[@id='email_address']")
    WebElement tbxEmailAddress;

    @FindBy(xpath = "//input[@id='password']")
    WebElement tbxPassword;

    @FindBy(xpath="//input[@id='password-confirmation']")
    WebElement tbxConfirmPassword;

    @FindBy(xpath="//div[@class='actions-toolbar']//div/button/span[text()='Create an Account']")
    WebElement btnCreateAccount;

    @FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
    WebElement btnDropdown;

    @FindBy(xpath = "//li[@class='authorization-link']//a")
    WebElement btnLogout;

    @FindBy(xpath = "//strong[text()='Account Information']")
    WebElement lblAccountInformation;


    public void clickOnOPenNewAccount(){
        btnOpenNewAccount.click();
    }
    public void enterFirstName(String firstName){
        tbxFirstName.sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        tbxLastName.sendKeys(lastName);
    }

    public void enterEmailAddress(String email){
        tbxEmailAddress.sendKeys(email);
    }

    public void enterPassword(String password){
        tbxPassword.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword){
        tbxConfirmPassword.sendKeys(confirmPassword);
    }
    public void clickOnSubmit(){

        btnCreateAccount.click();
    }
    public void clickLogout(){
        btnLogout.click();
    }

    public void clickOnDropdown(){
        btnDropdown.click();
    }

    public void verifyAccountInfo(){
        lblAccountInformation.isDisplayed();
    }
}
