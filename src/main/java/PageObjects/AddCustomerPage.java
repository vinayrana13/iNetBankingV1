package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
    WebDriver ldriver;
    public String custID;

    public AddCustomerPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//a[contains(text(),'New Cu')]")
    WebElement btnNewCustomer;
    @FindBy(xpath = "//input[@name='name']")
    WebElement txtcustomerName;

    @FindBy (xpath="//input[@value='m']")
    WebElement btngender;

    @FindBy (xpath = "//input[@id='dob']")
    WebElement txtdob;

    @FindBy (xpath = "//textarea[@name='addr']")
    WebElement txtaddress;

    @FindBy (xpath="//input[@name='city']")
    WebElement txtcity;

    @FindBy (xpath="//input[@name='state']")
    WebElement txtstate;

    @FindBy (xpath="//input[@name='pinno']")
    WebElement txtpin;

    @FindBy (xpath = "//input[@name='telephoneno']")
    WebElement txtmobileNumber;

    @FindBy (xpath = "//input[@name='emailid']")
    WebElement txtemailId;

    @FindBy (xpath = "//input[@name='password']")
    WebElement txtpassword;

    @FindBy (xpath = "//input[@value='Submit']")
    WebElement btnSubmit;

    @FindBy(xpath = "//tr//td[text()='Customer ID']/following-sibling::td[1]")
    WebElement customerId;

    public void clickAddNewCustomer(){
        btnNewCustomer.click();
    }

    public void setCustomerName(String customerName){
        txtcustomerName.sendKeys(customerName);
    }

    public void selectGender(){
        btngender.click();
    }

    public void setDOB(String dob){
        txtdob.sendKeys(dob);
    }
    public void setAddress(String address){
        txtaddress.sendKeys(address);
    }
    public void setCity(String city){
        txtcity.sendKeys(city);
    }
    public void setState(String state){
        txtstate.sendKeys(state);
    }
    public void setPin(String pin){
        txtpin.sendKeys(pin);
    }
    public void setMobileNumber(String number){
        txtmobileNumber.sendKeys(number);
    }
    public void setEmailId(String email){
        txtemailId.sendKeys(email);
    }
    public void setPassword(String password){
        txtpassword.sendKeys(password);
    }
    public void clickSubmit(){
        btnSubmit.click();
    }

    public void getCustId(){
        custID=customerId.getText();
        System.out.println(custID);
    }
}
