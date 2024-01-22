package TestCases;

import PageObjects.ParaBankLogin;
import org.testng.annotations.Test;

public class TC_ParaBankLogin_005 extends BaseClass{


    @Test
    public void login() {
        ParaBankLogin pbl = new ParaBankLogin(driver);
        logger.info("TC_005 Execution Started");
        pbl.enterUsername(paraUsername);
        logger.info("Entered Username");
        pbl.enterPassword(paraPassword);
        logger.info("Enter Password");
        pbl.clickLogin();
        logger.info("Clicked on Login button");
        pbl.verifyLogin();
        logger.info("User is able to login");
        logger.info("TC_005 execution completed");
    }

}
