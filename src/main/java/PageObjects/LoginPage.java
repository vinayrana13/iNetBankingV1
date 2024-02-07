package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseMethods{


    public LoginPage(WebDriver rdriver) {
        super(rdriver);
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

        typeInto(txtUserName,uname);
    }

    public void setPassword(String pwd){

        typeInto(txtPassword,pwd);
    }

    public void clickSubmit(){

        clickOn(btnLogin);
    }

    public void clickOnDropdown(){
        clickOn(btnDropdown);
    }

    public void clickLogout(){

        clickOn(btnLogout);
    }

    public void verifyAccountInfo(){

        lblAccountInformation.isDisplayed();
    }
    public void verifyunsuccessfulLogin(){

        lblLoginFailure.isDisplayed();
    }
    public void clickOnMyAccount(){

        clickOn(btnMyAccount);
    }


}
