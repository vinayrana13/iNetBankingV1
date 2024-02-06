package TestCases;

import PageObjects.LoginPage;
import PageObjects.OpenNewAccount;
import TestData.RandomDataGenerator;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_AddNewAccount_003 extends BaseClass{


    Faker faker;
    String firstname= RandomDataGenerator.getFirstName();
    String lastname=RandomDataGenerator.getLastName();
    static String email=RandomDataGenerator.getEmailAddress();
    static String password=RandomDataGenerator.getUniquePassword();


    @Test
    public  void addNewAccount() throws InterruptedException, IOException {
        System.out.println(email+" "+password);
        LoginPage lp = new LoginPage(driver);
        OpenNewAccount open = new OpenNewAccount(driver);
        logger.info("TC_Add New Account_003 execution started");
        open.clickOnOPenNewAccount();
        logger.info("Clicked on Open New Account");
        open.enterFirstName(firstname);
        logger.info("Entered the First Name");
        open.enterLastName(lastname);
        logger.info("Entered the Last Name");
        open.enterEmailAddress(email);
        logger.info("Entered Email Address");

        open.enterPassword(password);
        logger.info("Entered Password");

        open.enterConfirmPassword(password);
        logger.info("Reentered Password");
        open.clickOnSubmit();
        logger.info("Clicked on Create Account");
        Thread.sleep(3000);
        open.verifyAccountInfo();
        logger.info("Verified Account was successfully created");
        open.clickOnDropdown();
        logger.info("Clicked on Dropdown");
        open.clickLogout();
        logger.info("Clicked on Logout");
        logger.info("TC_AddNewAccount_003 execution completed");


    }

}
