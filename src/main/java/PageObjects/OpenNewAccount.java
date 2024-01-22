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
    @FindBy(xpath = "//a[text()='Open New Account']")
    WebElement lnkOpenNewAccount;

    @FindBy(xpath = "//select[@id='type']")
    WebElement drpAccountList;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    WebElement drpFromAccount;

    @FindBy(xpath = "//input[@class='button']")
    WebElement btnOpenNewAccount;

    @FindBy(xpath = "//a[@id='newAccountId']")
    WebElement newAccountID;

    @FindBy(xpath="//h1[contains(text(),'ened')]")
    WebElement newAccountConfirmation;

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
        btnOpenNewAccount.click();
    }
    public void getNewAccountId(){
        newAccount=newAccountID.getText();
        System.out.println("New Account ID is: "+newAccount);
    }
    public void verifyAccountOpened(){
        Assert.assertTrue((newAccountConfirmation).isDisplayed());
    }
}
