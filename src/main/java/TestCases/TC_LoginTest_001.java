package TestCases;

import PageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_LoginTest_001 extends BaseClass{

    @Test
    public void loginTest() throws IOException {
        logger.info("TC_001 execution started");

        logger.info("Navigated to the requested URL");
        LoginPage lp=new LoginPage(driver);
        lp.setUserName(uname);
        logger.info("Entered the Username");
        lp.setPassword(pwd);
        logger.info("Entered the Password");
        lp.clickSubmit();
        logger.info("Clicked on Submit");


        if(driver.getTitle().equals(pageTitle))
        {
            Assert.assertTrue(true);
            logger.info("Login Test Passed");
            logger.info("TC_001 execution completed");
        }
        else
        {

            Assert.assertTrue(false);
            logger.info("Login Test Failed");
            logger.info("TC_001 execution completed");
            captureScreen(driver,"loginTest");
        }

    }
}
