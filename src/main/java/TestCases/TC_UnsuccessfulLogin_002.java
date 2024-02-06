package TestCases;

import PageObjects.LoginPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_UnsuccessfulLogin_002 extends BaseClass{

    String password="Jonh12345";
    @Test
    public void loginTest() throws IOException {
        logger.info("TC_002 execution started");

        logger.info("Navigated to the requested URL");
        LoginPage lp=new LoginPage(driver);
        lp.setUserName(uname);
        logger.info("Entered the Username");
        lp.setPassword(password);
        logger.info("Entered the Password");
        lp.clickSubmit();
        logger.info("Clicked on Submit");
        System.out.println(driver.getTitle());
        lp.verifyunsuccessfulLogin();
        logger.info("User was not able to Log in");
        logger.info("TC_002 execution completed");

        }
}
