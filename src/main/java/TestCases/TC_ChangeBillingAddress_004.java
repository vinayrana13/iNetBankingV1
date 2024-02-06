package TestCases;

import PageObjects.LoginPage;
import PageObjects.MyAccount;
import TestData.RandomDataGenerator;
import org.testng.annotations.Test;

public class TC_ChangeBillingAddress_004 extends BaseClass {

    String streetAddress = RandomDataGenerator.getAddress();
    String city = RandomDataGenerator.getCityName();
    String zipCode = RandomDataGenerator.getPostalCode();

    @Test
    public void changeBillingAddress() {
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
        myAccount.clickOnChangeBillingAddress();
        logger.info("Clicked on Change Billing Address");
        myAccount.enterStreetAddress(streetAddress);
        logger.info("Entered the Street Address");
        myAccount.enterCity(city);
        logger.info("Entered City");
        myAccount.enterZipCode(zipCode);
        logger.info("Entered Zip Code");
        myAccount.clickOnSaveAddress();
        logger.info("Clicked on Save Address");
        myAccount.verifyAddressChangedSuccessfully();
        logger.info("Verified Address Changed Successfully");
        logger.info("TC_ChangeBillingAddress_004 execution completed");
    }
}
