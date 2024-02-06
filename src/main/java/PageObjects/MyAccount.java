package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
    WebDriver ldriver;

    public MyAccount(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath="//span[text()='Manage Addresses']")
    WebElement lnkManageAddress;

    @FindBy(xpath = "//span[text()='Change Billing Address']")
    WebElement lnkChangeBillingAddress;

    @FindBy(xpath = "//input[@id='street_1']")
    WebElement tbxStreetAddress;

    @FindBy(xpath = "//input[@id='city']")
    WebElement tbxCity;

    @FindBy(xpath = "//input[@id='zip']")
    WebElement tbxZipCode;

    @FindBy(xpath = "//span[text()='Save Address']")
    WebElement btnSaveAddress;

    @FindBy(xpath = "//div[contains(text(),'saved')]")
    WebElement lblAddressSaved;

    @FindBy(xpath = "//span[contains(text(),'Add New')]")
    WebElement btnAddNewAddress;

    @FindBy(xpath = "//select[@id='region_id']")
    WebElement listProvince;

    @FindBy(xpath = "//option[@value='43']")
    WebElement listNewyork;

    @FindBy(xpath = "//input[@id='telephone']")
    WebElement tbxPhoneNumber;

    public void clickOnManageAddress(){
        lnkManageAddress.click();
    }
    public void clickOnChangeBillingAddress(){
        lnkChangeBillingAddress.click();
    }
    public void enterStreetAddress(String streetAddress){
        tbxStreetAddress.sendKeys(streetAddress);
    }
    public void enterCity(String city){
        tbxCity.sendKeys(city);
    }
    public void enterZipCode(String zipcode){
        tbxZipCode.sendKeys(zipcode);
    }
    public void clickOnSaveAddress(){
        btnSaveAddress.click();
    }

    public void verifyAddressChangedSuccessfully(){
        lblAddressSaved.isDisplayed();
    }
    public void clickOnAddNewAddress(){
        btnAddNewAddress.click();
    }
    public void selectProvince(){
        listProvince.click();
    }
    public void selectProvinceFromList(){
        listNewyork.click();
    }
    public void enterPhoneNumber(String phoneNumber){
        tbxPhoneNumber.sendKeys(phoneNumber.toString());
    }
}
