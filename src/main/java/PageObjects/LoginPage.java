package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver ldriver;

    public LoginPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(name="login[username]")
    WebElement txtUserName;

    @FindBy(name="login[password]")
    WebElement txtPassword;

    @FindBy(name="send")
    WebElement btnLogin;

    @FindBy(xpath = "//li[@class='authorization-link']//a")
    WebElement btnLogout;

    @FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
    WebElement btnDropdown;

    @FindBy(xpath = "//img[@alt='Show your ad here']")
    WebElement lblAccountInformation;

    @FindBy(xpath = "//div[contains(text(),'incorrect')]")
    WebElement lblLoginFailure;

    @FindBy(xpath = "//span[@class='customer-name active']/following-sibling::div[@class='customer-menu']//ul[@class='header links']//li//a[text()='My Account']")
    WebElement btnMyAccount;

    public void setUserName(String uname){
        txtUserName.sendKeys(uname);
    }

    public void setPassword(String pwd){

        txtPassword.sendKeys(pwd);
    }

    public void clickSubmit(){
        btnLogin.click();
    }

    public void clickOnDropdown(){
        btnDropdown.click();
    }

    public void clickLogout(){
        btnLogout.click();
    }

    public void verifyAccountInfo(){
        lblAccountInformation.isDisplayed();
    }
    public void verifyunsuccessfulLogin(){
        lblLoginFailure.isDisplayed();
    }
    public void clickOnMyAccount(){
        btnMyAccount.click();
    }
}
