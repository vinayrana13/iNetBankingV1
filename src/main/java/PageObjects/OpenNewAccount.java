package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenNewAccount extends BaseMethods{

    static String newAccount;

    public OpenNewAccount(WebDriver rdriver) {
        super(rdriver);
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

        clickOn(btnOpenNewAccount);
    }
    public void enterFirstName(String firstName){

        typeInto(tbxFirstName,firstName);
    }
    public void enterLastName(String lastName){

        typeInto(tbxLastName,lastName);
    }

    public void enterEmailAddress(String email){

        typeInto(tbxEmailAddress,email);
    }

    public void enterPassword(String password){

        typeInto(tbxPassword,password);
    }

    public void enterConfirmPassword(String confirmPassword){

        typeInto(tbxConfirmPassword,confirmPassword);
    }
    public void clickOnSubmit(){

        clickOn(btnCreateAccount);
    }
    public void clickLogout(){

        clickOn(btnLogout);
    }

    public void clickOnDropdown(){

        clickOn(btnDropdown);
    }

    public void verifyAccountInfo(){

        lblAccountInformation.isDisplayed();
    }
}
