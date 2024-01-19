package PageObjects;

import TestCases.TC_AddCustomer_003;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewAccount extends TC_AddCustomer_003 {
    WebDriver ldriver;
    public AddNewAccount(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    TC_AddCustomer_003 tc3=new TC_AddCustomer_003();
    //String id=tc3.customerid;

    @FindBy(xpath = "//a[contains(text(),'New Accou')]")
    WebElement btnNewAccount;

    @FindBy(xpath = "//input[@name='cusid']")
    WebElement tbxCustomerId;

    @FindBy(xpath="//select[@name='selaccount']")
    WebElement listAccountType;

    @FindBy(xpath = "//input[contains(@name,'depo')]")
    WebElement tbxInitialDeposit;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement btnSubmit;

    public void clickAddNewAccount(){
        btnNewAccount.click();
    }

    public void enterCustomerId(String value){

        tbxCustomerId.sendKeys(value);

    }
    public void selectAccountType(String selectBy){
        Select seelctobj=new Select(listAccountType);
        seelctobj.selectByVisibleText(selectBy);
    }
    public void enterInitialAmount(String amount){
        tbxInitialDeposit.sendKeys(amount);
    }
    public void clickSubmit(){
        btnSubmit.click();
    }


}
