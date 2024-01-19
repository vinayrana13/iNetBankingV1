package TestCases;

import PageObjects.AddCustomerPage;
import PageObjects.LoginPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Set;

public class TC_AddCustomer_003 extends BaseClass{


    @FindBy(xpath = "//tr//td[text()='Customer ID']/following-sibling::td[1]")
    WebElement cusid;
    public static String customerid;



    @Test
    public void addCustomer() throws InterruptedException, IOException {
        LoginPage lp=new LoginPage(driver);
        logger.info("TC_AddCustomer_003 started");
        lp.setUserName(uname);
        logger.info("Entered Username");
        lp.setPassword(pwd);
        logger.info("Entered Password");
        lp.clickSubmit();
        logger.info("Clicked on Submit");
        AddCustomerPage acp=new AddCustomerPage(driver);
        acp.clickAddNewCustomer();
        switchToFrame(driver);
        logger.info("Adding new customer");
        acp.setCustomerName("Rahul");
        logger.info("Entered new customer name");
        acp.selectGender();
        logger.info("Selected customer gender");
        acp.setDOB("10111985");
        logger.info("Entered customer DOB");
        acp.setAddress("A001 Marina Apt");
        logger.info("Entered customer Address");
        acp.setCity("Mumbai");
        logger.info("Entered customer City");
        acp.setState("Maharashtra");
        logger.info("Entered customer State");
        acp.setPin("123456");
        logger.info("Entered Customer PIN");
        acp.setMobileNumber("8546921563");
        logger.info("Entered Customer mobile number");
        String email=randomEmail()+"@gmail.com";
        acp.setEmailId(email);
        logger.info("Entered email address");
        acp.setPassword("abcdef");
        logger.info("Entered Password");
        acp.clickSubmit();
        logger.info("Clicked Submit");
        Thread.sleep(3000);
        boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
        if(res==true){

            Assert.assertTrue(true);
            WebElement custId= driver.findElement(By.xpath("//tr//td[text()='Customer ID']/following-sibling::td[1]"));
            customerid=custId.getText();
            System.out.println(customerid);
            logger.info("Customer added successfully");
            logger.info("TC_AddCustomer_003 completed");

        }
        else {
            captureScreen(driver,"addNewCustomer");
            logger.info("TC_AddCustomer_003 completed");
        }

    }

    public String randomEmail(){
        String generatedEmail= RandomStringUtils.randomAlphabetic(8);
        return (generatedEmail);
    }


}
