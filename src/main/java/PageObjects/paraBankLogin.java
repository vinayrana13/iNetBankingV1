package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paraBankLogin {
    WebDriver ldriver;
    public paraBankLogin(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//input[@name='username']")
    WebElement tbxUsername;

    public void enterUsername(){
        tbxUsername.sendKeys("abc");
    }

}
