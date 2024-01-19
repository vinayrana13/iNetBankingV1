package TestCases;

import PageObjects.AddNewAccount;
import PageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_AddNewAccount_004 extends BaseClass{
    TC_AddCustomer_003 tc=new TC_AddCustomer_003();
    String amount="1350";
    @Test
    public  void addNewAccount() throws InterruptedException, IOException {
        LoginPage lp=new LoginPage(driver);
        logger.info("TC_AddCNewAccount_004 started");
        lp.setUserName(uname);
        logger.info("Entered Username");
        lp.setPassword(pwd);
        logger.info("Entered Password");
        lp.clickSubmit();
        logger.info("Clicked on Submit");

        AddNewAccount ana=new AddNewAccount(driver);
        ana.clickAddNewAccount();
        logger.info("Clicked on Add New Account");
        ana.enterCustomerId(TC_AddCustomer_003.customerid);
        logger.info("Entered the Customer ID");
        ana.selectAccountType("Current");
        logger.info("Selected the account type");
        ana.enterInitialAmount(amount);
        logger.info("Entered the initial deposit amount");
        ana.clickSubmit();
        logger.info("Clicked on Submit");
        Thread.sleep(3000);
        boolean res=driver.getPageSource().contains("Account Generated Successfully!!!");
        if(res==true){
            Assert.assertTrue(true);
            logger.info("Balance added successfully");
            logger.info("TC_AddCNewAccount_004 completed");
        }
        else {
            captureScreen(driver,"addNewAccount");
            logger.info("TC_AddCNewAccount_004 completed");
        }
    }


}
