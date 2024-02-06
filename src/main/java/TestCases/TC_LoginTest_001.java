package TestCases;

import PageObjects.LoginPage;
import TestData.RandomDataGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_LoginTest_001 extends BaseClass{

    @Test
    public void loginTest() throws IOException {
        //String fakename= RandomDataGenerator.getFirstName();
        //System.out.println("Fake name is: "+fakename);


        logger.info("TC_001 execution started");

        logger.info("Navigated to the requested URL");
        LoginPage lp=new LoginPage(driver);
        lp.setUserName(uname);
        logger.info("Entered the Username");
        lp.setPassword(pwd);
        logger.info("Entered the Password");
        lp.clickSubmit();
        logger.info("Clicked on Submit");
        System.out.println(driver.getTitle());
        lp.verifyAccountInfo();
        lp.clickOnDropdown();
        lp.clickLogout();
        logger.info("Clicked on Logout");


        if(driver.getTitle().equals(pageTitle))
        {
            Assert.assertTrue(true);
            logger.info("Login Test Passed");
            logger.info("TC_001 execution completed");
        }


    }
}
