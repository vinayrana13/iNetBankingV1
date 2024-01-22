package TestCases;

import PageObjects.OpenNewAccount;
import PageObjects.ParaBankLogin;
import org.testng.annotations.Test;

public class TC_OpenNewAccount_006 extends BaseClass{
    @Test
    public void openNewAccount() throws InterruptedException {
        ParaBankLogin para=new ParaBankLogin(driver);

        para.enterUsername(paraUsername);
        para.enterPassword(paraPassword);
        para.clickLogin();
        OpenNewAccount open=new OpenNewAccount(driver);
        open.clickOnOPenNewAccount();
        open.selectAccountType("SAVINGS");
        open.selectFromAccount("16452");
        open.clickOnSubmit();
        Thread.sleep(3000);
    }
}
