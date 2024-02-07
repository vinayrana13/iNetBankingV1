package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BaseMethods{

    public MyAccount(WebDriver rdriver) {
        super(rdriver);
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

    @FindBy(xpath = "/html/body/div[2]/main/div[2]/div[2]/div/div[2]/ul/li[4]/a")
    WebElement lnkMyWishList;

    public void clickOnManageAddress(){

        clickOn(lnkManageAddress);
    }
    public void clickOnChangeBillingAddress(){

        clickOn(lnkChangeBillingAddress);
    }
    public void enterStreetAddress(String streetAddress){

        typeInto(tbxStreetAddress,streetAddress);
    }
    public void enterCity(String city){

        typeInto(tbxCity,city);
    }
    public void enterZipCode(String zipcode){

        typeInto(tbxZipCode,zipcode);
    }
    public void clickOnSaveAddress(){

        clickOn(btnSaveAddress);
    }

    public void verifyAddressChangedSuccessfully(){
        lblAddressSaved.isDisplayed();
    }
    public void clickOnAddNewAddress(){

        clickOn(btnAddNewAddress);
    }
    public void selectProvince(){

        clickOn(listProvince);
    }
    public void selectProvinceFromList(){

        clickOn(listNewyork);
    }
    public void enterPhoneNumber(String phoneNumber){

        typeInto(tbxPhoneNumber,phoneNumber.toString());
    }
    public void clickOnMyWishList(){
        clickOn(lnkMyWishList);
    }
}
