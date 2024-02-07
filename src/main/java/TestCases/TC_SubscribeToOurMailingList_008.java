package TestCases;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.Subscribe;
import TestData.RandomDataGenerator;
import org.testng.annotations.Test;

public class TC_SubscribeToOurMailingList_008 extends BaseClass{
    String email= RandomDataGenerator.getEmailAddress();
    String fname= RandomDataGenerator.getFirstName();
    String lname= RandomDataGenerator.getLastName();
    String company= RandomDataGenerator.getCompanyName();
    String position=RandomDataGenerator.getPosition();

    @Test
    public void subscribeToMailList(){
        logger.info("TC_SubscribeToOurMailingList_008 execution started");

        logger.info("Navigated to the requested URL");
        LoginPage lp = new LoginPage(driver);
        lp.setUserName(uname);
        logger.info("Entered the Username");
        lp.setPassword(pwd);
        logger.info("Entered the Password");
        lp.clickSubmit();
        logger.info("Clicked on Submit");
        System.out.println(driver.getTitle());
        lp.verifyAccountInfo();
        logger.info("User Successfully Logged in");
        HomePage homePage=new HomePage(driver);
        homePage.clickOnSubscribeOurMailingList();
        logger.info("Clicked on Subscribe our mailing list");
        Subscribe subscribe=new Subscribe(driver);
        subscribe.enterEmailAddress(email);
        logger.info("Entered email address");
        subscribe.enterFirstName(fname);
        logger.info("Entered First Name");
        subscribe.enterLastName(lname);
        logger.info("Entered Last Name");
        subscribe.enterCompanyName(company);
        logger.info("Entered Company Name");
        subscribe.enterPosition(position);
        logger.info("Entered Position");
        subscribe.clickOnSubscribe();
        logger.info("Clicked on Subscribe");
        subscribe.verifyEmailSubscribedSuccessfully();
        logger.info("Verified email added successfully");
        logger.info("TC_SubscribeToOurMailingList_008 execution completed");
    }
}
