package TestCases;

import PageObjects.OpenNewAccount;
import PageObjects.ParaBankLogin;
import org.testng.annotations.Test;

public class TC_OpenNewAccount_006 extends BaseClass{
    @Test
    public void openNewAccount() throws InterruptedException {
        ParaBankLogin para=new ParaBankLogin(driver);
        logger.info("TC_006 Execution started");
        para.enterUsername(paraUsername);
        logger.info("Entered username");
        para.enterPassword(paraPassword);
        logger.info("Entered password");
        para.clickLogin();
        logger.info("Clicked on Log in");
        OpenNewAccount open=new OpenNewAccount(driver);
        open.clickOnOPenNewAccount();
        logger.info("Clicked on open new account");
        open.selectAccountType("SAVINGS");
        logger.info("Selected account as Savings");
        open.selectFromAccount("13566");
        logger.info("Selected from Account");
        open.clickOnSubmit();
        logger.info("Clicked on Submit");
        open.verifyAccountOpened();
        logger.info("Account opened successfully");
        open.getNewAccountId();
        logger.info("TC_006 execution completed");
        Thread.sleep(3000);
    }
}
