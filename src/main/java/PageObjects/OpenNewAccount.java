package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccount {
    WebDriver ldriver;

    public OpenNewAccount(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//a[text()='Open New Account']")
    WebElement lnkOpenNewAccount;

    @FindBy(xpath = "//select[@id='type']")
    WebElement drpAccountList;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    WebElement drpFromAccount;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement btnSubmit;

    public void clickOnOPenNewAccount(){
        lnkOpenNewAccount.click();
    }
    public void selectAccountType(String selectby){
        Select select=new Select(drpAccountList);
        select.selectByVisibleText(selectby);
    }
    public void selectFromAccount(String selectby){
        Select select=new Select(drpFromAccount);
        select.selectByVisibleText(selectby);
    }
    public void clickOnSubmit(){
        btnSubmit.click();
    }
}
