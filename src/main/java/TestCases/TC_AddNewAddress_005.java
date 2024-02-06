package TestCases;

import PageObjects.LoginPage;
import PageObjects.MyAccount;
import TestData.RandomDataGenerator;
import com.github.javafaker.PhoneNumber;
import org.testng.annotations.Test;

public class TC_AddNewAddress_005 extends BaseClass{
    String streetAddress = RandomDataGenerator.getAddress();
    String city = RandomDataGenerator.getCityName();
    String zipCode = RandomDataGenerator.getPostalCode();
    String phoneNumber=RandomDataGenerator.getMobileNumber();

    @Test
    public void changeBillingAddress() {
        System.out.println(phoneNumber);
        LoginPage lp = new LoginPage(driver);
        lp.setUserName(uname);
        logger.info("Entered the Username");
        lp.setPassword(pwd);
        logger.info("Entered the Password");
        lp.clickSubmit();
        logger.info("Clicked on Submit");
        lp.clickOnDropdown();
        logger.info("Clicked on dropdown button");
        lp.clickOnMyAccount();
        MyAccount myAccount = new MyAccount(driver);
        myAccount.clickOnManageAddress();
        logger.info("Clicked on Manage Addresses");
        myAccount.clickOnAddNewAddress();
        logger.info("Clicked on Add New Address");
        myAccount.enterStreetAddress(streetAddress);
        logger.info("Entered the Street Address");
        myAccount.enterCity(city);
        logger.info("Entered City");
        myAccount.selectProvince();
        myAccount.selectProvinceFromList();
        logger.info("Selected Province from the list");
        myAccount.enterZipCode(zipCode);
        logger.info("Entered Zip Code");
        myAccount.enterPhoneNumber(phoneNumber);
        logger.info("Entered Phone Number");
        myAccount.clickOnSaveAddress();
        logger.info("Clicked on Save Address");
        myAccount.verifyAddressChangedSuccessfully();
        logger.info("Verified Address Added Successfully");
        logger.info("TC_AddNewAddress_005 execution completed");
    }
}
