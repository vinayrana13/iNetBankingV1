package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ParaBankLogin {
    WebDriver ldriver;
    public ParaBankLogin(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    String username="vinay123";
    String password="vinay123";

    @FindBy(xpath = "//input[@name='username']")
    WebElement tbxUsername;

    @FindBy(xpath = "//input[@name='password']")
    WebElement tbxPassword;

    @FindBy(xpath = "//input[@class='button']")
    WebElement btnLogin;

    @FindBy(xpath = "//b[text()='Welcome']")
    WebElement txtWelcome;

    public void enterUsername(String paraUsername){
        tbxUsername.sendKeys(paraUsername);
    }
    public void enterPassword(String paraPassword){
        tbxPassword.sendKeys(paraPassword);
    }
    public void clickLogin(){
        btnLogin.click();
    }

    public void verifyLogin(){
        Assert.assertTrue(txtWelcome.isDisplayed());
    }

}
